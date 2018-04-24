package cz.pj.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String... args) {
        //    System.setProperty("debug", "true");
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        FirstService firstService = applicationContext.getBean(FirstService.class);
        System.out.println(firstService.greet("Petr"));
    }
}
