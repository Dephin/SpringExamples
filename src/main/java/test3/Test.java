package test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        /*
        * 自动扫描后 将@Autowired标记的 接口变量 与 @Component标记的实现类绑定
        */
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "test3.xml");
        Zoo zoo = ctx.getBean(Zoo.class);
        System.out.printf(zoo.getSmartAnimal().toString());
    }
}
