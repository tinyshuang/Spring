package hxk.transaction;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @description  事务的例子
 *2015-3-29  下午10:41:24
 */
@Controller
@RequestMapping("/tx/")
public class UserAction {
   
    private UserManager userManager;
    
    @Resource	
    public void setUserManager(UserManager userManager) {
	this.userManager = userManager;
    }

    @RequestMapping("add")
    public @ResponseBody String add(){
	User user = new User();
	user.setUsername("hxk1");
	user.setName("tinys1");
	userManager.insertUser(user);
	return "success";
    }
    
    @RequestMapping("save")
    public @ResponseBody String save(){
	User user = new User();
	user.setUsername("hxk1");
	user.setName("tinys1");
	userManager.insertUser(user);
	return "success";
    }
    
    @RequestMapping("success")
    public @ResponseBody String saveSucess(){
	User user = new User();
	user.setUsername("hxk1");
	user.setName("tinys1");
	userManager.success(user);
	return "success";
    }
    
    
}
