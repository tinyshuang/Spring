package hxk.aop.around;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @description
 *2015-3-29  下午3:42:16
 */
@Aspect
@Component
public class AroundAspect {
    @Around("execution(* hxk..around.*.around(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        // start stopwatch
        Object retVal = pjp.proceed();
        System.out.println(retVal);
        // stop stopwatch
        return retVal;
    }
    
    //使用有标记注解才ＡＯＰ的切面
    @Around("execution(* hxk..around.*.*(..)) && @annotation(Mark)")//注解可加包名可不加
    public Object aroundWithAnnotation(ProceedingJoinPoint pjp) throws Throwable {
	Object retVal = pjp.proceed();
	System.out.println("Mark: "+ retVal);
	return retVal;
    }
    
    //传参数到这个切面中来,只能匹配连接点参数只有name的方法,下面上个能匹配多个参数的
    @Around("execution(* hxk..around.*.arg(..)) && args(name)")
    public Object arg(ProceedingJoinPoint pjp,String name) throws Throwable {
	System.out.println("name: " + name);
	Object retVal = pjp.proceed();
	System.out.println("arg :"+ retVal);
	return retVal;
    }
    
    //传参数到这个切面中来,只能匹配连接点参数只有name的方法,这个能匹配多个参数的
    @Around("execution(* hxk..around.*.multliarg(..)) && args(name,..)")
    public Object multliarg(ProceedingJoinPoint pjp,String name) throws Throwable {
	System.out.println("multliarg");
	Object retVal = pjp.proceed();
	System.out.println("multliarg :"+ retVal);
	return retVal;
    }
    
    //传参数到这个切面中来
    @Around("execution(* hxk..around.*.args(..)) && args(session)")
    public Object args(ProceedingJoinPoint pjp,HttpSession session) throws Throwable {
	System.out.println(session.getId());
	Object retVal = pjp.proceed();
	String name = session.getAttribute("name").toString();
	System.out.println("传args :"+ name);
	return retVal;
    }
    
    //传递参数到被AOP的方法去
    @Around("execution(* hxk..around.*.passArgs(..))")
    public Object passArg(ProceedingJoinPoint pjp) throws Throwable {
	Object retVal = pjp.proceed(new Object[]{"pass",50});
	return retVal;
    }
    
    

}
