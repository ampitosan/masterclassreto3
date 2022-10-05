package com.example.masterclassereto3.service;

import com.example.masterclassereto3.Repository.CategoryRepository;
import com.example.masterclassereto3.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.getAll();
    }
    public Optional<Category> getProduct(int id){
        return categoryRepository.getCategory(id);
    }
    public Category save(Category p){
        if(p.getIdCategory()==null){
            return categoryRepository.save(p);
        }else{
            Optional<Category> e = categoryRepository.getCategory(p.getIdCategory());
            if(e.isPresent()){
                return p;
            }else{
                return categoryRepository.save(p);
            }
        }
    }
    public Category update(Category p){
        if(p.getIdCategory()!=null){
            Optional<Category> q = categoryRepository.getCategory(p.getIdCategory());
            if(q.isPresent()){
                if(p.getName()!=null){
                    q.get().setName(p.getName());
                }
                categoryRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
        Optional<Category>p= categoryRepository.getCategory(id);
        if(p.isPresent()){
            categoryRepository.delete(p.get());
            flag=true;
        }
        return flag;

    }


}
