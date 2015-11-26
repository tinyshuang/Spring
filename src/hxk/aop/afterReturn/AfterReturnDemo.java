package hxk.aop.afterReturn;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @description
 *2015-3-29  下午3:25:17
 */
@Aspect
@Component
public class AfterReturnDemo {
    
    @AfterReturning("execution(* hxk..afterReturn.*.*(..))")
    public void after(){
	System.out.println("After return the value");
    }
    
    @AfterReturning(pointcut="execution(* hxk..afterReturn.*.*(..))",returning="val")
    public void getReturnValue(Object val){
	System.out.println("get the return val: " + val );
    }
}
