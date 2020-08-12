package com.mn.topto.service.testPack;

import com.mn.topto.service.testPack.service.FullNameComposer;
import com.mn.topto.service.testPack.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AspectsDemoApplication implements CommandLineRunner {
    @Autowired
    FullNameComposer composer;
    @Autowired
    SomeService service;
    public static void main(String[] args) {
        SpringApplication.run(AspectsDemoApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        composer.composeFullName("Ivan", "Petrov");
        service.someMethod();
    }
}