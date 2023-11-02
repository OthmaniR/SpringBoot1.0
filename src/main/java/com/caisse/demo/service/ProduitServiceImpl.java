package com.caisse.demo.service;

import java.util.List;

import com.caisse.demo.Repos.ProduitRepository;
import com.caisse.demo.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProduitServiceImpl implements ProduitService{

    @Autowired
    ProduitRepository prodRepository ;

    @Override
    public Produit saveProduit(Produit p) {
        return prodRepository.save(p) ;
    }

    @Override
    public Produit updateProduit(Produit p) {
        return prodRepository.save(p);
    }

    @Override
    public Produit getProduit(Long id) {
        return prodRepository.findById(id).get();
    }

    @Override
    public List<Produit> getAllProduits() {
        return prodRepository.findAll();
    }

    @Override
    public List<Produit> findBylibelle(String libelle) {
        return prodRepository.findBylibelle(libelle);

    }
  @Override
    public Long count() {
        return prodRepository.count();
    }


}
