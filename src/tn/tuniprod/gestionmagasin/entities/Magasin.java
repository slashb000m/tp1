/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin.entities;
import tn.tuniprod.gestionmagasin.exception.MagasinPleinException;
/**
 *
 * @author Legion
 */
public class Magasin {

    private int id;
    private String adresse;
    private final int CAPACITE = 50;
    private final int CAPACITE_EMP = 20;
    private Produit tabProd[] = new Produit[2];
    private Employe tabEmploye[] = new Employe[CAPACITE_EMP];
    int nbProd = 0;
    int nbEmploye = 0;
    public static int nbtotale; // variable de classe 

    public Magasin(String adresse, int id) {
        this.id = id;
        this.adresse = adresse;
        nbtotale++;
    }

    public void ajouterProd(Produit prod) throws MagasinPleinException {
         if (nbProd < CAPACITE ) {
            tabProd[nbProd] = prod;
            nbProd++;
            System.out.println(" Le produit est ajouté \n");
        } else {
            throw new MagasinPleinException("magasin plein!!!!");
        }
         
        try {
            tabProd[nbProd] = prod;
            nbProd++;
       } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("le magasin est plein");
        }

    }

    @Override
    public String toString() {
        String ch1 = "";
        String ch2 = "";
        String ch3 = " les employés : \n";
        ch1 = "identifiant : " + id + " adresse : " + adresse + " "
                + "nombre de produit : " + nbProd;
        for (int i = 0; i < nbProd; i++) {
            ch2 = ch2 + tabProd[i] + "\n";
        }
        for (int i = 0; i < nbEmploye; i++) {
            ch3 = ch3 + tabEmploye[i] + "\n";
        }

        return (ch1 + ch2 + ch3);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTabProd(Produit[] tabProd) {
        this.tabProd = tabProd;
    }

    public void setNbProd(int nbProd) {
        this.nbProd = nbProd;
    }

    public int getId() {
        return id;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCAPACITE() {
        return CAPACITE;
    }

    public Produit[] getTabProd() {
        return tabProd;
    }

    public int getNbProd() {
        return nbProd;
    }

    public boolean rechercherProduit(Produit p) {
        boolean test = false;
        for (int i = 0; i < nbProd && test == false; i++) {
            if (p.comparer(tabProd[i]) == true) {
                test = true;
            }
        }

        return test;
    }

    public void supprimperProduit(Produit p) {
        if (rechercherProduit(p) == false) {
            System.out.println(" le produit n'existe pas dans le magasin");
        } else {
            boolean test = false;
            for (int i = 0; i < nbProd && test == false; i++) {
                if (p.comparer(tabProd[i]) == true) {
                    test = true;
                    tabProd[i] = null;
                }
            }

            System.out.println("Le produit a été supprimé");
        }
    }

    public static String comparerMagasin(Magasin m1, Magasin m2) {
        String ch;
        if (m1.nbProd > m2.nbProd) {
            ch = "magasin id : " + m1.id + " a plus de produit que magasin id " + m2.id;
        } else if (m1.nbProd < m2.nbProd) {
            ch = "magasin id : " + m2.id + " a plus de produit que magasin id " + m1.id;
        } else {
            ch = "le nombre de produit est égal";
        }
        return ch;

    }

    public void ajouterEmploye(Employe e) {
        if (nbEmploye < 20) {
            tabEmploye[nbEmploye] = e;
            nbEmploye++;
            System.out.println("l'employé " + e.nom + " a été ajouté !");
        } else {
            System.out.println("nombre maximum d'employé atteint dans le magasin ");
        }

    }

    public float calculStock() {
        float res = 0.0f;
        for (int i = 0; i < nbProd; i++) {
            if (tabProd[i] instanceof ProduitFruit) {
                res += ((ProduitFruit) tabProd[i]).getQuantite(); // ici on afait une substitution pour indiquer 
                // que tabproduit[i] est un fruit avant d'étre un produit 
            }
        }
        return res;
    }

}
