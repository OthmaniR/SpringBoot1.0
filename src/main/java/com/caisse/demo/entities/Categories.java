package com.caisse.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
@Entity
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idCategorie;
    private String libelleCat;
    private String description;
@JsonIgnore
    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits;

    public Categories() {
    }

    public Categories(Long idCategorie, String libelleCat, String description, List<Produit> produits) {
        this.idCategorie = idCategorie;
        this.libelleCat = libelleCat;
        this.description = description;
        this.produits = produits;
    }

    public Long getIdCategorie() {
        return idCategorie;
    }

    public String getLibelleCat() {
        return libelleCat;
    }

    public String getDescription() {
        return description;
    }

    public List<Produit> getProduits() {
        return produits;

    }

    public void setIdCategorie(Long idCategorie) {
        this.idCategorie = idCategorie;
    }

    public void setLibelleCat(String libelleCat) {
        this.libelleCat = libelleCat;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "idCategorie=" + idCategorie +
                ", libelleCat='" + libelleCat + '\'' +
                ", description='" + description + '\'' +
                ", produits=" + produits +
                '}';
    }
}
