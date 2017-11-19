package cn.jjz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2017/8/16.
 */
@Controller
public class IndexC {
   @RequestMapping("/index")
    public String a(){
        System.out.println("a");
        return "index";
    }

}
