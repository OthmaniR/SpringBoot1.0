package com.caisse.demo.Repos;

import com.caisse.demo.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path="rest")


public interface CategorieRepository extends JpaRepository<Categories, Long> {

        List<Categories> findBylibelleCat(String libelleCat);
        long count();


}
