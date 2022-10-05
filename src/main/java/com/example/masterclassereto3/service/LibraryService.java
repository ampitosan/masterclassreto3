package com.example.masterclassereto3.service;

import com.example.masterclassereto3.Repository.LibraryRepository;
import com.example.masterclassereto3.entities.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    public List<Library> getAll(){
        return libraryRepository.getAll();
    }
    public Optional<Library> getLibrary(int id){
        return libraryRepository.getLibrary(id);
    }
    public Library save(Library p){
        if(p.getId()==null){
            return libraryRepository.save(p);
        }else{
            Optional<Library> e = libraryRepository.getLibrary(p.getId());
            if(e.isPresent()){
                return p;
            }else{
                return libraryRepository.save(p);
            }
        }
    }
    public Library update(Library p){
        if(p.getId()!=null){
            Optional<Library> q = libraryRepository.getLibrary(p.getId());
            if(q.isPresent()){
                if(p.getName()!=null){
                    q.get().setName(p.getName());
                }
                if(p.getDescription()!=null){
                    q.get().setDescription(p.getDescription());
                }
                if(p.getTarget()!=null){
                    q.get().setTarget(p.getTarget());
                }
                if(p.getCategory()!=null){
                    q.get().setCategory(p.getCategory());
                }

                libraryRepository.save(q.get());
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
        Optional<Library>p= libraryRepository.getLibrary(id);
        if(p.isPresent()){
            libraryRepository.delete(p.get());
            flag=true;
        }
        return flag;

    }


}
