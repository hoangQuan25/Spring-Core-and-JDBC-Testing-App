package org.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* org.example.service.UserService.*(..))")
    public void logBeforeMethod() {
        System.out.println("A method in UserService is being called.");
    }
}
