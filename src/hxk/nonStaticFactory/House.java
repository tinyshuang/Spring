package hxk.nonStaticFactory;

/**
 * @author Administrator
 * @description
 *2015-3-29  下午1:40:20
 */
public class House {
    private int area;
    private String name;
    
    
    public House(int area, String name) {
	super();
	this.area = area;
	this.name = name;
    }


    public int getArea() {
        return area;
    }


    public void setArea(int area) {
        this.area = area;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    
    
}
