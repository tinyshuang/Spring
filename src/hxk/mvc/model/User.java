package hxk.mvc.model;

import java.util.Date;

/**
 * @author Administrator
 * @description
 *2015-3-31  下午11:03:58
 */
public class User {
    private Date birth;
    private String name;
    
    
    @Override
    public String toString() {
	return "User [birth=" + birth + ", name=" + name + "]";
    }
    
    public Date getBirth() {
        return birth;
    }
    public void setBirth(Date birth) {
        this.birth = birth;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
}
