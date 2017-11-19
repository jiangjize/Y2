package cn.jjz.controller.front;

import cn.jjz.entity.Us;
import cn.jjz.service.IUsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by lenovo on 2017/11/15.
 */
@Controller
@RequestMapping("/IFrontUser")
public class IFrontUsCont {
    @Resource(name = "IUsService")
    private IUsService ius;

    @RequestMapping("/Login")
    public String Login(HttpServletRequest request, Us us){
        Us u = ius.Login(us);
        if (u != null && u.getS_uname() != null) {
        request.getSession().setAttribute("user", u);
            return "front";
        }
     return "qiantai/login";
    }
    @RequestMapping("/Zhuxiao")
    public String Zhuxiao(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return "front";
    }
}
