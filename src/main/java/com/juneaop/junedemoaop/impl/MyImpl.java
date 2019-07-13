package com.juneaop.junedemoaop.impl;

import com.juneaop.junedemoaop.repos.MyInterface;
import org.springframework.stereotype.Service;

@Service
public class MyImpl implements MyInterface {


    @Override
    public String doSomething() {
        System.out.println("------hiiiiii------");
       return "Hello AOP";
    }
}
