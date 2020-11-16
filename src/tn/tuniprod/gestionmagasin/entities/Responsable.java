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
public class Responsable extends Employe {

    private int prime;

    public Responsable(int id, String nom, String adresse, int nbr_heures, int prime) {
        super(id, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    public int prime() {
        return prime;
    }

    @Override
    public float calculerSalaire() {

        float salaire;

        if (nbr_heures < 160) {
            salaire = nbr_heures * 10;
        } else {
            salaire = (nbr_heures - 160) * 12 + 1600;
        }
        return salaire;

    }

}
