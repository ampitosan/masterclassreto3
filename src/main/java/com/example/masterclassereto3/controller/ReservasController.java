package com.example.masterclassereto3.controller;

import com.example.masterclassereto3.entities.Reservas;
import com.example.masterclassereto3.service.ReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservas")
public class ReservasController {

    @Autowired
    private ReservasService reservasService;

    @GetMapping("/all")
    public List<Reservas> getAll(){ return reservasService.getAll();}
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Reservas save(@RequestBody Reservas p){return reservasService.save(p);}



    }
}
