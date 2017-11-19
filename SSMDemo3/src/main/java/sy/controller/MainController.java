package sy.controller;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sy.model.User;
import sy.service.UserService;

@Controller
@RequestMapping("/main")
public class MainController {
    protected static Logger logger = Logger.getLogger("controller");

    private UserService sevice;

    @Autowired
    public void setSevice(UserService sevice) {
        this.sevice = sevice;
    }

    /**
     * 跳转到commonpage页面
     *
     * @return
     */
    @RequestMapping(value = "/common", method = RequestMethod.GET)
    public String getCommonPage() {
        //这里是为spring security在方法级别的控制而准备的，getUserByPrimary方法，需要RELE_ADMIN权限
        User user = sevice.getUserByPrimaryKey(1);
        System.err.println("---------"+user.getUsername());
        logger.debug("Received request to show common page");
        return "commonpage";
    }

    /**
     * 跳转到adminpage页面
     *
     * @return
     */
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getAadminPage() {
        logger.debug("Received request to show admin page");
        return "adminpage";

    }

}