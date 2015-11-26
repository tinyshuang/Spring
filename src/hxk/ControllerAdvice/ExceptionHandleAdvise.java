package hxk.ControllerAdvice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @description  定义全局的异常处理
// Target all Controllers annotated with @RestController
@ControllerAdvice(annotations = RestController.class)
public class AnnotationAdvice {}

// Target all Controllers within specific packages
@ControllerAdvice("org.example.controllers")
public class BasePackageAdvice {}

// Target all Controllers assignable to specific classes
@ControllerAdvice(assignableTypes = {ControllerInterface.class, AbstractController.class})
public class AssignableTypesAdvice {}

 *2015-4-2  下午8:47:29
 */
@ControllerAdvice
public class ExceptionHandleAdvise {
    
    @ExceptionHandler(RuntimeException.class)
    public @ResponseBody String runtimeExceptionHandler(RuntimeException runtimeException) {
	System.out.println("runtime--Exception");
	return "false";
    }
}
