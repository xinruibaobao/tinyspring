

import com.spring.ioc.bean.BeanDefinition;
import com.spring.ioc.beanfactory.BeanFactory;
import org.junit.Test;

/**
 * Created by majinliang on 16/9/21.
 */

public class BeanFactoryTest {

    @Test
    public void testFactroy() {
        BeanDefinition beanDefinition = new BeanDefinition(new TestService());
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBeanDedinition("testService",beanDefinition);

        TestService testService = (TestService)beanFactory.getBean("testService");
        testService.shuchu();
    }


}
