package cn.jjz.servlet;

import cn.jjz.dao.ClassesDao;
import cn.jjz.dao.LoginDao;
import cn.jjz.entity.Classes;
import cn.jjz.entity.Login;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by lenovo on 2017/8/11.
 */
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
          String act= request.getParameter("act");
        WebApplicationContext alct= WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
       LoginDao loginDao=(LoginDao) alct.getBean("logdao");
        ClassesDao classesDao=(ClassesDao) alct.getBean("classesdao");
       if(act!=null){

       }else{
        String code=   request.getParameter("logincode");
           String pwd=   request.getParameter("loginpwd");
           Login login=new Login();
           login.setLogincode(code);
           login.setLoginpassword(pwd);
           int i=loginDao.Login(login);
           if(i>0){
                List<Classes> list= classesDao.AllClass();
                request.setAttribute("cl",list);
               request.getRequestDispatcher("index.jsp").forward(request,response);
           }else {
               response.sendRedirect("login.jsp");
           }
       }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doPost(request,response);
    }
}
