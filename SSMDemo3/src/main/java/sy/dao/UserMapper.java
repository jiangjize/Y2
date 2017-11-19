package sy.dao;

import sy.model.User;

/**
 * Created by lenovo on 2017/11/5.
 */
public interface UserMapper {

    User selectByUserName(String username);

    User selectByPrimaryKey(Integer id);
}
