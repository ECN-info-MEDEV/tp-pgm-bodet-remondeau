/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.lecturepgm;

/**
 *
 * @author remondeau
 */
public class Main {
    
    public static void main(String[] args){
        
        Ecriture test = new Ecriture();
        
        int[][] test2 = new int[512][512];
        
        
        for (int i=0; i<512; i++){
            for (int j=0; j<512; j++){
                test2[i][j] = (i+j)%255;
            }
        }
        
        test.ecrire(test2, null);
       
    }
    
}
