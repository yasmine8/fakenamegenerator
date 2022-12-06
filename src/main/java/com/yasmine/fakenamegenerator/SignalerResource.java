package com.yasmine.fakenamegenerator;


import com.yasmine.fakenamegenerator.model.Signaler;
import com.yasmine.fakenamegenerator.service.SignalerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/signaler")
public class SignalerResource {

    private final SignalerService signalerService;

    public SignalerResource(SignalerService signalerService){
        this.signalerService = signalerService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Signaler>> getAllSignalers(){
        List<Signaler> signalers = signalerService.findAllSignalers();
        return new ResponseEntity<>(signalers, HttpStatus.OK);
    }
    @PostMapping("/add")
    public  ResponseEntity<Signaler> addSignaler(@RequestBody Signaler signaler){
        Signaler newSignaler = signalerService.addSignaler(signaler);
        return new ResponseEntity<>(newSignaler, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public  ResponseEntity<Signaler> updateSignaler(@RequestBody Signaler signaler){
        Signaler updateSignaler = signalerService.updateSignaler(signaler);
        return new ResponseEntity<>(updateSignaler, HttpStatus.OK);
    }
}
