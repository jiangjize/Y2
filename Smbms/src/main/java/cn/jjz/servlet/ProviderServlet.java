package cn.jjz.servlet;

import cn.jjz.dao.ProviderDao;
import cn.jjz.entity.Provider;
import cn.jjz.util.MyBatisUtil2;
import cn.jjz.util.Page;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by lenovo on 2017/7/12.
 */
public class ProviderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        Page page=new Page();
        String act=request.getParameter("act");
        SqlSession session= MyBatisUtil2.getSqlSession();
        ProviderDao dao=session.getMapper(ProviderDao.class);
    if(act.equals("getProviderInfo")) {
        //定义每页显示的记录数
        int pageSize = 4;
        page.setPageSize(pageSize);
        //定义当前页数
        int myIndex = 0;
        String pageIndex = request.getParameter("pageIndex");
        if (pageIndex != null) {
            myIndex = Integer.parseInt(pageIndex);
        } else {
            myIndex = 1;
        }
        page.setPageIndex(myIndex);
        //定义总页数
        int totalpage = 0;
        try {
            int count = dao.getCount();
            if (count % pageSize == 0) {
                totalpage = count / pageSize;
            } else {
                totalpage = count / pageSize + 1;
            }
            page.setPagetotalpages(totalpage);
             List<Provider> list=dao.getProviderInfo((page.getPageIndex() - 1) * pageSize,page.getPageSize());
             page.setProviders(list);
            request.setAttribute("Page",page);
            request.setAttribute("ProList", list);
            request.getRequestDispatcher("providerList.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doPost(request,response);
    }
}
