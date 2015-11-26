package hxk.aop.bofore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @description
 *2015-3-29  下午3:07:14
 */
@Controller
@RequestMapping("/before/")
public class BeforeAction {
    @RequestMapping("enter")
    public @ResponseBody String enter(){
	System.out.println("enter");
	return "before";
    }
}
