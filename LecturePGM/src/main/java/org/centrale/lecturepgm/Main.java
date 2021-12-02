/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.lecturepgm;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author remondeau
 */
public class Main {

    public static Image getImageFromArray(int[] pixels, int width, int height) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        WritableRaster raster = (WritableRaster) image.getData();
        System.out.println(pixels.length + " " + width + " " + height);
        raster.setPixels(0,0,width,height,pixels);
        return image;
    }
    
    
    public static void main(String[] args) throws IOException{
        JFrame jf = new JFrame();
        JLabel jl = new JLabel();

        Lecture lisons = null;
        int[][] image = lisons.lireFichier();
        
        int largeur = image.length;
        int hauteur = image[0].length;
        
        ImageIcon ii = new ImageIcon(getImageFromArray(image,largeur,hauteur));
        jl.setIcon(ii);
        jf.add(jl);
        jf.pack();
        jf.setVisible(true);
        
        
        
        Ecriture test = new Ecriture();
        
        int test2 = 10;
        
       
    }
    
}
