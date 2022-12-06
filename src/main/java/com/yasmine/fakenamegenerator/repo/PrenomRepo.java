package com.yasmine.fakenamegenerator.repo;

import com.yasmine.fakenamegenerator.model.Prenom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PrenomRepo extends JpaRepository<Prenom,Long> {
    @Query(value ="select * from prenom order by RAND() LIMIT ?1",nativeQuery = true)
    public List<Prenom> findRandamPrenoms(int nbr);

    @Query(value ="select * from prenom where genre='M' or genre='B' order by RAND() LIMIT ?1",nativeQuery = true)
    public List<Prenom> findRandamPrenomsM(int nbr);
    @Query(value ="select * from prenom where genre='F' or genre='B' order by RAND() LIMIT ?1",nativeQuery = true)
    public List<Prenom> findRandamPrenomsF(int nbr);

}
