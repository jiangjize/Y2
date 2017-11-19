package cn.jjz.servlet;

import cn.jjz.dao.AttendanceDao;
import cn.jjz.dao.ClassesDao;
import cn.jjz.dao.LoginDao;
import cn.jjz.dao.StudentDao;
import cn.jjz.entity.Attendance;
import cn.jjz.entity.Student;
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
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              request.setCharacterEncoding("UTF-8");
        String act= request.getParameter("act");
        WebApplicationContext alct= WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        ClassesDao classesDao=(ClassesDao) alct.getBean("classesdao");
        StudentDao studentDao=(StudentDao) alct.getBean("studentdao");
        AttendanceDao attendanceDao=(AttendanceDao) alct.getBean("attendancedao");
        if(act!=null){
            if(act.equals("cha")){
                int id=Integer.parseInt(request.getParameter("classesid"));
                Student student=new Student();
                student.setClassesid(id);
                List<Student>list=studentDao.ByclassSelect(student);
                request.setAttribute("sl",list);
                List<Attendance> attendanceList=attendanceDao.AllAtt();
                request.setAttribute("al",attendanceList);
                request.getRequestDispatcher("chuqin.jsp").forward(request,response);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
