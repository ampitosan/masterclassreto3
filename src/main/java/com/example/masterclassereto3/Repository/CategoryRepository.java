package com.example.masterclassereto3.Repository;

import com.example.masterclassereto3.Repository.crudRespository.CategoryCrudRepository;
import com.example.masterclassereto3.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll(){ return(List<Category>) categoryCrudRepository.findAll();}
    public Optional<Category> getCategory(int id){ return categoryCrudRepository.findById(id);}
    public  Category save(Category c) {return categoryCrudRepository.save((c)); }
    public void delete(Category c) {categoryCrudRepository.delete(c);}

}
