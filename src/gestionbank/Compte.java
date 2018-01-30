/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbank;

/**
 *
 * @author 6171217
 */
public class Compte {

    private float Montant;
    public Compte(float mon)
    {
   
        Montant=mon;
    }
     public Compte()
    {
        Montant=0;
    }
    public float getMontant() 
    {
        return Montant;
    }
    public void retirer (float mon)
    {
        Montant =Montant - mon;
    }
    public void depot (float mon)
    {
        Montant =Montant + mon;
    }
}
