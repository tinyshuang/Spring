package hxk.nonStaticFactory;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @description 一个工厂类里面有多个非静态方法的情况
      <bean id="man" class="hxk.nonStaticFactory.Man">
 	<!-- inject any dependencies required by this locator bean -->
      </bean>
      <bean id="house"  factory-bean="man" factory-method="createHouse"/>
      <bean id="car"  factory-bean="man" factory-method="createCar"/>
 *2015-3-29  下午1:48:54
 */
@Controller
@RequestMapping("nonstatic")
public class NonStaticFactoryAction {
    private Man man;

    @Resource
    public void setMan(Man man) {
        this.man = man;
    }
    
    @RequestMapping("show")
    public @ResponseBody House show(){
	House house = man.createHouse();
	return house;
    }
}
