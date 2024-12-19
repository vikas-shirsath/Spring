package org.vikas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {

    @Value("21")
    private int age;

    @Autowired
//    @Qualifier("laptop")
    private Computer comp;

    public Alien() {
        System.out.println("Alien Object created.");
    }

    public Alien(int age) {
        this.age = age;
        System.out.println("Para-constructor called");
    }

//    @ConstructorProperties({"age","lap"})
//    public Alien(int age, Computer comp) {
//        this.lap = lap;
//        this.age = age;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("setter called");
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code() {
        System.out.println("Coding");
        comp.compile();
    }
}
