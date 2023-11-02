package com.caisse.demo.service;

import com.caisse.demo.entities.Categories;

import java.util.List;

public interface CategorieService {

    Categories saveCategorie(Categories p);
    Categories updateCategorie(Categories p);
    Categories getCategorie(Long id);
    List<Categories> getAllCategories();
    List<Categories> findBylibelleCat(String libelleCat);
    void deleteMotorById(Long id);

    Long count();}