package com.caisse.demo.service;

import com.caisse.demo.Repos.ProduitRepository;
import com.caisse.demo.Repos.VenteRepository;
import com.caisse.demo.entities.Produit;
import com.caisse.demo.entities.Vente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class VenteServiceImpl implements VenteService {
    @Autowired
    VenteRepository venteRepository ;


    @Override
    public Vente saveVente(Vente v) {
        return venteRepository.save(v);
    }

    @Override
    public Vente updateVente(Vente v) {
        return venteRepository.save(v);
    }

    @Override
    public Vente getVente(Long id) {
        return venteRepository.findById(id).get();
    }

    @Override
    public List<Vente> getAllVentes() {
        return venteRepository.findAll();
    }

    @Override
    public List<Vente> findByNumTicket(Long NumTicket) {
        return venteRepository.findByNumTicket(NumTicket);
    }

    @Override
    public Long count() {
        return venteRepository.count();
    }
}