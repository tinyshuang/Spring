package hxk.mvc.customEditor;

import java.beans.PropertyEditorSupport;

/**
 * @author Administrator
 * @description 一个自定义的类型转换器--反转字符串
 *2015-3-31  下午11:26:02
 */
public class StringReverseEditor extends PropertyEditorSupport {
    
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (text != null) {
            StringBuilder builder = new StringBuilder(text);
            setValue(builder.reverse().toString());
        } else {
            setValue(null);
        }
   
    }


}
