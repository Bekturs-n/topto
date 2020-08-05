package com.mn.topto.service.impl.model;

import com.mn.topto.dao.abstracts.model.AnounsmentDAO;
import com.mn.topto.models.entity.Anounsment;
import com.mn.topto.service.abstracts.model.AnounsmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnounsmentServiceImpl extends ReadWriteServiceImpl<Anounsment, Long> implements AnounsmentService {

    private final AnounsmentDAO anounsmentDAO;

    @Autowired
    public AnounsmentServiceImpl(AnounsmentDAO anounsmentDAO) {
        super(anounsmentDAO);
        this.anounsmentDAO = anounsmentDAO;
    }
}
