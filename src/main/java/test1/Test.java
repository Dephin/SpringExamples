package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        /*
        * 对 setter 进行注入
        */
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "test1.xml");
        Zoo zoo = ctx.getBean(Zoo.class);
        System.out.printf(zoo.getSmallBird().toString());
    }
}
