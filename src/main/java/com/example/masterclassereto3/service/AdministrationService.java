package com.example.masterclassereto3.service;

import com.example.masterclassereto3.Repository.AdministrationRepository;
import com.example.masterclassereto3.Repository.BikeRepository;
import com.example.masterclassereto3.entities.Administration;
import com.example.masterclassereto3.entities.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministrationService {
    @Autowired
    private AdministrationRepository administrationRepository;

    public List<Administration> getAll(){
        return administrationRepository.getAll();
    }

    public Optional<Administration> getAdministration(int id){
        return administrationRepository.getAdministration(id);
    }

    public Administration save (Administration administration){
        if (administration.getId() == null){
            return administrationRepository.save(administration);
        } else {
            Optional<Administration> administration1 = administrationRepository.getAdministration(administration.getId());
            if(administration1.isEmpty()){
                return administrationRepository.save(administration);
            } else {
                return administration;
            }
        }
    }
}



