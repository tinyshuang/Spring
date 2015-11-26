package hxk.aop.bofore;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @description
 *2015-3-29  下午2:54:30
 */
@Aspect
@Component
public class BeforeDemo {
    @Before("execution(* hxk.aop.before.*.*(..))")
    public void log(){
	System.out.println("log");
    }
    
}
