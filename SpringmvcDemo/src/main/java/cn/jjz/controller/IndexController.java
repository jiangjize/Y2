package cn.jjz.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lenovo on 2017/8/13.
 */
public class IndexController extends AbstractController {
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("hello，SpringMVC");
        ModelAndView m=new ModelAndView();
        m.setViewName("index");
        return m;
    }
}
