import com.spring.ioc.HelloService;
import com.spring.ioc.bean.BeanDefinition;
import com.spring.ioc.bean.PropertyValue;
import com.spring.ioc.bean.PropertyValues;
import com.spring.ioc.beanfactory.AutowireCapableBeanFactory;
import com.spring.ioc.beanfactory.BeanFactory;
import org.junit.Test;

/**
 * Created by majinliang on 16/9/27.
 */
public class ThirdStageTest {

    @Test
    public void test() {
//        BeanFactory beanFactory = new AutowireCapableBeanFactory();
//        BeanDefinition beanDefinition = new BeanDefinition();
//        beanDefinition.setBeanClassName("com.spring.ioc.HelloService");
//        PropertyValue propertyValue = new PropertyValue("mykey","hello");
//        beanDefinition.getPropertyValues().addPropertyValue(propertyValue);
//
//        try{
//            beanFactory.registerBeanDedinition("testBean",beanDefinition);
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//
//
//        HelloService helloService = (HelloService)beanFactory.getBean("testBean");
//        helloService.sayHello();
    }
}
