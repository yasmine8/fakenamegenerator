package com.yasmine.fakenamegenerator;

import com.yasmine.fakenamegenerator.model.Nom;
import com.yasmine.fakenamegenerator.service.NomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/nom")
public class NomResource {
        private final NomService nomService;

        public NomResource(NomService nomService){
            this.nomService = nomService;
        }

        @GetMapping("/all")
        public ResponseEntity<List<Nom>> getAllNoms(){
            List<Nom> noms = nomService.findAllNom();
            return new ResponseEntity<>(noms, HttpStatus.OK);
        }

        @GetMapping("/sha/ka")
        public ResponseEntity<Nom> getNomByStatus(){
            return new ResponseEntity<>(nomService.userByStatus(), HttpStatus.OK);
        }
        @GetMapping("/random")
        public ResponseEntity<List<Nom>> getRandomNoms(@RequestParam  int nbr){
            return new ResponseEntity<>(nomService.randomNoms(nbr), HttpStatus.OK);
        }

        @GetMapping("/find/{id}")
        public ResponseEntity<Nom> getNomById(@PathVariable("id") Long id){
            Nom nom = nomService.findNomById(id);
            return new ResponseEntity<>(nom, HttpStatus.OK);
        }

        @PostMapping("/add")
        public  ResponseEntity<Nom> addNom(@RequestBody Nom nom){
            Nom newNom = nomService.addNom(nom);
            return new ResponseEntity<>(newNom, HttpStatus.CREATED);
        }



        @PutMapping("/update")
        public  ResponseEntity<Nom> updateNom(@RequestBody Nom nom){
            Nom updateNom = nomService.updateNom(nom);
            return new ResponseEntity<>(updateNom, HttpStatus.OK);
        }

        @DeleteMapping("/delete/{id}")
        public  ResponseEntity<?> deleteNom(@PathVariable("id") Long id){
            nomService.deleteNom(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }


}
