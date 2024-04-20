/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.angry_birds;

/**
 *
 * @author Estudiante
 */
public class Angry_Birds {

    public static void main(String[] args) {
        
        PERSONAJE redper = new PERSONAJE (20, "red_bird_sound", "red_bird_model");
        BIRDS redbird = new BIRDS( 5, "normal", redper);
        
        PERSONAJE cerdoreyper = new PERSONAJE (20, "risa_sound", "king_pig");
        CERDOS cerdorey = new CERDOS(cerdoreyper, 150);
        
        ESPACIO farlands = new ESPACIO ("campo", 10, 5);
        
    }
}
