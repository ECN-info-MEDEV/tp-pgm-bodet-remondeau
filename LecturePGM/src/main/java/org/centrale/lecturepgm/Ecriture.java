/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.lecturepgm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author remondeau
 */
public class Ecriture {

    private String path;

    public Ecriture(String path) {

        if (path.endsWith(".pgm")) {
            this.path = path;
        } else {
            System.out.println("Mauvaise extension de fichier. La sortie sera nommée sortie.pgm.");
            this.path = "sortie.pgm";
        }
    }

    public Ecriture() {

        this.path = "sortie.pgm";
    }

    public void ecrire(int[][] input, String comment){
        int largeur = input[0].length;
        int hauteur = input.length;
        String res = "P2\n#" + comment + "\n" +largeur+" "+hauteur+"\n512\n";
        
        
        
        int char_counter = 0;
        String converted_int = "";
        for (int[] ligne: input){
            for (int i: ligne){
                converted_int = String.valueOf(i);
                char_counter += converted_int.length()+1;
                if (char_counter>48){
                    res += "\n"+converted_int+" ";
                    char_counter = converted_int.length();
                }else{
                    res += converted_int +" ";
                }
            }
        }
        
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(this.path, true));
            writer.append(res);

        writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Ecriture.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
