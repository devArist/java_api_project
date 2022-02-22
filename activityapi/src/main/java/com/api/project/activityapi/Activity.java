package com.api.project.activityapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activite")
public class Activity {
    private Integer id;
    private String nom;
    private String description;
    private Integer ageRequis;
    private Integer prix;

    public Activity() {

    }

    public Activity(Integer id, String nom, String description, Integer ageRequis, Integer prix){
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.ageRequis = ageRequis;
        this.prix = prix;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAgeRequis() {
        return this.ageRequis;
    }

    public void setAgeRequis(Integer ageRequis) {
        this.ageRequis = ageRequis;
    }

    public Integer getPrix() {
        return this.prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }
}
