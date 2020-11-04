/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wäsche;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Christian
 */
public class Wäsche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person max = new Person("Max", LocalDate.of(2000, Month.JANUARY, 1), 101);
        
        Leinenraum meinRaum = new Leinenraum(6);
        
        meinRaum.getWäscheleine(3).setPerson(max);
        System.out.println("Belegt: " + meinRaum.getWäscheleine(3).getBelegt());
        
    }
}