package hxk.ControllerAdvice;

import hxk.mvc.model.User;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @description
 *2015-4-2  下午8:26:23
 */
@Controller
@RequestMapping("/advise/")
public class TestAdviseAction {
    
    @RequestMapping("date")
    public @ResponseBody String date(User user){
	System.out.println("date: " + user.getBirth());
	return "date";
    }
    
    @RequestMapping("ex")
    public @ResponseBody String exception(){
	System.out.println("exception");
	throw new RuntimeException("wrong");
    }
}
