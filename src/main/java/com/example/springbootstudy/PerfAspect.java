package com.example.springbootstudy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

    //@Around("execution(* com.example.. *.EventService.*(..))")//advice를 어떻게 정의할 것인가 Around는 그 메소드를 감싸는 형태 pointcut 정의한 것
    @Around("@annotation(PerfLogging)") //PerfLogging 애노테이션을 붙인 메소드에만 사용을 해라
    public Object logPerf(ProceedingJoinPoint jp) throws Throwable { //advice
        long begin  = System.currentTimeMillis();
        Object retVal = jp.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return retVal;

    }
}
