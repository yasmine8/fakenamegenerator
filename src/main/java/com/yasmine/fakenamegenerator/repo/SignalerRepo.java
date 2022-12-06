package com.yasmine.fakenamegenerator.repo;

import com.yasmine.fakenamegenerator.model.Signaler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignalerRepo extends JpaRepository<Signaler,Long> {
}