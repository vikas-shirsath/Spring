package org.vikas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.vikas.config.AppConfig;

@Component
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop desk = context.getBean( Desktop.class) ;
        desk.compile();

        Desktop dt = context.getBean(Desktop.class);
        dt.compile();

        Alien alien = context.getBean(Alien.class);
        alien.code();






//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj1 = (Alien)context.getBean("alien1");
////        obj1.setAge(21);
//        System.out.println(obj1.getAge());
//        obj1.code();
//
////        obj.code();
//
//        Alien obj2 = context.getBean("alien1", Alien.class);
////        System.out.println(obj2.age);
//
////        Computer com = context.getBean(Computer.class);
////
////        Desktop obj = context.getBean(Desktop.class);
    }
}