package com.mn.topto.dao.impl.model;

import com.mn.topto.dao.abstracts.model.TestDAO;
import com.mn.topto.models.entity.C;
import com.mn.topto.models.entity.Embedded;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAOImpl extends ReadWriteDAOImpl<C, Long> implements TestDAO {
}
