import com.spring.ioc.HelloService;
import com.spring.ioc.bean.BeanDefinition;
import com.spring.ioc.beanfactory.AutowireCapableBeanFactory;
import com.spring.ioc.io.ResourceLoader;
import com.spring.ioc.resource.XmlBeanDefinitionReader;
import org.junit.Test;

import java.util.Map;

/**
 * Created by majinliang on 16/10/8.
 */
public class FiveStageTest {

    @Test
    public void test() {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        try {
            xmlBeanDefinitionReader.loadBeanDefinitions("beans.xml");
            Map<String,BeanDefinition> map = xmlBeanDefinitionReader.getRegistry();
            AutowireCapableBeanFactory autowireCapableBeanFactory = new AutowireCapableBeanFactory();
            for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
                autowireCapableBeanFactory.registerBeanDedinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
            }

            autowireCapableBeanFactory.preInstantiateSingletons();

            HelloService helloService = (HelloService) autowireCapableBeanFactory.getBean("helloService");
            System.out.println(helloService.getRefService().getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
