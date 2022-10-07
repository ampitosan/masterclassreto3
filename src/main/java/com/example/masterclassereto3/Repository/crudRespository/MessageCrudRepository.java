package com.example.masterclassereto3.Repository.crudRespository;

import com.example.masterclassereto3.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {

}