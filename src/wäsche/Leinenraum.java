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
public class Leinenraum {
    
    private final int wäscheleinen;
    private final Wäschleine[] meineWäscheleinen;
    
    public Leinenraum(int wäscheleinen) {
        this.wäscheleinen = wäscheleinen;
        meineWäscheleinen = new Wäschleine[wäscheleinen];
        
        for (int i = 0; i < wäscheleinen; i++) {
            meineWäscheleinen[i] = new Wäschleine(i);
        }
    }
    
    int getWäscheleinenAnzahl() {
        return wäscheleinen;
    }
    
    Wäschleine getWäscheleine(int nummer) {
        return meineWäscheleinen[nummer];
    }
}