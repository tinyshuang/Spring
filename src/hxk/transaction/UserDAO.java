package hxk.transaction;

import java.util.List;

/**
 * @author Administrator
 * @description
 *2015-3-29  下午10:29:06
 */
public interface UserDAO {

    void insertUser(User user);
  	
    User getUser(String username);
  	
    List<User> getUsers();
  }