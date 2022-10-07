package com.example.masterclassereto3.controller;

import com.example.masterclassereto3.entities.Administration;
import com.example.masterclassereto3.entities.Bike;
import com.example.masterclassereto3.service.AdministrationService;
import com.example.masterclassereto3.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Administration")
public class AdministratorController {

    @Autowired
    private AdministrationService administrationService;

    @GetMapping("/all")
    public List<Administration> getAll(){return administrationService.getAll();}
    @GetMapping("/{id}")
    public Optional<Administration> getAdministration(@PathVariable("id") int id){
        return administrationService.getAdministration(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Administration save (@RequestBody Administration administration){
        return administrationService.save(administration);
    }
}



