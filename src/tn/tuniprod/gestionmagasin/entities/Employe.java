/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin.entities;

/**
 *
 * @author Legion
 */
public abstract class Employe {

    protected int id;
    protected String nom;
    protected String adresse;
    protected int nbr_heures;

    public Employe() {
    }
    
    
    public Employe(int id , String nom, String adresse, int nbr_heures) {
        
        this.adresse = adresse; 
        this.id=id;
        this.nom=nom;
        this.nbr_heures=nbr_heures;
    }

    @Override
    public String toString()
    {
        return " id : "+ id+ " nom : " +nom+" adresse : "+adresse ;
    }
    
    public abstract float calculerSalaire();

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNbr_heures() {
        return nbr_heures;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNbr_heures(int nbr_heures) {
        this.nbr_heures = nbr_heures;
    }
    
            
}
