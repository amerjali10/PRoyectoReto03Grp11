/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jalinet.grupo11.service;

import com.jalinet.grupo11.dao.CustomeRepository;
import com.jalinet.grupo11.entities.Custome;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JaliNet
 */
@Service
public class CustomeService {
    @Autowired
    CustomeRepository customeRepository;
    
  public List<Custome> getAll() {return (List<Custome>) customeRepository.getAll();};
  
  public Optional<Custome> getCustome(int id) {return customeRepository.getCustome(id);};
  
  public Custome save(Custome custome) { 
       if (custome.getId()== null){
           return customeRepository.save(custome);
       }
       else
       {
          Optional<Custome> co =  customeRepository.getCustome(custome.getId());
          if (co.isEmpty()){
              return customeRepository.save(custome);
          }
          else
          {
              return custome;
          }
       }
 
    }
  
  
}
