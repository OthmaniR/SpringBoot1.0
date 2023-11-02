package com.caisse.demo.restcontrollers;

import com.caisse.demo.entities.Produit;
import com.caisse.demo.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTController {

    @Autowired

    ProduitService prodService ;

    @RequestMapping(path="/all",method = RequestMethod.GET)
    public List<Produit> getAllProduits()
    {

        return prodService.getAllProduits();
    }

    @RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
    public Produit getMotorById(@PathVariable("id") Long id)
    {
        return prodService.getProduit(id);

    }
    @RequestMapping(path="/addprod",method = RequestMethod.POST)
    public Produit createProduit(@RequestBody Produit prod) {
        return prodService.saveProduit(prod);
    }



    @PutMapping("/updateproduit/{id}") // Use PutMapping for more concise mapping
    public Produit updateProduit(@PathVariable("id") Long id, @RequestBody Produit produit) {
        produit.setIdProduit(id); // Set the ID from the URL path
        return prodService.updateProduit(produit);
    }


    @RequestMapping(value="/findbylib/{lib}",method = RequestMethod.GET)
    public List<Produit> getProduitsByLibelle(@PathVariable("lib") String libelle) {
        return prodService.findBylibelle(libelle);
    }

    @RequestMapping(path="/count",method = RequestMethod.GET)
    public Long count() {
        return prodService.count();
    }

}
