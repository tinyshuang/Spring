package hxk.aop.afterReturn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @description
 *2015-3-29  下午3:28:19
 */
@Controller
@RequestMapping("/after/")
public class AfterReturnAction {
    @RequestMapping("after")
    public @ResponseBody String after(){
	System.out.println("enter after");
	return "after";
    }
}
