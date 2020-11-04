/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wäsche;

import java.time.LocalDate;

/**
 *
 * @author Christian
 */
public class Person {
    
    private final String vorname;
    private final LocalDate geburtstag;
    private final int zimmer_nr;
    
    public Person(String vorname, LocalDate geburtstag, int zimmer_nr) {
        this.vorname = vorname;
        this.geburtstag = geburtstag;
        this.zimmer_nr = zimmer_nr;
    }
    
    String getVorname() {
        return vorname;
    }
    
    LocalDate getGeburtstag() {
        return geburtstag;
    }
    
    int getZimmer_Nr() {
        return zimmer_nr;
    }
}