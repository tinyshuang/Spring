package hxk.nonStaticFactory;

/**
 * @author Administrator
 * @description
 *2015-3-29  下午1:40:14
 */
public class Car {
    private int money;
    private String name;
    
    
    public Car(int money, String name) {
	super();
	this.money = money;
	this.name = name;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
}
