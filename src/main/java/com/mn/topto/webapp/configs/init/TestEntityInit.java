package com.mn.topto.webapp.configs.init;

import com.mn.topto.service.impl.TestDataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnMissingClass({"org.springframework.boot.test.context.SpringBootTest"})
public class TestEntityInit implements CommandLineRunner {

    @Autowired
    private TestDataEntity testDataEntity;

    @Override
    public void run(String... args) {
        testDataEntity.createEntity();
    }
}