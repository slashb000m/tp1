/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin.entities;

import java.util.Date;
import tn.tuniprod.gestionmagasin.exception.PrixNegatifException;

/**
 *
 * @author Legion
 */
public class Produit {

    protected int id;
    protected String libelle;
    protected String marque;
    protected float prix;
    Date date;

    public Produit() {

    }

    public Produit(int id, String libelle, String marque, float prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    public Produit(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;

    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }

    public void afficher() {
        System.out.println("détail du produit : \n"
                + "id =" + id
                + " \nlibelle =" + libelle
                + " \nmarque " + marque
                + " \nprix = " + prix);
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getMarque() {
        return marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(float prix) throws PrixNegatifException{
        if (prix > 0) this.prix = prix;
        else 
        {
            throw new PrixNegatifException("Le prix est négatif");
        }
    }

    @Override
    public String toString() {
        return ("détail du produit : \n"
                + "id =" + id
                + " \nlibelle =" + libelle
                + " \nmarque " + marque
                + " \nprix = " + prix);
    }

    public boolean comparer(Produit p1) {
        boolean test = false;
        if ((this.id == p1.id) && this.libelle.equals(p1.libelle) && this.marque.equals(p1.marque)) {
            test = true;
        }
        return test;
    }

    public static boolean comparer(Produit p1, Produit p2) {

        boolean test = false;

        if (p1.comparer(p2) == true) {
            test = true;
        }
        return test;
    }

    public static String determinerTypeProduit(Produit p) {
        if (p instanceof ProduitLegume) {
            return "Legume";
        } else if (p instanceof ProduitFruit) {
            return "Fruit";
        } else {
            return "Autre";
        }
    }

}
