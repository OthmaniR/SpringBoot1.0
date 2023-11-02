package com.caisse.demo.service;

import com.caisse.demo.entities.Produit;
import com.caisse.demo.entities.Vente;

import java.util.List;

public interface VenteService {

    Vente saveVente(Vente v);
    Vente updateVente(Vente v);
    Vente getVente(Long id);
    List<Vente> getAllVentes();
    List<Vente> findByNumTicket(Long NumTicket);

    Long count();}