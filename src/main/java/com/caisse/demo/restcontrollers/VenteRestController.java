package com.caisse.demo.restcontrollers;

import com.caisse.demo.entities.Produit;
import com.caisse.demo.entities.Vente;
import com.caisse.demo.service.ProduitService;
import com.caisse.demo.service.VenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vente")
@CrossOrigin
public class VenteRestController {

    @Autowired

    VenteService venteService ;

    @RequestMapping(path="/all",method = RequestMethod.GET)
    public List<Vente> getAllVentes()
    {

        return venteService.getAllVentes();
    }

    @RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
    public Vente getVenteById(@PathVariable("id") Long id)
    {
        return venteService.getVente(id);

    }
    @RequestMapping(path="/addvente",method = RequestMethod.POST)
    public Vente createVente(@RequestBody Vente vente) {
        return venteService.saveVente(vente);
    }



    @RequestMapping(path="/updatevente",method = RequestMethod.PUT)
    public Vente updateVente(@RequestBody Vente vente) {
        return venteService.updateVente(vente);
    }


@RequestMapping(value="/findbynumticket/{numticket}",method = RequestMethod.GET)
    public List<Vente> getVentesByNumTicket(@PathVariable("numticket") Long numticket) {
        return venteService.findByNumTicket(numticket);
    }

    @RequestMapping(path="/countVente",method = RequestMethod.GET)
    public Long count() {
        return venteService.count();
    }

}
