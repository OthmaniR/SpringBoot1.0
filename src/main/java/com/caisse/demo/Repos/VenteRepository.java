package com.caisse.demo.Repos;

import com.caisse.demo.entities.Produit;
import com.caisse.demo.entities.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path="rest")
public interface VenteRepository extends JpaRepository<Vente, Long>  {


        List<Vente> findByNumTicket(Long NumTicket);
        long count();


}
