package com.juneaop.junedemoaop.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAop {

    @AfterReturning(value=" execution (* com.juneaop.junedemoaop.impl.MyImpl.doSomething(..))",
            returning = "retVal")
    public void doPerform(Object retVal){

        String str= (String) retVal;
        System.out.println("-------After AOP---------"+str);
    }
}
