package com.yasmine.fakenamegenerator;


import com.yasmine.fakenamegenerator.model.Nom;
import com.yasmine.fakenamegenerator.model.Prenom;
import com.yasmine.fakenamegenerator.service.PrenomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/prenom")
public class PrenomResource {
    private final PrenomService prenomService;

    public PrenomResource(PrenomService prenomService){
        this.prenomService = prenomService;
    }

    @GetMapping("/random")
    public ResponseEntity<List<Prenom>> getRandomNoms(@RequestParam  int nbr){
        return new ResponseEntity<>(prenomService.randomPrenoms(nbr), HttpStatus.OK);
    }
    @GetMapping("/random/M")
    public ResponseEntity<List<Prenom>> getRandomNomsM(@RequestParam  int nbr){
        return new ResponseEntity<>(prenomService.randomPrenomsM(nbr), HttpStatus.OK);
    }
    @GetMapping("/random/F")
    public ResponseEntity<List<Prenom>> getRandomNomsF(@RequestParam  int nbr){
        return new ResponseEntity<>(prenomService.randomPrenomsF(nbr), HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Prenom>> getAllPrenoms(){
        List<Prenom> noms = prenomService.findAllPrenom();
        return new ResponseEntity<>(noms, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Prenom> getNomById(@PathVariable("id") Long id){
        Prenom prenom = prenomService.findPrenomById(id);
        return new ResponseEntity<>(prenom, HttpStatus.OK);
    }
    @PostMapping("/add")
    public  ResponseEntity<Prenom> addPrenom(@RequestBody Prenom prenom){
        Prenom newNom = prenomService.addPrenom(prenom);
        return new ResponseEntity<>(newNom, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public  ResponseEntity<Prenom> updatePrenom(@RequestBody Prenom prenom){
        Prenom updatePrenom = prenomService.updatePrenom(prenom);
        return new ResponseEntity<>(updatePrenom, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deletePrenom(@PathVariable("id") Long id){
        prenomService.deletePrenom(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
