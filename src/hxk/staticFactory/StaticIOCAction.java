package hxk.staticFactory;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @description 依赖注入时不使用默认的构造的方法,使用静态的工厂方法..
 * public static StaticInstance creInstance(){
 *	return instance;
 *   }
 * beans配置: <bean id="staticInstance"  class="hxk.staticFactory.StaticInstance"  factory-method="creInstance"></bean>  
 *2015-3-29  下午1:14:16
 */
@Controller
@RequestMapping("/static")
public class StaticIOCAction {
    private StaticInstance instance;

    @Resource
    public void setInstance(StaticInstance instance) {
        this.instance = instance;
    }
    
    @RequestMapping("show")
    public String show(HttpServletRequest request){
	request.setAttribute("name", instance.getName());
	return "staticFactory/index";
    }
}
