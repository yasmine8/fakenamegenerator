package com.yasmine.fakenamegenerator.service;

import com.yasmine.fakenamegenerator.exception.UserNotFoundException;
import com.yasmine.fakenamegenerator.model.Nom;
import com.yasmine.fakenamegenerator.repo.NomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class NomService {

    private final NomRepo nomRepo;

    @Autowired
    public NomService(NomRepo nomRepo){
        this.nomRepo = nomRepo;
    }

    public Nom addNom(Nom employee){
        //employee.setNomCode(UUID.randomUUID().toString());
        return nomRepo.save(employee);
    }

    public List<Nom> findAllNom(){
        return nomRepo.findAll();
    }

    public Nom updateNom(Nom employee){
        return nomRepo.save(employee);
    }

    //public Nom findEmployeeById(Long id){
        //return nomRepo.findEmployeeById(id)
           //     .orElseThrow(() -> new UserNotFoundException("User by id "+id+" was not found"));
    //}
    public Nom findNomById(Long id){
        if (id==0){
            return null;
        }else
        return nomRepo.findById(id).orElseThrow(() -> new UserNotFoundException("User by id "+id+" was not found"));
    }

    public void deleteNom(Long id){
        nomRepo.deleteById(id);
    }

    public Nom userByStatus(){
        return nomRepo.findRandom();
    }

    public List<Nom> randomNoms(int nbr){
        return nomRepo.findRandamNoms(nbr);
    }


}
