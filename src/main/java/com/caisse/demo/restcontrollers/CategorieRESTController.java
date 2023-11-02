package com.caisse.demo.restcontrollers;

import com.caisse.demo.entities.Categories;
import com.caisse.demo.entities.Produit;
import com.caisse.demo.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorie")
@CrossOrigin
public class CategorieRESTController {
    @Autowired

    CategorieService catService ;

    @RequestMapping(path="/all",method = RequestMethod.GET)
    public List<Categories> getAllCategories()
    {

        return catService.getAllCategories();

    }


    @RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
    public Categories getCategoriesById(@PathVariable("id") Long id)
    {
        return catService.getCategorie(id);

    }


    @RequestMapping(path="/addcat",method = RequestMethod.POST)
    public Categories createCategorie(@RequestBody Categories cat) {
        return catService.saveCategorie(cat);
    }


    @PutMapping("/updatecat/{id}") // Use PutMapping for more concise mapping
    public Categories updateCategorie(@PathVariable("id") Long id, @RequestBody Categories cat) {
        cat.setIdCategorie(id); // Set the ID from the URL path
        return catService.updateCategorie(cat);
    }

    @RequestMapping(value="/findbylib/{lib}",method = RequestMethod.GET)
    public List<Categories> getCategoriesByLibelle(@PathVariable("lib") String libelle) {
        return catService.findBylibelleCat(libelle);
    }


    @RequestMapping(path="/count",method = RequestMethod.GET)
    public Long count() {
        return catService.count();
    }


@RequestMapping(value="/delcat/{id}",method = RequestMethod.DELETE)
    public void deleteCategorie(@PathVariable("id") Long id)
    {
        catService.deleteMotorById(id);
    }
}
