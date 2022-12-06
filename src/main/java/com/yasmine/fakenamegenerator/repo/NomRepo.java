package com.yasmine.fakenamegenerator.repo;

import com.yasmine.fakenamegenerator.model.Nom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.naming.Name;
import java.util.List;

public interface NomRepo extends JpaRepository<Nom,Long> {


    @Query(value = "SELECT * FROM nom\n" +
            "ORDER BY RAND()\n" +
            "LIMIT 1", nativeQuery = true)
    Nom findRandom();

    @Query(value ="select * from nom order by RAND() LIMIT ?1",nativeQuery = true)
    public List<Nom> findRandamNoms(int nbr);
}
