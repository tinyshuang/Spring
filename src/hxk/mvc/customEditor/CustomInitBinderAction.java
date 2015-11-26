package hxk.mvc.customEditor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @description
 *2015-3-31  下午11:28:51
 */
@Controller
@RequestMapping("/custom/")
public class CustomInitBinderAction {
    
    @RequestMapping("reverse")
    public @ResponseBody String reverse(String name){
	System.out.println(name);
	return "reverse";
    }
    
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringReverseEditor());//使用了Spring提供的CustomDateEditor类型转换器
    }
}
