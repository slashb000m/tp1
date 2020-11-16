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
public class Caissier extends Employe{
    
    private int numC;

    public Caissier(int id , String nom, String adresse, int nbr_heures,int numC) {
        super(id, nom, adresse, nbr_heures);
        this.numC = numC;
    }
    //aaaaaaaaaaaaaaaaaaaaaaaaaa
//ccccccccccccccccccccccccc

    public Caissier()
    {
        
    }

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    @Override
    public float calculerSalaire() {
          float salaire;

        if (nbr_heures < 180) {
            salaire = nbr_heures * 5;
        } else {
            salaire = (nbr_heures - 180) * 11.5f + 900;
        }
        return salaire;
        
    }

    
    
    
}
