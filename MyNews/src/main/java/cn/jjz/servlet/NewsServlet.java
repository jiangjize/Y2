package cn.jjz.servlet;

import cn.jjz.dao.NewsDao;
import cn.jjz.dao.TalkDao;
import cn.jjz.entity.News;
import cn.jjz.entity.Talk;
import cn.jjz.util.MyBatisUtil;
import cn.jjz.util.Page;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by lenovo on 2017/7/21.
 */
public class NewsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String act=request.getParameter("act");
         request.setCharacterEncoding("UTF-8");
        Page page=new Page();
        SqlSession session=MyBatisUtil.getSqlSession();
        NewsDao dao= session.getMapper(NewsDao.class);
        TalkDao dao2=session.getMapper(TalkDao.class);
         if(act!=null){
             if(act.equals("A")){
                 try {
                String ti= request.getParameter("title");
                int id=Integer.parseInt(request.getParameter("id"));
                     List<Talk> l= dao2.Gettalk(id);
                 request.setAttribute("title",ti);
                 request.setAttribute("li",l);
                request.getRequestDispatcher("2.jsp").forward(request,response);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
             }else  if(act.equals("B")){
                 try {
                 Talk talk=new Talk();
                String i= request.getParameter("nid");
                     System.out.println(i);
                 talk.setNid(Integer.parseInt(i));
                talk.setContent(request.getParameter("name"));
                     dao2.Add(talk);
                     session.commit();
                     session.close();

                 } catch (Exception e) {
                     e.printStackTrace();
                 }
             }
         }else {
             try {

             //定义每页显示的记录数
             int pageSize = 2;
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
             int count = dao.GetCount();
             if (count % pageSize == 0) {
                 totalpage = count / pageSize;
             } else {
                 totalpage = count / pageSize + 1;
             }
             page.setPagetotalpages(totalpage);
                List<News>list= dao.getNewsList((page.getPageIndex() - 1) * pageSize,page.getPageSize());
                 page.setUser(list);
                 request.setAttribute("Page",page);
                 request.setAttribute("List", list);
                 request.getRequestDispatcher("1.jsp").forward(request, response);
             } catch (Exception e) {
                 e.printStackTrace();
             }
         }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doPost(request,response);
    }
}
