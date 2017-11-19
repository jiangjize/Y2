package cn.tms.controller;

import cn.tms.entity.DicInfo;
import cn.tms.entity.Privilege;
import cn.tms.entity.UserInfo;
import cn.tms.service.IDicInfoService;
import cn.tms.service.IPrivilegeService;
import cn.tms.service.IUserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Happy on 2017-08-21.
 */
@Controller
@RequestMapping("/user")
public class UserInfoController {

    //植入用户的service
    @Resource(name ="useService" )
    IUserInfoService userInfoService;

    //植入字典的Service
    @Resource(name = "dicService")
    IDicInfoService dicInfoService;

    //植入权限的Service
    @Resource(name = "privilegeService")
    IPrivilegeService privilegeService;
    //登录方法
    @RequestMapping("/doLogin")
    @ResponseBody
    public Object doLogin(HttpSession session,UserInfo info){
        UserInfo user = userInfoService.isLogin(info);
        if (user!=null&&user.getUsername()!=null){
            //登录成功,将用户名放入Session
            session.setAttribute("userinfo",user);
            return "y";
        }else {
            //登录失败
            return "login";
        }
    }
    //转向系统主界面
    @RequestMapping("/doMain")
    public String doMain(HttpSession session,Model model){
        //新的容器 保存有父子关系的权限
        List<Privilege> rootMenus=new ArrayList<Privilege>();
        UserInfo user= (UserInfo)session.getAttribute("userinfo");
        //保存的是平级的权限集合  使用内存级别的手段，构造成有关系的权限集合
        List<Privilege> privilegeList = privilegeService.getAllPrivilegesByEmpId(user.getUserid().toString());
        for (Privilege item:privilegeList){
            Privilege childMenu=item;
            int pid = childMenu.getParent();
            if (pid==0){
                rootMenus.add(item);
            }else{
                for (Privilege innerMenu:privilegeList){
                    Integer id = innerMenu.getId();
                    if (id==pid){
                        Privilege parentMenu=innerMenu;
                        parentMenu.getChildren().add(childMenu);
                        break;
                    }
                }
            }
        }
        model.addAttribute("privilegeList",rootMenus);
        return "main";
    }
    //转向机房和教员设定界面
    @RequestMapping("/labWeekSet")
   public String labWeekSet(){
        return "/page/userManage";
   }

}
