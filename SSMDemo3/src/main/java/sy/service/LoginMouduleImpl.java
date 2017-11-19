package sy.service;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

/**
 * Created by lenovo on 2017/11/5.
 */
public class LoginMouduleImpl implements LoginMoudule {
    private Subject subject;
    private CallbackHandler callbackHandler;
    private String username;
    private String password;
    private Map sharedState;
    private Map options;

    private String url;
    private String driver;
    private String db_username;
    private String db_password;

    public void initialize(Subject subject, CallbackHandler callbackHandler, Map<String, ?> sharedState,
                           Map<String, ?> options) {
        this.subject = subject;
        this.callbackHandler = callbackHandler;
        this.sharedState = sharedState;
        this.options = options;

        url = (String) options.get("url");
        driver = (String) options.get("driver");
        db_username = (String) options.get("db_username");
        db_password = (String) options.get("db_password");

        /**
         * 页面上的username 和password 由NameCallBack 和PasswordCallBack两个去获取
         * 有callbackHandler去回调，然后再把他们获取出来
         */
        try {
            //TextInputCallback textInputCallback = new TextInputCallback("prompt");
            NameCallback nameCallback = new NameCallback("prompt");
            PasswordCallback passwordCallback = new PasswordCallback("prompt", false);
            callbackHandler.handle(new Callback[] { nameCallback, passwordCallback });

            username = nameCallback.getName();
            password = new String(passwordCallback.getPassword());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedCallbackException e) {
            e.printStackTrace();
        }

    }

    public boolean login() throws LoginException {
        // 1.Query and compare
        // 2.用户名和密码对比正确 返回true，错误返回false
        System.out.println("driver " + driver);
        System.out.println("url " + url);
        System.out.println("db_username " + db_username);
        System.out.println("db_password " + db_password);

        System.out.println("user " + username);
        System.out.println("password " + password);

        String dpwd = "";
        // String dtype = "";

        boolean flag = false;

        // 校验用户
		/*String sql = "select tp.name, tps.secretcode, tc.type from tperson tp "
				+ "inner join tcorp tc on tp.corpid = tc.objid "
				+ "inner join tpersonpsw tps on tp.objid = tps.objid where tp.name = ?";*/

        String sql = "select * from sec_user where username = ?";
        // 1.注册驱动
        // 2.获得连接
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, db_username, db_password);
            // 3.创建statement
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            // 4.执行sql语句返回结果
            rs = ps.executeQuery();

            while (rs != null && rs.next()) {
                dpwd = rs.getString("password");
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(flag == false){throw new LoginException("User is not exist !");
        }

        if (dpwd.equals(password)) {
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username,
                    password);
            subject.getPrincipals().add(authenticationToken);
            return true;
        } else {
            throw new LoginException("Username is not match the password ! ");
        }
    }

    public boolean commit() throws LoginException {
        return true;
    }

    public boolean abort() throws LoginException {
        return true;
    }

    public boolean logout() throws LoginException {
        return true;
    }


}
