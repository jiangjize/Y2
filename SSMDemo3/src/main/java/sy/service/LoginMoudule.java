package sy.service;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginException;
import java.util.Map;

/**
 * Created by lenovo on 2017/11/5.
 */
public interface LoginMoudule {
    public void initialize(Subject subject, CallbackHandler callbackHandler, Map<String, ?> sharedState,
                           Map<String, ?> options);
    public boolean login() throws LoginException;
    public boolean commit() throws LoginException;
    public boolean abort() throws LoginException;
    public boolean logout() throws LoginException;
}
