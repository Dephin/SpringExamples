package test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test2.Zoo;

public class Test {
    public static void main(String[] args) {
        /*
        * 使用@Autowired注解 将类名进行绑定注入 需对被绑定的类注册bean
        */
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "test2.xml");
        Zoo zoo = ctx.getBean(Zoo.class);
        System.out.printf(zoo.getSmallBird().toString());
        System.out.printf(zoo.getLion().toString());
    }
}
