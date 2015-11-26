package hxk.aop.around;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @description
 *2015-3-29  下午3:45:10
 */
@Controller
@RequestMapping("/around/")
public class AroundAction {
    
    @RequestMapping("around")
    public @ResponseBody String around(){
	return "around";
    }
    
    @Mark
    @RequestMapping("annotation")
    public @ResponseBody String annotation(){
	return "annotation";
    }
    
    @RequestMapping("arg")
    public @ResponseBody String arg(String name){
	return "args";
    }
    
    @RequestMapping("multliarg")
    public @ResponseBody String multliarg(String name,String other,Integer num){
	return "multliarg";
    }
    
    @RequestMapping("args")
    public @ResponseBody String args(HttpSession session){
	session.setAttribute("name", "args");
	return "args";
    }
    
    @RequestMapping("pass")
    public @ResponseBody String passArgs(String first,Integer second){
	System.out.println(first + " -- " + second);
	return "pass";
    }
    
    
}
