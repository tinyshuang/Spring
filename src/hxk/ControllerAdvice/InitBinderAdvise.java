package hxk.ControllerAdvice;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * @author Administrator
 * @description 使用@ControllerAdvice来定义全局的initbinder
 * 注释了之后会无法正确转换带有具体时间类型的参数
 *2015-4-2  下午8:21:42
 */
@ControllerAdvice
public class InitBinderAdvise {
    
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));//使用了Spring提供的CustomDateEditor类型转换器
    }
}
