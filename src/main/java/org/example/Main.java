package org.example;

import org.example.service.FirstService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "beans.xml");

        FirstService firstservice = ( FirstService) applicationContext.getBean("firstservice");

firstservice.afterinit();
    }

}