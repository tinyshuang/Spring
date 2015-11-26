package hxk.aop.afterReturn;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @description 只是一个在方法返回后的切面
 * 以下两个demo :
 * ①方法返回后执行
 * ②方法返回后执行并能取得返回的值
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
