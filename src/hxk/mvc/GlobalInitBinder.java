package hxk.mvc;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/**
 * @author Administrator
 * @description 定义一个全局的类型转换器
 <!--注意全局的initbinder必须放在<mvc:annotation-driven>前面,否则会出400错误  -->
	 <bean class="org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter">
	   <property name="cacheSeconds" value="0" />
	   <property name="webBindingInitializer">
	       <bean class="hxk.mvc.GlobalInitBinder" />
	   </property>
	 </bean> 
 *2015-4-1  上午12:08:09
 */
public class GlobalInitBinder implements WebBindingInitializer {
    @Override  
    public void initBinder(WebDataBinder binder, WebRequest request) {  
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false));  
    }  
}
