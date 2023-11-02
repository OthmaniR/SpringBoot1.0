package com.caisse.demo.Repos;

import com.caisse.demo.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;


@RepositoryRestResource(path="rest")
public interface ProduitRepository extends JpaRepository<Produit, Long> {
    List<Produit> findBylibelle(String libelle);
    long count();






}
