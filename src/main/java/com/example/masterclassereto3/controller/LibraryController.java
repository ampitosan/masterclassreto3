package com.example.masterclassereto3.controller;

import com.example.masterclassereto3.entities.Library;
import com.example.masterclassereto3.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Lib")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping("/all")
    public List<Library> getAll(){return libraryService.getAll();}
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Library save(@RequestBody Library p){return libraryService.save(p);}

}
