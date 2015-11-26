package hxk.handleMapping;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author Administrator
 * @description  请求的拦截器
 * <!-- 当调用由@RequestMapping 声明的请求时,声明拦截器.. -->
 * <!-- 其下有如下三个方法:postHandle(..),postHandle(..),afterCompletion(..).. -->
    <mvc:interceptors>
    	<bean id="officeHoursInterceptor"  class="hxk.handleMapping.TimeBasedAccessInterceptor">
	        <property name="openingTime" value="9"/>
	        <property name="closingTime" value="18"/>
   	    </bean>
    </mvc:interceptors> 
 *2015-4-2  下午9:07:45
 */
public class TimeBasedAccessInterceptor extends HandlerInterceptorAdapter {

    private int openingTime;
    private int closingTime;

    public void setOpeningTime(int openingTime) {
        this.openingTime = openingTime;
    }

    public void setClosingTime(int closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception {
	System.out.println("enter");
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        if (openingTime <= hour && hour < closingTime) {
            return true;
        }
        response.sendRedirect("https://www.baidu.com/");
        return false;
    }
}
