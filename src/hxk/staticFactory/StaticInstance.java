package hxk.staticFactory;

/**
 * @author Administrator
 * @description
 *2015-3-29  下午1:07:46
 */
public class StaticInstance {
    private  static StaticInstance instance = new StaticInstance("工厂方法注入");
    
    private String name;

   public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private StaticInstance(){}
    private StaticInstance(String name){
       this.name =name;
    }
    
    
    public static StaticInstance creInstance(){
	return instance;
    }
}
