package com.example.masterclassereto3.Repository;

import com.example.masterclassereto3.Repository.crudRespository.ReservationCrudRepository;

import com.example.masterclassereto3.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservasRepository {
    @Autowired
    private ReservationCrudRepository reservationCrudRepository;


    public List<Reservation> getAll(){return (List<Reservation>) reservationCrudRepository.findAll();}

    public Optional<Reservation> getReservation(int id){ return reservationCrudRepository.findById(id);}

    public Reservation save(Reservation p){ return reservationCrudRepository.save(p);}

    public void delete(Reservation p){ reservationCrudRepository.delete(p);}





}
