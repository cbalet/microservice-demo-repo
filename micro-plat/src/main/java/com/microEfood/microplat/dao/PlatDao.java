package com.microEfood.microplat.dao;

import com.microEfood.microplat.entite.Plat;
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
public class PlatDao {

    public static List<Plat> plats=new ArrayList<>();
    static {
        plats.add(new Plat(1L, "Burger", 11.0));
        plats.add(new Plat(2L, "steack tartare", 15.0));
        plats.add(new Plat(3L, "Dorade", 13.0));
    }

    public List<Plat>findAll() {
        return plats;
    }

    public Plat findById(Long id) {
        for (Plat plat : plats) {
            if(plat.getId() == id){
                return plat;
            }
        }
        return null;
    }

    public Plat save(Plat plat) {
        plats.add(plat);
        return plat;
    }
}