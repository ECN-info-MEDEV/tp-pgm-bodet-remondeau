/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.switchtest;

/**
 *
 * @author bodet
 */
public class SwitchTest {

    public static void main(String[] args) {
        String color = "red";
        String colorRGB;
        if (color.equals("black")) {
            colorRGB = "000000";
        } else if (color.equals("red")) {
            colorRGB = "ff0000";
        } else if (color.equals("green")) {
            colorRGB = "008000";
        } else if (color.equals("blue")) {
            colorRGB = "0000ff";
        } else {
            colorRGB = "Invalid color";
        }
        System.out.println(colorRGB);
    }
}
