package org.example;

import org.example.bean.BeanConfig;
import org.example.service.FirstService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "org.eample"
        );

        BeanConfig applicationContext2 =applicationContext.getBean(BeanConfig.class);
        applicationContext2.print();
        OuterService outerService = (OuterService) applicationContext.getBean(OuterService.class)  ;
outerService.print();




//        FirstService firstService = (FirstService) applicationContext.getBean("firstservice");
//        firstService.afterInit();
//        System.out.println(firstService.getName());
//        firstService.getSecondService().print();
    }
}