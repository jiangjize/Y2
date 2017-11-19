package cn.jjz.action;

import cn.jjz.pojo.Rs;
import cn.jjz.service.RsService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.core.StandardReflectionParameterNameDiscoverer;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.persistence.Column;
import java.util.List;

/**
 * Created by lenovo on 2017/10/29.
 */
@Controller
public class RsAction extends ActionSupport {
    private Rs rs;
    @Resource(name = "RsService")
    private RsService rsService;
    @Action(value = "add",results = {@Result(name = "success",location = "/ok.jsp")})
    public String add(){
        rsService.add(rs);
        System.out.println(rs.getName());
        return SUCCESS;
    }

    public Rs getRs() {
        return rs;
    }

    public void setRs(Rs rs) {
        this.rs = rs;
    }

    public RsService getRsService() {
        return rsService;
    }

    public void setRsService(RsService rsService) {
        this.rsService = rsService;
    }
}
