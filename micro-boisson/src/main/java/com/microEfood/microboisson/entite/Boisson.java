package com.microEfood.microboisson.entite;

import lombok.Getter;
import lombok.Setter;

/*
 * !!!!!!!!!!!!! Ici ajouter une description de ce qu'est sensée faire la classe !!!!!!!!!!!!!
 *
 * Créée par charles.balet le 25/07/19
 *
 */
@Getter
@Setter
public class Boisson {

    private Long id;
    private String nom;
    private Double prix;

    public Boisson(Long id, String nom, Double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }
}
