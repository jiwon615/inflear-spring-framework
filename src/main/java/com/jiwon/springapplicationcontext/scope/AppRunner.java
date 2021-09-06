package com.jiwon.springapplicationcontext.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    @Value("#{1+1}")
    int value;

    @Value("#{'hello ' + 'world'}")
    String greeting;

    @Value("#{1 eq 1}")
    boolean trueOrFalse;

    @Value("hello")
    String hello;

    @Value("${my.value}")  // 프로퍼티 표현식
    int myValue;

    @Value("#{${my.value} eq 100}")
    boolean isMyValue100;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=============");
        System.out.println(value);  // 2
        System.out.println(greeting); // hello world
        System.out.println(trueOrFalse); // true
        System.out.println(hello); // hello
        System.out.println(myValue); // 100
        System.out.println(isMyValue100); // true
    }
}
