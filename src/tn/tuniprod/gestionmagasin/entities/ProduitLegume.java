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
public class ProduitLegume extends Produit{
    private String saison; 
    private double quantite; 
    
public ProduitLegume(int id, String libelle,String saison, float quantite)
{
    super(id,libelle);
    this.saison= saison;
    this.quantite = quantite;
    
}

    public String getSaison() {
        return saison;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }
}
