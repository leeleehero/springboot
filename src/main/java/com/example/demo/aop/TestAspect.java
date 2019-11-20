package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class TestAspect {

    @Pointcut("execution(* com.example.demo.controller..*.*(..)))")
    public void TestApt(){

    }

    @Before("TestApt()")
    public void doBefore(JoinPoint joinPoint){
        System.out.println("我被拦截到了");
    }
}
