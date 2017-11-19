package cn.jjz.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2017/11/1.
 */
@Controller
public class DemoController {
    @RequestMapping("/a")
    public String a(){
        System.out.println("6666666666");
        return  "main";
    }
}
