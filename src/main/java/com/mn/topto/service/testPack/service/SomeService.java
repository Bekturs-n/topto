package com.mn.topto.service.testPack.service;

import com.mn.topto.service.testPack.LogExecutionTime;
import org.springframework.stereotype.Service;

@Service
public class SomeService {
    @LogExecutionTime
    public void someMethod() throws InterruptedException {
        Thread.sleep(1000);
    }
}