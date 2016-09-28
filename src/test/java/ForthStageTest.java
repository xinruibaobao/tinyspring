import com.spring.ioc.HelloService;
import com.spring.ioc.bean.BeanDefinition;
import com.spring.ioc.beanfactory.AutowireCapableBeanFactory;
import com.spring.ioc.beanfactory.BeanFactory;
import com.spring.ioc.io.ResourceLoader;
import com.spring.ioc.resource.XmlBeanDefinitionReader;
import org.junit.Test;

import java.util.Map;

/**
 * Created by majinliang on 16/9/28.
 */
public class ForthStageTest {

    @Test
    public void test() {

        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        try {
            xmlBeanDefinitionReader.loadBeanDefinitions("../classes/beans.xml");
        } catch(Exception e) {
            e.printStackTrace();
        }

        BeanFactory beanFactory = new AutowireCapableBeanFactory();
        for(Map.Entry<String, BeanDefinition> beanDefinitionEntry:xmlBeanDefinitionReader.getRegistry().entrySet()){
            try {
                beanFactory.registerBeanDedinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();


    }


}
