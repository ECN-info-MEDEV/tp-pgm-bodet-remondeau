/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.lecturepgm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author bodet
 */
public class Lecture {
    protected String path;
    protected BufferedReader fichier;
    
    /**
     * Constructeur du chargement
     * @param nomFichier Nom du fichier à charger
     */
    public Lecture(String nomFichier){
        this.path=nomFichier;
    }

    public String lireFichier() throws IOException{
        System.out.println("Chargement du fichier "+this.path+" ...");        
        try{
            this.fichier = new BufferedReader(new FileReader(this.path));
        }
        catch(FileNotFoundException e){
        }
        String ligne;
        ligne = this.fichier.readLine(); // P2
        ligne = this.fichier.readLine(); // commentaire
        ligne = this.fichier.readLine(); // hauteur et largeur

        ArrayList<String> ligneListe;
        
        ligneListe = ligneAListe(ligne);
        
        int largeur = Integer.parseInt(ligneListe.get(0));
        int hauteur = Integer.parseInt(ligneListe.get(1));
        
        int[][] image =  new int[largeur][hauteur];
        
        
        
        
        
        
        while (ligne!=null){
            
        }
        return null;
        
    }
    
    
    public int[] ligneAListe(String ligne){
        String delimiteurs = " ,.;";        
        StringTokenizer tokenizer = new StringTokenizer(ligne, delimiteurs);
        int[] liste = new int[70];
        String mot;
        int a;
        int i=0;
        
        while(tokenizer.hasMoreTokens()) {
            // nextToken() retourne la prochaine unite lexicale decoupee par les delimiteurs
            mot = tokenizer.nextToken();
            a = Integer.parseInt(mot);
            liste.add(a);
        }
        return liste;
    }    
}
