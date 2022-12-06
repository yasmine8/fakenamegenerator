package com.yasmine.fakenamegenerator.service;

import com.github.javafaker.Faker;
import com.yasmine.fakenamegenerator.exception.UserNotFoundException;
import com.yasmine.fakenamegenerator.model.Prenom;
import com.yasmine.fakenamegenerator.repo.PrenomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenomService {

    private final PrenomRepo prenomRepo;

    @Autowired
    public PrenomService(PrenomRepo prenomRepo){
        this.prenomRepo = prenomRepo;
    }

    public Prenom addPrenom(Prenom employee){
        //employee.setNomCode(UUID.randomUUID().toString());
        employee.setPrenomFr(employee.getPrenomFr().substring(0,1).toUpperCase() + employee.getPrenomFr().substring(1).toLowerCase());
        return prenomRepo.save(employee);
    }

    public List<Prenom> findAllPrenom(){
        return prenomRepo.findAll();
    }

    public Prenom updatePrenom(Prenom employee){
        return prenomRepo.save(employee);
    }

    public Prenom findPrenomById(Long id){
        if (id==0){
            return null;
        }else
        return prenomRepo.findById(id).orElseThrow(() -> new UserNotFoundException("User by id "+id+" was not found"));
    }


    public void deletePrenom(Long id){
        prenomRepo.deleteById(id);
    }

    public List<Prenom> randomPrenoms(int nbr){
        return prenomRepo.findRandamPrenoms(nbr);
    }
    public List<Prenom> randomPrenomsM(int nbr){
        return prenomRepo.findRandamPrenomsM(nbr);
    }
    public List<Prenom> randomPrenomsF(int nbr){
        return prenomRepo.findRandamPrenomsF(nbr);
    }

}
