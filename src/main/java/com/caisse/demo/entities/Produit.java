package com.caisse.demo.entities;

import jakarta.persistence.*;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String libelle;
    private String code;
    private Double prix;
    private int quantite;
    private String disponibilite;
    @ManyToOne
    private Categories categorie;

    public Produit() {
    }

    public Produit(Long idProduit, String libelle, String code, Double prix, int quantite, String disponibilite, Categories categorie) {
        this.idProduit = idProduit;
        this.libelle = libelle;
        this.code = code;
        this.prix = prix;
        this.quantite = quantite;
        this.disponibilite = disponibilite;
        this.categorie = categorie;
    }

    public Long getIdProduit() {
        return idProduit;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getCode() {
        return code;
    }

    public Double getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getDisponibilite() {
        return disponibilite;
    }

    public Categories getCategorie() {
        return categorie;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setDisponibilite(String disponibilite) {
        this.disponibilite = disponibilite;
    }

    public void setCategorie(Categories categorie) {
        this.categorie = categorie;
    }


    @Override
    public String toString() {
        return "Produit{" +
                "idProduit=" + idProduit +
                ", libelle='" + libelle + '\'' +
                ", code='" + code + '\'' +
                ", prix=" + prix +
                ", quantite=" + quantite +
                ", disponibilite='" + disponibilite + '\'' +
                ", categorie=" + categorie +
                '}';
    }
}


