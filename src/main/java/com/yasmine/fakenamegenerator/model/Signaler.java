package com.yasmine.fakenamegenerator.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Signaler implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private Long idNom;
    private boolean nomFr;
    private boolean nomAr;

    private Long idPrenom;
    private boolean prenomFr;
    private boolean prenomAr;

    private String raison;
    private String commentaire;
    private boolean situation;

    public Signaler() {
    }

    public Signaler(Date date, Long idNom, boolean nomFr, boolean nomAr, Long idPrenom, boolean prenomFr, boolean prenomAr, String raison, String commentaire, boolean situation) {
        this.date = date;
        this.idNom = idNom;
        this.nomFr = nomFr;
        this.nomAr = nomAr;
        this.idPrenom = idPrenom;
        this.prenomFr = prenomFr;
        this.prenomAr = prenomAr;
        this.raison = raison;
        this.commentaire = commentaire;
        this.situation = situation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getIdNom() {
        return idNom;
    }

    public void setIdNom(Long idNom) {
        this.idNom = idNom;
    }

    public boolean isNomFr() {
        return nomFr;
    }

    public void setNomFr(boolean nomFr) {
        this.nomFr = nomFr;
    }

    public boolean isNomAr() {
        return nomAr;
    }

    public void setNomAr(boolean nomAr) {
        this.nomAr = nomAr;
    }

    public Long getIdPrenom() {
        return idPrenom;
    }

    public void setIdPrenom(Long idPrenom) {
        this.idPrenom = idPrenom;
    }

    public boolean isPrenomFr() {
        return prenomFr;
    }

    public void setPrenomFr(boolean prenomFr) {
        this.prenomFr = prenomFr;
    }

    public boolean isPrenomAr() {
        return prenomAr;
    }

    public void setPrenomAr(boolean prenomAr) {
        this.prenomAr = prenomAr;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public boolean isSituation() {
        return situation;
    }

    public void setSituation(boolean situation) {
        this.situation = situation;
    }
}
