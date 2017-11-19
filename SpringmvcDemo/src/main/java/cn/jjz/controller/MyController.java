package cn.jjz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lenovo on 2017/8/16.
 */
public class MyController extends MultiActionController {

    public ModelAndView a(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("hello，SpringMVC");
        ModelAndView m=new ModelAndView();
        m.addObject("n","a");
        m.setViewName("index");
        return m;
    }

    public ModelAndView b(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("hello，SpringMVC");
        ModelAndView m=new ModelAndView();
        m.addObject("n","b");
        m.setViewName("index");
        return m;
    }
}
