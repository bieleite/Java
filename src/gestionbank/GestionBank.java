/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbank;

import java.util.Date;

/**
 *
 * @author 6171217
 */
public class GestionBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n,m,a;
        Date d;
        int nn;
        float mn;
        
        Personne c;
        System.out.println("Donner le Nom de la personne");
        n=Clavier.lireString();
        System.out.println("Donner le Prenom de la personne");
        m=Clavier.lireString();
        System.out.println("Donner l'Adresse  de la personne");
        a=Clavier.lireString();
        System.out.println("Donner la Dt Naissance de la personne");
        
            
                
                int y,t,j;
                System.out.print("saisir l'année");
                y=Clavier.lireInt();
                System.out.print("saisir le mois");
                t=Clavier.lireInt();
                System.out.print("saisir le jour");
                j=Clavier.lireInt();
                d=new Date(y-1900,t-1,j);
                
           
        
        c=new Personne (n,m,a,d);
        System.out.println("Personne A" );
        System.out.println(" Nom : " + c.getNom());
        System.out.println(" prenom : " + c.getPrenom());
        System.out.println(" adresse : " + c.getAdresse());
        System.out.println(" dtnaissance: " + c.getDtnaissance());
        Personne b;
        
        Compte c1,c2;
        float cc;
        System.out.println("Donner le montant du 1º compte a créer.");
        cc=Clavier.lireFloat();
        c1= new Compte(cc);
        c2= new Compte ();
        float mon=c1.getMontant();
        System.out.println("solde"+mon);
        mon=c2.getMontant();
        System.out.println("Solde"+mon);
        System.out.println("Donner le montant du dépôt pour le 1er compte");
        cc=Clavier.lireFloat();
        c1.depot(cc);
        System.out.println("Donner le montant du dépôt pour le 2eme compte:");
        cc=Clavier.lireFloat();
        c2.depot(cc);
        mon=c1.getMontant();
        System.out.println("solde"+mon);
        mon=c2.getMontant();
        System.out.println("solde"+mon);
        
        // TODO code application logic here
        
    }
    
}
