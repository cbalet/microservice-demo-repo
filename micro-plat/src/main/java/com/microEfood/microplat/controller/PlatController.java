package com.microEfood.microplat.controller;

import com.microEfood.microplat.dao.PlatDao;
import com.microEfood.microplat.entite.Plat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * !!!!!!!!!!!!! Ici ajouter une description de ce qu'est sensée faire la classe !!!!!!!!!!!!!
 *
 * Créée par charles.balet le 25/07/19
 *
 */
@RestController
public class PlatController {

    @Autowired
    private PlatDao dao;


    // Retroune toute les plats
    @RequestMapping(value="/plats", method= RequestMethod.GET)
    public List<Plat> listeProduits() {
        return dao.findAll();
    }


    //Récupérer un produit par son Id
    @GetMapping(value="/plat/{id}")
    public Plat afficherUnProduit(@PathVariable Long id) {
        return dao.findById(id);
    }
}