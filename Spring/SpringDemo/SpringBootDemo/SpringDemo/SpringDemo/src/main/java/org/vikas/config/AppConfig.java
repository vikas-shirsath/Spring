package org.vikas.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.vikas.Alien;
import org.vikas.Computer;
import org.vikas.Desktop;
import org.vikas.Laptop;

@Configuration
@ComponentScan("org.vikas")
public class AppConfig {

//    //@Bean(name = {"comp2", "desktop1"})
//    @Bean
//    @Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    public Alien alien(Computer comp) {  //@Qualifier("desktop")
//        Alien obj = new Alien();
//        obj.setAge(21);
//        obj.setComp(comp);
//        return obj;
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }
}
