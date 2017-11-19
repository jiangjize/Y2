package cn.jjz.servlet;

import cn.jjz.dao.GradeDao;
import cn.jjz.entity.GradeInfo;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public class GradeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         request.setCharacterEncoding("UTF-8");
         String act= request.getParameter("act");
        WebApplicationContext alct= WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        GradeDao gradeDao=(GradeDao) alct.getBean("gradedao");
        if(act!=null){
           if(act.equals("AddGrade")){
               GradeInfo gradeInfo=new GradeInfo();
               String g=request.getParameter("graname");
               gradeInfo.setGraname(g);
             int i=  gradeDao.addGrade(gradeInfo);
             if(i>0){
                 List<GradeInfo> list= gradeDao.selectAllGrade();
                 request.setAttribute("gradelist",list);
                 request.getRequestDispatcher("html/cate.jsp").forward(request,response);
             }
           } else if(act.equals("UpdateGrade")){

           }else if(act.equals("DeleteGrade")){

           }else if(act.equals("GradeList")){
              List<GradeInfo> list= gradeDao.selectAllGrade();
                 request.setAttribute("gradelist",list);
                 request.getRequestDispatcher("html/cate.jsp").forward(request,response);
            }
        }else{

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
