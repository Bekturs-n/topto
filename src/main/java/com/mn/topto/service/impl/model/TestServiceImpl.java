package com.mn.topto.service.impl.model;

import com.mn.topto.dao.abstracts.model.TestDAO;
import com.mn.topto.models.entity.C;
import com.mn.topto.service.abstracts.model.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends ReadWriteServiceImpl<C, Long> implements TestService {

    private final TestDAO testDAO;

    @Autowired
    public TestServiceImpl (TestDAO testDAO) {
        super(testDAO);
        this.testDAO = testDAO;
    }
}
