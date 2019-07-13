package com.juneaop.junedemoaop.controller;

import com.juneaop.junedemoaop.impl.MyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyImpl myImpl;

    @GetMapping(value="/check")
    public String checkAop(){
        return myImpl.doSomething();
    }
}
