package hxk.nonStaticFactory;

/**
 * @author Administrator
 * @description
 *2015-3-29  下午1:40:02
 */
public class Man {
    private static House house = new House(100, "XX小区");
    private static Car car = new Car(100000, "宝马");
    
    private Man(){};
    
    public House createHouse(){
	return house;
    }
    
    public Car createCar(){
	return car;
    }
}
