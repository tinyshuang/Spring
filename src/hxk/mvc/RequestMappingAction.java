package hxk.mvc;

import hxk.mvc.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @description
 *2015-3-31  下午9:26:09
 */
@Controller
@RequestMapping("/request/")
public class RequestMappingAction {
    
    //使用{}来用占位符传值给方法
    @RequestMapping("{num}")
    public @ResponseBody String pathValue(@PathVariable int num){
	System.out.println(num);
	return "pathValue";
    }
    
    //使用{}来用占位符传值给方法,第二个例子
    @RequestMapping("/path/{name}")
    public @ResponseBody String pathValues(@PathVariable String name){
	System.out.println(name);
	return "pathValues";
    }
    
    //params字段用来验证传入的参数..
    //关于params参数的应用:params的值可以为"myParam"[存在], "!myParam"[不存在], or "myParam=myValue"[值匹配]
    //http://localhost:8080/Spring/request/params.do?name=apple 正常访问
    //http://localhost:8080/Spring/request/params.do?name=city 直接400
    @RequestMapping(value = "params",params="name=apple")
    public @ResponseBody String params(String name){
	System.out.println(name);
	return "params";
    }
    
    @RequestMapping("test")
    public @ResponseBody String test(User user){
	System.out.println(user.getBirth());
	return "test";
    }
}
