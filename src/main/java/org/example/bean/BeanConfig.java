package org.example.bean;

import org.springframework.stereotype.Component;

@Component
public class BeanConfig {
    public void print(){
        System.out.printf("beanconfig");
    }
}
