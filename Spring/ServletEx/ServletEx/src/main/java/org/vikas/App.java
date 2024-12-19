package org.vikas;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Hello world!");
        Tomcat tomcat = new Tomcat();

        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello", "HelloServlet");


        tomcat.setPort(8081);
        tomcat.start();
        tomcat.getServer().await();

    }
}