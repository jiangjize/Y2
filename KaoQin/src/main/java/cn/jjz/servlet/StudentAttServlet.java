package cn.jjz.servlet;

import cn.jjz.dao.StudentattendanceDao;
import cn.jjz.entity.Studentattendance;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by lenovo on 2017/8/11.
 */
public class StudentAttServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String act= request.getParameter("act");
        WebApplicationContext alct= WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
       StudentattendanceDao studentattendanceDao=(StudentattendanceDao) alct.getBean("Studentattendancedao");
       if(act!=null){
           if(act.equals("add")){
               Studentattendance s=new Studentattendance();
               s.setAttendancetime(new Date());
               s.setAttendanceid(Integer.parseInt(request.getParameter("ba")));
               s.setStudentid(Integer.parseInt(request.getParameter("aa")));
               int i=studentattendanceDao.Add(s);
               if(i>0){
                   request.getRequestDispatcher("").forward(request,response);
               }
           }
       }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           doPost(request,response);
    }
}
