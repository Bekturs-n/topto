package com.mn.topto.webapp.controllers;

import com.mn.topto.models.entity.Category;
import com.mn.topto.service.abstracts.model.CategoryService;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/category")
public class CategorytResourceController {

    private final CategoryService categoryService;

    @Autowired
    public CategorytResourceController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

//    @GetMapping
//    public String getp(){
//        return "GET";
//    }
//

    @GetMapping
    public ResponseEntity<List<Category>> getCategories() {
//        Pair<List<Category>, Long> pair = new Pair<>(categoryService.getAll(), 10l);
        return ResponseEntity.ok(categoryService.getAll());
    }
}
