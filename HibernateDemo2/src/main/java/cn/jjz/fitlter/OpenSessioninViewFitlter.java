package cn.jjz.fitlter;


import cn.jjz.util.HibernateUtil;
import org.hibernate.Transaction;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by lenovo on 2017/10/9.
 */
public class OpenSessioninViewFitlter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
  /*      chain.doFilter(request, response);*/
        Transaction tx = null;
        try {
            tx = cn.jjz.dao.HibernateUtil.getSession().beginTransaction();
            chain.doFilter(request, response);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
        } finally {
            cn.jjz.dao.HibernateUtil.close();
        }
    }

    public void destroy() {

    }
}
