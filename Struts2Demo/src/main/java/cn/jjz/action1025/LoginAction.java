package cn.jjz.action1025;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by lenovo on 2017/10/25.
 */
public class LoginAction extends ActionSupport {
    private String username;
    public String Login(){
        if (username!=null) {

            Map<String, Object> map = ActionContext.getContext().getSession();
            System.out.println("输入的值" + username);
            map.put("name", username);
            if (username != null) {
                return SUCCESS;
            } else {
                return INPUT;
            }
        }else {
            Map<String,Object> m=ActionContext.getContext().getSession();
            if (m.get("name")!=null)
            return SUCCESS;
            else
                return INPUT;
        }
        }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
