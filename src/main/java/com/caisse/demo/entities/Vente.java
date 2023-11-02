package com.caisse.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Vente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVente;

    @Column(unique=true)
    private Long numTicket;
    private Long total;
    private Date DateVente;

    @JsonIgnore
    @ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="vente_produit",joinColumns = @JoinColumn(name="idVente") ,
            inverseJoinColumns = @JoinColumn(name="idProduit"))
    private List<Produit> produits;

    //generer le num ticket automatiquement


    public Vente() {

    }

    public Long getIdVente() {
        return idVente;
    }

    public Long getNumTicket() {
        return numTicket;
    }

    public Long getTotal() {
        return total;
    }

    public Date getDateVente() {
        return DateVente;
    }

    public List<Produit> getProduits() {
        return produits;
    }


    public void setIdVente(Long idVente) {
        this.idVente = idVente;
    }

    public void setNumTicket(Long numTicket) {
        this.numTicket = numTicket;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public void setDateVente(Date dateVente) {
        DateVente = dateVente;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public Vente(Long idVente, Long numTicket, Long total, Date dateVente, List<Produit> produits) {
        this.idVente = idVente;
        this.numTicket = numTicket;
        this.total = total;
        DateVente = dateVente;
        this.produits = produits;
    }

    @Override
    public String toString() {
        return "Vente{" +
                "idVente=" + idVente +
                ", numTicket=" + numTicket +
                ", total=" + total +
                ", DateVente=" + DateVente +
                ", produits=" + produits +
                '}';
    }
}
