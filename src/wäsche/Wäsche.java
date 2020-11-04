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
    
    private static final int LEINEN_ANZAHL = 2*2*5;
    
    public static void main(String[] args) {
        Leinenraum meinRaum = new Leinenraum(LEINEN_ANZAHL);
        
        Person[] allePersonen = new Person[20];
        for(int i = 0; i < allePersonen.length; i++) {
            allePersonen[i] = new Person(String.valueOf(i), LocalDate.of(1998, Month.JANUARY, i+1), i);
        }
        
        Person max = new Person("Max", LocalDate.of(2000, Month.JANUARY, 1), 101);
        
        meinRaum.getWäscheleine(3).WäscheAufhängen(max);
        System.out.println("Vorname: " + meinRaum.getWäscheleine(3).getPerson().getVorname());
        
        JDOMWriter writer = new JDOMWriter();
        writer.createDoc();
        writer.personHinzufügen(max);
        
        for(int i = 0; i < allePersonen.length; i++) {
            writer.personHinzufügen(allePersonen[i]);
        }
        
        writer.writeXML();
    }
}