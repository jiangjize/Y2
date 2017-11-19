package cn.jjz.servlet;

import cn.jjz.dao.GradeDao;
import cn.jjz.dao.StudentDao;
import cn.jjz.dao.UserDao;
import cn.jjz.entity.GradeInfo;
import cn.jjz.entity.StudentInfo;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.List;

/**
 * Created by lenovo on 2017/8/9.
 */
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String act = request.getParameter("act");
        WebApplicationContext alct = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        UserDao dao = (UserDao) alct.getBean("userdao");
        StudentDao studao = (StudentDao) alct.getBean("studentdao");
        GradeDao gradeDao = (GradeDao) alct.getBean("gradedao");
        if (act != null) {
            ///Login Student Score Manage System
            if (act.equals("Login")) {
                String n = request.getParameter("username");
                request.getSession().setAttribute("name", n);
                String p = request.getParameter("password");
                int i = 0;
                try {
                    i = dao.Login(n, p);
                    if (i > 0) {
                        List<StudentInfo> list = studao.accessStudentInfo();
                        request.setAttribute("stulist", list);
                        List<GradeInfo> glist = gradeDao.selectAllGrade();
                        request.setAttribute("gradelist", glist);
                        request.getRequestDispatcher("html/main.jsp").forward(request, response);
                    } else {
                        request.getRequestDispatcher("html/index.jsp").forward(request, response);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (act.equals("UnLogin")) {
                request.getSession().removeAttribute("name");
                request.getRequestDispatcher("html/index.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("html/index.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
