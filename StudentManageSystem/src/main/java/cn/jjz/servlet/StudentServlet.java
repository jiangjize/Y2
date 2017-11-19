package cn.jjz.servlet;

import cn.jjz.dao.GradeDao;
import cn.jjz.dao.StudentDao;
import cn.jjz.entity.GradeInfo;
import cn.jjz.entity.StudentInfo;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lenovo on 2017/8/9.
 */
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setCharacterEncoding("UTF-8");
      String act= request.getParameter("act");
        WebApplicationContext alct= WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        StudentDao studao=(StudentDao)alct.getBean("studentdao");
        GradeDao gradeDao=(GradeDao) alct.getBean("gradedao");
        if(act!=null){
            if(act.equals("inputresult")){
                StudentInfo s=new StudentInfo();
               int stucode=Integer.parseInt(request.getParameter("stucode"));
               int score=Integer.parseInt(request.getParameter("score"));
               s.setStucode(stucode);
               s.setStuscore(score);
             int i= studao.inputResult(s);
             if(i>0){
                 List<StudentInfo> list= studao.accessStudentInfo();
                 request.setAttribute("stulist",list);
                 List<GradeInfo> glist=gradeDao.selectAllGrade();
                 request.setAttribute("gradelist",glist);
                 /*request.getRequestDispatcher("html/main.jsp").forward(request,response);*/
                 request.getRequestDispatcher("html/uplist.jsp").forward(request,response);
             }
            }else if(act.equals("onConditionQuery")){
                 int stugrade=Integer.parseInt(request.getParameter("stucode"));
                 String name=request.getParameter("stuname");
                StudentInfo studentInfo=new StudentInfo();
                studentInfo.setStugrade(stugrade);
                studentInfo.setStuname(name);
                List<StudentInfo> list=  studao.onConditionQuery(studentInfo);
                request.setAttribute("stulist",list);
                List<GradeInfo> glist=gradeDao.selectAllGrade();
                request.setAttribute("gradelist",glist);
                request.getRequestDispatcher("html/main.jsp").forward(request,response);

            }
        }else {
            List<StudentInfo>list= studao.accessStudentInfo();
            request.setAttribute("stulist",list);
            List<GradeInfo> glist=gradeDao.selectAllGrade();
            request.setAttribute("gradelist",glist);
            request.getRequestDispatcher("html/main.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
