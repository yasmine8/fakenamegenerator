package com.yasmine.fakenamegenerator.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Prenom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String prenomFr;
    private String prenomAr;
    @Column(length = 1)
    private String genre;

    public Prenom() {
    }

    public Prenom(String prenomFr, String prenomAr, String genre) {
        this.prenomFr = prenomFr;
        this.prenomAr = prenomAr;
        this.genre = genre;
    }

    public Prenom(String prenomFr, String prenomAr) {
        this.prenomFr = prenomFr;
        this.prenomAr = prenomAr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id= id;
    }

    public String getPrenomFr() {
        return prenomFr;
    }

    public void setPrenomFr(String prenomFr) {
        this.prenomFr = prenomFr;
    }

    public String getPrenomAr() {
        return prenomAr;
    }

    public void setPrenomAr(String prenomAr) {
        this.prenomAr = prenomAr;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String sexe) {
        this.genre = sexe;
    }
}
