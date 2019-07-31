package com.microEfood.microboisson.controller;

import com.microEfood.microboisson.dao.BoissonDao;
import com.microEfood.microboisson.entite.Boisson;
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
public class BoissonController {

    @Autowired
    private BoissonDao dao;


    // Retroune toute les boissons
    @RequestMapping(value="/boissons", method= RequestMethod.GET)
    public List<Boisson> listeProduits() {
        return dao.findAll();
    }


    //Récupérer un produit par son Id
    @GetMapping(value="/boisson/{id}")
    public Boisson afficherUnProduit(@PathVariable Long id) {
        return dao.findById(id);
    }
}
