import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat CatBean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(CatBean.getMessage());

        HelloWorld bean1 = applicationContext.getBean(HelloWorld.class);
        HelloWorld bean2 = applicationContext.getBean(HelloWorld.class);

        Cat CatBean1 = applicationContext.getBean(Cat.class);
        Cat CatBean2 = applicationContext.getBean(Cat.class);

        System.out.println("HelloWorld сравнение ссылок: " +(bean1==bean2));
        System.out.println("Cat сравнение ссылок: " + (CatBean1==CatBean2));
    }
}

