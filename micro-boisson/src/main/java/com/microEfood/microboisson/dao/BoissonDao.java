package com.microEfood.microboisson.dao;

import com.microEfood.microboisson.entite.Boisson;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/*
 * !!!!!!!!!!!!! Ici ajouter une description de ce qu'est sensée faire la classe !!!!!!!!!!!!!
 *
 * Créée par charles.balet le 25/07/19
 *
 */
@Repository
public class BoissonDao {

    public static List<Boisson> boissons=new ArrayList<>();
    static {
        boissons.add(new Boisson(1L, "Orangina", 1.5));
        boissons.add(new Boisson(2L, "Coca Cola", 1.5));
        boissons.add(new Boisson(3L, "Café", 1.0));
    }

    public List<Boisson>findAll() {
        return boissons;
    }

    public Boisson findById(Long id) {
        for (Boisson boisson : boissons) {
            if(boisson.getId() == id){
                return boisson;
            }
        }
        return null;
    }

    public Boisson save(Boisson boisson) {
        boissons.add(boisson);
        return boisson;
    }
}
