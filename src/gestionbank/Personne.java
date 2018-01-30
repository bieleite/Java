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
public class Personne 
{
    private String nom;
    private String prenom;
    private String adresse;
    private Date  dtnaissance;
    public Personne (String n, String p, String a, Date d)
    {
        nom = n;
        prenom = p;
        adresse = a;
        dtnaissance = d;
    }
    public String getNom() 
    {
        return nom;
    }
    public void setNom(String Nom) 
    {
        this.nom = nom;
    }
    public String getPrenom() 
    {
        return prenom;
    }
    public void setPrenom(String Prenom) 
    {
        this.prenom = prenom;
    }
    public String getAdresse() 
    {
        return adresse;
    }
    public void setAdresse(String adresse) 
    {
        this.adresse = adresse;
    }
    public Date getDtnaissance() 
    {
        return dtnaissance;
    }
    public void setDtnaissance(Date adresse) 
    {
        this.dtnaissance = adresse;
    }
    
}
