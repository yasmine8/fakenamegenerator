package com.yasmine.fakenamegenerator.service;

import com.yasmine.fakenamegenerator.model.Signaler;
import com.yasmine.fakenamegenerator.repo.SignalerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignalerService {
    private final SignalerRepo signalerRepo;

    @Autowired
    public SignalerService(SignalerRepo signalerRepo){
        this.signalerRepo = signalerRepo;
    }

    public List<Signaler> findAllSignalers(){

        return signalerRepo.findAll();
    }
    public Signaler addSignaler(Signaler signaler){
        return signalerRepo.save(signaler);
    }
    public Signaler updateSignaler(Signaler signaler){
        return signalerRepo.save(signaler);
    }
}
