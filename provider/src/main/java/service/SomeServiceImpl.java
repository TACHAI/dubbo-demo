package service;

/**
 * Create by tachai on 2020-10-08 20:35
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class SomeServiceImpl  implements SomeService{
    @Override
    public String hello(String name) {

        System.out.println(name+",我是提供者");

        return "Hello Dubbo World! "+name;
    }
}
