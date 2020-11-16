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
public class Vendeur extends Employe{
    
    private float tauxDeVente; 
    public Vendeur(int id,String adresse, String nom,int nbr_heures,float tauxDeVente)
    {
        super(id, nom, adresse, nbr_heures);
        this.tauxDeVente=tauxDeVente;
        
    }

    public void setTauxDeVente(float tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    public float getTauxDeVente() {
        return tauxDeVente;
    }

    @Override
    public float calculerSalaire() {
        
        
        
        return (450*tauxDeVente) ; 
        
      
    }
    
    
    
}
