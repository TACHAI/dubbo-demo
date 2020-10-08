import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.SomeService;

/**
 * Create by tachai on 2020-10-08 20:52
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class ConsumerRun {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-consumer.xml");
        SomeService someService = (SomeService) ac.getBean("someService");
        String hello = someService.hello("china");
        System.out.println(hello);
    }
}
