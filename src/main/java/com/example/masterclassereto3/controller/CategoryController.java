package com.example.masterclassereto3.controller;

import com.example.masterclassereto3.entities.Category;
import com.example.masterclassereto3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
public class CategoryController {

    @Autowired
    private CategoryService CategoryService;


    @GetMapping("/all")
    public List<Category> getAll() {return CategoryService.getAll();}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category p){return CategoryService.save(p);}


}
