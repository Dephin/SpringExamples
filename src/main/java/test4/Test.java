package test4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        /*
        * 自动扫描后 将@Autowired标记的 实体变量 与 @Component标记的类绑定
        * @Component （把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>）
        */
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "test4.xml");
        Zoo zoo = ctx.getBean(Zoo.class);
        System.out.printf(zoo.getMonkey().toString());
    }
}
