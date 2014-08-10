package com.lemon.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration indicates that its primary purpose is as a source of bean definitions.
 */
@Configuration
public class App {

    public static void main(String[] args) {
        //Can use more than one input parameters, such as App.class, App2.class.
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
        //The above line can also be implemented by the following two lines.
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(App.class);
        ctx.scan("com.lemon.spring");
        ctx.refresh();
        MessagePrinter printer = ctx.getBean(MessagePrinter.class);
        printer.printMessage();
        System.out.println("The helloworld is done!\nThanks very much for your info.");
    }
}
