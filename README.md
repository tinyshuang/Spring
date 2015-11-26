# Spring

##这是参考spring文档之后写的一些入门demo..对于刚入职的人的日常工作基本是够用的..大家可以参考下..

###aop包
提供了三种类型的通知 : 

1.前          最简单的切面demo                                                                   -----参考before包 

2.返回后      返回的通知包含一个获取返回值的实例...                                              -----参考afterReturn包 

3.环绕        精华都在这个环绕的around实例中... 
包括了简单环绕,带注解环绕,环绕匹配参数,环绕传递参数值                            -----参考around包  
                
                

然后提供PointCut的使用方式以及提供了使用xml的切面                                                -----参考pointcut包以及xml包


###ControllerAdvice
定义全局的通知                                                                                   -----参考ControllerAdvice包  



(1)使用@ControllerAdvice注解定义日期转换器 


(2)使用@ControllerAdvice以及@ExceptionHandler(RuntimeException.class)定义全局的异常处理..然后给出了定义ControllerAdvice以及范围的demo..  




###handleMapping 拦截器                                                                         -----参考handleMapping包
当调用由@RequestMapping 声明的请求时,声明拦截器, 
其下有如下三个方法:preHandle(..),postHandle(..),afterCompletion(..) 




###static方法注入相关                                                                           -----参考static相关的两个包



###事务
-简单的使用了事务的例子                                                                         -----参考transaction包 

-使用了spring jdbc 

















