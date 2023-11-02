package com.caisse.demo.service;

import com.caisse.demo.Repos.CategorieRepository;
import com.caisse.demo.entities.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CategorieServiceImpl implements CategorieService{
    @Autowired
    CategorieRepository catRepository ;

    @Override
    public Categories saveCategorie(Categories p) {
        return catRepository.save(p) ;
    }

    @Override
    public Categories updateCategorie(Categories p) {
        return catRepository.save(p);
    }

    @Override
    public Categories getCategorie(Long id) {
        return catRepository.findById(id).get();
    }

    @Override
    public List<Categories> getAllCategories() {
        return catRepository.findAll();
    }

    @Override
    public List<Categories> findBylibelleCat(String libelleCat) {
        return catRepository.findBylibelleCat(libelleCat);
    }

    @Override
    public void deleteMotorById(Long id) {
        catRepository.deleteById(id);
    }

    @Override
    public Long count() {
        return catRepository.count();
    }
}
