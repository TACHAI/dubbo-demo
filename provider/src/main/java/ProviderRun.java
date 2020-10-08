import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.SomeService;
import sun.applet.Main;

import java.io.IOException;

/**
 * Create by tachai on 2020-10-08 20:51
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class ProviderRun {
    public static void main(String[] args) throws IOException {
        Main.main(args);

//   下面的方式不提倡使用
//        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-consumer.xml");
//        //启动spring 容器
//        ((ClassPathXmlApplicationContext)ac).start();
//        //使主线程阻塞
//        System.in.read();
    }
}
