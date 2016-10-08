import com.spring.ioc.HelloService;
import com.spring.ioc.application.ApplicationContext;
import com.spring.ioc.application.ClassPathXmlApplicatioinContext;
import org.junit.Test;

/**
 * Created by majinliang on 16/10/8.
 */
public class SixStageTest {

    @Test
    public void test() {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicatioinContext("beans.xml");
            HelloService helloWorldService = (HelloService) applicationContext.getBean("helloService");
            System.out.println(helloWorldService.getMykey());
        } catch(Exception e) {
            e.printStackTrace();
        }

    }



}
