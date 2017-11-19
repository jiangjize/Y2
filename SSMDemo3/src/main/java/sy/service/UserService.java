package sy.service;


import sy.model.User;
import javax.annotation.security.RolesAllowed;
public interface UserService {


    User getUserByUserName(String username);

    //spring security方法级别的控制，使用该方法需要的权限
    @RolesAllowed("ROLE_ADMIN")
    User getUserByPrimaryKey(Integer id);
}