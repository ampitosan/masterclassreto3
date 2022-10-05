package com.example.masterclassereto3.Repository;

import com.example.masterclassereto3.Repository.crudRespository.ReservasCrudRepository;
import com.example.masterclassereto3.entities.Reservas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservasRepository {
    @Autowired
    private ReservasCrudRepository reservasCrudRepository;

    public List<Reservas> getAll(){return (List<Reservas>) reservasCrudRepository.findAll();}

    public Optional<Reservas> getReservas(int id){ return reservasCrudRepository.findById(id);}

    public Reservas save(Reservas p){ return reservasCrudRepository.save(p);}

    public void delete(Reservas p){ reservasCrudRepository.delete(p);}





}
