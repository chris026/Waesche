/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wäsche;

/**
 *
 * @author Christian
 */
public class Wäschleine {
    
    private final int nummer;
    private Person person;
    
    public Wäschleine(int nummer) {
        this.nummer = nummer;
        person = null;
    }
    
    int getNummer() {
        return nummer;
    }
    
    boolean getBelegt() {
        return person != null;
    }
    
    Person getPerson() {
        return person;
    }
    
    boolean WäscheAufhängen(Person person) {
        if (getBelegt()) {
            return false;
        } else {
            this.person = person;
            return true;
        }
    }
    
    boolean WäscheAbhängen() {
        if (person == null) {
            return false;
        } else {
            person = null;
            return true;
        }
    }
}