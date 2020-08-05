package com.mn.topto.dao.impl.model;

import com.mn.topto.dao.abstracts.model.AnounsmentDAO;
import com.mn.topto.models.entity.Anounsment;
import org.springframework.stereotype.Repository;

@Repository
public class AnounsmentDAOImpl extends ReadWriteDAOImpl<Anounsment, Long> implements AnounsmentDAO {
}
