package cn.jjz.action1022;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by lenovo on 2017/10/22.
 */
public class ApiAction implements Action ,SessionAware{
    private Map<String,Object> map;
    public String execute() throws Exception {
        map.put("sessionname",123);
        return SUCCESS;
    }

    public void setSession(Map<String, Object> map) {
              this.map=map;
    }
}
