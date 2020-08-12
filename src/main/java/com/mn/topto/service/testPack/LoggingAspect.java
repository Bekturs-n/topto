package com.mn.topto.service.testPack;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Pointcut("within(com.mn.topto.service.testPack.service.FullNameComposer)")
    public void stringProcessingMethods() {
    }

    @After("com.mn.topto.service.testPack.LoggingAspect.stringProcessingMethods()")
    public void logMethodCall(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        logger.log(Level.INFO, "название метода: " + methodName);
    }

    @AfterReturning(pointcut = "execution(public String com.mn.topto.service.testPack.service.FullNameComposer.*(..))",
            returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        logger.log(Level.INFO, "возвращенное значение: " + result.toString());
    }

    @Around("@annotation(LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();

        Object proseed  = joinPoint.proceed();

        long resultTime = System.nanoTime() - start;

        logger.log(Level.INFO, joinPoint.getSignature() + " выполнен за " + resultTime + "nano sec");

        return proseed;
    }

}
