package hxk.mvc;



import hxk.mvc.model.User;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator 使用@InitBinder来定义类型转换器
 * @description
以下解释了使用@InitBinder前后的区别:
1) Before, you had to resort to manually parsing the date:

 public void webmethod(String strDate) {
    Date date = ... // manually parse the date
 }
Now you can get the parsed date directly:

 public void webmethod(Date date) {}
 
 *2015-3-31  下午10:42:35
 */
@Controller
@RequestMapping("/binder/")
public class InitBinderAction {
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));//使用了Spring提供的CustomDateEditor类型转换器
    }

    //使用@InitBinder来类型转换Date与String类型
    @RequestMapping("date")
    public @ResponseBody String date(Date date){
	System.out.println("date: " + date);
	return "date";
    }
    
    //使用@InitBinder来转换实体类里面的Date类型
    @RequestMapping("user")
    public @ResponseBody String user(User user){
	System.out.println("user: " + user.getName() +" birth: " + user.getBirth());
	return "user";
    }
    
    
}
