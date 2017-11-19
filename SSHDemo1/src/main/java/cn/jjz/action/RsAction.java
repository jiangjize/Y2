package cn.jjz.action;

import cn.jjz.pojo.Rs;
import cn.jjz.service.RsService;
import com.opensymphony.xwork2.ActionSupport;


/**
 * Created by lenovo on 2017/10/29.
 */
public class RsAction extends ActionSupport {
    private Rs rs;
    private RsService rsService;
    public String add(){
        rsService.add(rs);
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
