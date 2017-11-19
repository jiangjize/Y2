package cn.jjz.servlet;

import cn.jjz.dao.UserDao;
import cn.jjz.entity.User;
import cn.jjz.util.MyBatisUtil2;
import cn.jjz.util.Page;
import org.apache.ibatis.session.SqlSession;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2017/7/12.
 */
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setCharacterEncoding("UTF-8");
      String act=request.getParameter("act");
        Page page=new Page();
        SqlSession session= MyBatisUtil2.getSqlSession();
        UserDao dao=session.getMapper(UserDao.class);

      if(act!=null) {

          if (act.equals("LodingUserList")) {//1.加载用户列表
                  try {

                  //定义每页显示的记录数
                  int pageSize = 3;
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

                      List<User> list = dao.GetAllUserList((page.getPageIndex() - 1) * pageSize,page.getPageSize());
                     page.setUser(list);
                     request.setAttribute("Page",page);
                      request.setAttribute("UserList", list);
                      request.getRequestDispatcher("userList.jsp").forward(request, response);
                  } catch (Exception e) {
                      e.printStackTrace();
                  }

              }else if (act.equals("Yanzhen")) {
                  String na = request.getParameter("code");
              System.out.println(" :"+na);
                  if(na!=null||na!=""){

              try {
                int i=dao.Yanzhen(na);
              if (i>0) {
                      response.getWriter().write("No!!!");
                  } else {
                      response.getWriter().write("Yes!!!");
                  }
              } catch (Exception e) {
                  e.printStackTrace();
              }
                  }
              } else if (act.equals("Select")) {
                  String name = request.getParameter("name").trim();
                  request.setAttribute("name", name);

                      //定义每页显示的记录数
                      int pageSize = 3;
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
                          int count = dao.GetCountByname(name);
                          if (count % pageSize == 0) {
                              totalpage = count / pageSize;
                          } else {
                              totalpage = count / pageSize + 1;
                          }
                          page.setPagetotalpages(totalpage);
                      List<User> list = dao.SelectUserByNameAndCode(name,(page.getPageIndex() - 1) * pageSize, page.getPageSize());
                      page.setUser(list);
                      request.setAttribute("UserList", list);
                      request.setAttribute("Page", page);
                      request.getRequestDispatcher("userList.jsp").forward(request, response);
                  } catch (Exception e) {
                      e.printStackTrace();
                  }

              } else if (act.equals("AddUser")) {  //2.添加用户
                  try {
                      SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
                      User user = new User();
                      user.setUserCode(request.getParameter("userId"));
                      user.setUserName(request.getParameter("userName"));
                      user.setUserRole(Integer.parseInt(request.getParameter("userrole")));
                      user.setUserPassword(request.getParameter("userRemi"));
                      user.setAddress(request.getParameter("userAddress"));
                      user.setPhone(request.getParameter("userphone"));
                      Date bi=sim.parse(request.getParameter("data"));
                      user.setBirthday(bi);
                      user.setModifyDate(new Date());
                      user.setGender(Integer.parseInt(request.getParameter("gender")));
                      int i = dao.AddUser(user);
                      if (i > 0) {
                          session.commit();
                          session.close();
                          request.getRequestDispatcher("UserServlet?act=LodingUserList").forward(request, response);
                      }
                  } catch (Exception e) {
                      e.printStackTrace();
                  }

              } else if (act.equals("DelUser")) {  //3.删除用户
                  String name = request.getParameter("name");
                  try {
                      int i = dao.DeleTeUser(name);
                      if (i > 0) {
                          session.commit();
                          session.close();
                          request.getRequestDispatcher("UserServlet?act=LodingUserList").forward(request, response);
                      }
                  } catch (Exception e) {
                      e.printStackTrace();
                  }
              }else if(act.equals("Zhuxiao")){
              request.getSession().removeAttribute("n");
              request.getRequestDispatcher("login.jsp").forward(request, response);
          } else if(act.equals("GetUpInfo")){
              String code=request.getParameter("userCode");
              request.setAttribute("code",code);
              String name=request.getParameter("userName");
              request.setAttribute("name",name);
              int gender=Integer.parseInt(request.getParameter("gender"));
              request.setAttribute("gender",gender);
              int role=Integer.parseInt(request.getParameter("userrole"));
              request.setAttribute("role",role);
              String address=request.getParameter("userAddress");
              request.setAttribute("address",address);
              String phone=request.getParameter("userphone");
              request.setAttribute("phone",phone);
              String h= request.getParameter("data");
              Date dd=new Date(h);

              try {
                   String c=new SimpleDateFormat("yyyy-MM-dd").format(dd);
                  System.out.println(c);
              request.setAttribute("birthday",c);
              } catch (Exception e) {
                  e.printStackTrace();
              }
                  request.getRequestDispatcher("/userUpdate.jsp").forward(request,response);
          }else if (act.equals("UpUser")) {    //4.修改用户
              try {
                   User s=new User();
                  String name=  request.getParameter("userName");
                  int role=Integer.parseInt(request.getParameter("userrole"));
                  String phone=request.getParameter("userphone");
                  String add=request.getParameter("userAddress");
                  int gender=Integer.parseInt(request.getParameter("gender"));
                  String dstr=request.getParameter("data");
                 SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
                 Date dd=null;
                 dd=df.parse(dstr);
                  String co=  request.getParameter("userCode");
                  s.setUserCode(co);
                  s.setPhone(phone);
                  s.setUserRole(role);
                  s.setCreationDate(dd);
                  s.setGender(gender);
                  s.setAddress(add);
                  s.setUserName(name);
                  /*int i=dao.UpdetUser(name,add,phone,gender,role,dd,co);*/
                  int i=dao.UpdetUserNew(s);
                  if(i>0){
                      session.commit();
                      session.close();
                      request.getRequestDispatcher("UserServlet?act=LodingUserList").forward(request,response);
                  }
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }

          } else {
              //5.用户登录
              try {
                  String n = request.getParameter("username");
                  String p = request.getParameter("password");
                  int i = dao.Login(n, p);
                      request.getSession().setAttribute("n", n);
                  if (i > 0) {
                      request.getRequestDispatcher("welcome.jsp").forward(request, response);
                  } else {
                      request.getRequestDispatcher("login.jsp").forward(request, response);
                  }
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }
      }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
