package com.mn.topto.service.impl.model;

import com.mn.topto.dao.abstracts.model.CategoryDAO;
import com.mn.topto.models.entity.Category;
import com.mn.topto.service.abstracts.model.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ReadWriteServiceImpl<Category, Long> implements CategoryService {

    protected final CategoryDAO categoryDAO;

    @Autowired
    public CategoryServiceImpl(CategoryDAO categoryDAO){
        super(categoryDAO);
        this.categoryDAO = categoryDAO;
    }
}
