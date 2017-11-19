package sy.service;

import java.security.Principal;
import java.util.Set;
import javax.annotation.Resource;
import java.util.HashSet;
import org.springframework.security.authentication.jaas.AuthorityGranter;
import sy.model.User;

public class AuthorityGranterImpl implements AuthorityGranter{

    @Resource
    private UserService serviceI;

    public Set<String> grant(Principal principal) {
        String name =  principal.getName();
        System.err.println("DefaultAuthorutyGranter Principal : "+name);

        User user = serviceI.getUserByUserName(name);

        String [] roles = user.getRole().split(",");
        Set<String> authoritys = new HashSet<String>();
        for(String role:roles){
            authoritys.add(role);
        }

        //return Collections.singleton("ROLE_USER");
        return authoritys;
    }

}