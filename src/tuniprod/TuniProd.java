/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuniprod;

import tn.tuniprod.gestionmagasin.entities.Produit;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import tn.tuniprod.gestionmagasin.entities.Caissier;
import tn.tuniprod.gestionmagasin.entities.Magasin;
import tn.tuniprod.gestionmagasin.entities.ProduitFruit;
import tn.tuniprod.gestionmagasin.entities.ProduitLegume;
import tn.tuniprod.gestionmagasin.entities.Responsable;
import tn.tuniprod.gestionmagasin.entities.Vendeur;
import tn.tuniprod.gestionmagasin.exception.MagasinPleinException;
import tn.tuniprod.gestionmagasin.exception.PrixNegatifException;

/**
 *
 * @author Legion
 */
public class TuniProd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produit produitVide = new Produit();
        Produit p1 = new Produit(1021, "Lait", "Delice");
        Produit p2 = new Produit(2510, "Yaourt", "Vitalait");
        Produit p3 = new Produit(3250, "Tomate", "Sicam", 1.200f);

        produitVide.afficher();
        p1.afficher();
        p2.afficher();
        p3.afficher();
        System.out.println("\n******************************\n");
       
        p1.afficher();
      

        System.out.println("\n******************************\n");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    
     
        
        System.out.println("\n \n ********************Prosit 4 **********************\n \n");
            Magasin m1 = new Magasin("Manzah 6", 1);
        Magasin m2 = new Magasin("Centre-Ville", 2);
        
        Caissier c1 = new Caissier(6,"Ahmed", "Nabeul",8,6);
        Caissier c2 = new Caissier(7,"Mounir", "Bizerte",190,2);
        Caissier c3 = new Caissier(7,"Mounir", "Bizerte",10,2);
        
        Vendeur v1 = new Vendeur(8, "Manzah ", "Mohamed", 25, 10.2f);
        Vendeur v2 = new Vendeur(9, "Nassr ", "Sami", 29, 26.4f);
        Vendeur v3 = new Vendeur(10, "Nassr ", "Achraf", 8, 28.4f);
        
        Vendeur v4 = new Vendeur(8, "Manzah ", "Mohamed", 25, 1.2f);
        Vendeur v5 = new Vendeur(9, "Nassr ", "Sami", 29, 26.4f);
        Vendeur v6 = new Vendeur(10, "Nassr ", "Achraf", 8, 28.4f);
        
        Responsable r1 = new Responsable(11, " Ala", "Carthage", 45,10);
        Responsable r2 = new Responsable(12, " Mouhib", "Carthage", 45,10);
        
       m1.ajouterEmploye(r1);
       m1.ajouterEmploye(v1);
       m1.ajouterEmploye(c1);
       m1.ajouterEmploye(c2);
       
       m2.ajouterEmploye(r2);
       m2.ajouterEmploye(c3);
       m2.ajouterEmploye(v4);
       m2.ajouterEmploye(v5);
       m2.ajouterEmploye(v6);
      
      /*  m1.ajouterProd(p1);
      m1.ajouterProd(p2);

      
    m2.ajouterProd(p3);
      m2.ajouterProd(p2);
      */
        System.out.println(m1.toString());
        
        System.out.println("Le salaire de "+r1.getNom() +" est : " + r1.calculerSalaire());
        System.out.println("Le salaire de "+v4.getNom() +" est : " + v4.calculerSalaire());
        System.out.println("Le salaire de "+c2.getNom() +" est : " + c2.calculerSalaire());
        
        // déclaration des fruits et légumes 
        
        Produit f1 = new ProduitFruit(1254, "Fraise", "Mars", 12.3f);
        Produit f2 = new ProduitFruit(154, "Patseque", "Juin", 50);
        Produit f3 = new ProduitFruit(1987, "Mandarine", "Decembre", 25.6f );
        Produit l1 = new ProduitLegume(1983, "Artichauts", "Janvier", 14 );
        
        // ajout dans magasin 
        


        System.out.println(m1);
        System.out.println("le produit est un : "  +  Produit.determinerTypeProduit(l1));
        System.out.println("le magasin a m1 a une qte de "+m1.calculStock()+"Fruit");
        System.out.println("la saison de la fraise est-elle la ? "+((ProduitFruit)f1).estFrais("Avril"));
           
        try {
            p1.setPrix(-0.500f);
        } catch (PrixNegatifException ex)
        {
            System.err.println(" le prix est négatif");
        } catch (ArithmeticException n)
        {
            System.err.println("aaa");
        } finally {
            System.err.println(" bloc finally");
        }

               
        
        

    }

}
