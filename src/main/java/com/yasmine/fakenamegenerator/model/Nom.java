package com.yasmine.fakenamegenerator.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Nom implements Serializable {
    @Id
    @GeneratedValue
    private Long id ;
    private String nomFr;
    private String nomAr;

    public Nom() {
    }

    public Nom(String nomFr, String nomAr) {
        this.nomFr = nomFr;
        this.nomAr = nomAr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomFr() {
        return nomFr;
    }

    public void setNomFr(String nomFr) {
        this.nomFr = nomFr;
    }

    public String getNomAr() {
        return nomAr;
    }

    public void setNomAr(String nomAr) {
        this.nomAr = nomAr;
    }


}
