package hxk.transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Administrator
 * @description
事务的两种方式:XML配置的..
<!-- 声明事务管理器,指向下面的数据源 -->
<bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
 	   <property name="dataSource" ref="dataSource" />
</bean>
      
<!-- the transactional advice (what 'happens'; see the <aop:advisor/> bean below) -->
 <tx:advice id="txAdvice" transaction-manager="transactionManager">
      <!-- the transactional semantics... -->
      <tx:attributes>
          <!-- all methods starting with 'get' are read-only -->
          <tx:method name="get*" read-only="true"/>
          <!-- other methods use the default transaction settings (see below) -->
          <tx:method name="*"/>
      </tx:attributes>
</tx:advice>

<!-- ensure that the above transactional advice runs for any execution of an operation defined by the FooService interface -->
<aop:config>
    <aop:pointcut id="save" expression="execution(* hxk.transaction.UserAction.add(..))"/>
    <aop:advisor advice-ref="txAdvice" pointcut-ref="save"/>
</aop:config>

使用注解的:
<tx:annotation-driven />

 *2015-3-29  下午10:34:46
 */
@Service
public class UserManager {

  @Autowired
  private UserDAO userDAO;
  
  public void insertUser(User user) {
    userDAO.insertUser(user);
    System.out.println("user save");
    throw new RuntimeException("Test");
  }
  
  @Transactional
  public void save(User user) {
      userDAO.insertUser(user);
      System.out.println("user save");
      throw new RuntimeException("Test");
  }
  
  //注意事务即使回滚,主键也是已经添加的了
  public void success(User user) {
      userDAO.insertUser(user);
      System.out.println("user save");
    }

  public User getUser(String username) {
    return userDAO.getUser(username);
  }

  public List<User> getUsers() {
    return userDAO.getUsers();
  }

}