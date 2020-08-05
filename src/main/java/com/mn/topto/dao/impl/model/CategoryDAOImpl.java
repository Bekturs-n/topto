package com.mn.topto.dao.impl.model;

import com.mn.topto.dao.abstracts.model.CategoryDAO;
import com.mn.topto.models.entity.Category;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDAOImpl extends ReadWriteDAOImpl<Category, Long> implements CategoryDAO {
}
