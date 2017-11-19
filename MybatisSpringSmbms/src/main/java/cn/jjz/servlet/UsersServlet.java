package cn.jjz.servlet;

import cn.jjz.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lenovo on 2017/8/7.
 */
public class UsersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("utf-8");
       String name=request.getParameter("username");
       String pwd=request.getParameter("password");
       /* ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
         UserDao dao=(UserDao) applicationContext.getBean("dao");*/
        WebApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        UserDao dao=(UserDao) applicationContext.getBean("dao");
        System.out.println("-----------："+applicationContext);
        try {
            int i=dao.Login(name,pwd);
            if(i>0){
                request.getRequestDispatcher("/yes.jsp").forward(request,response);
            }else{
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doPost(request,response);
    }
}
