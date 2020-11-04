/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wäsche;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Christian
 */

public class JDOMWriter {
    
    private Element root;
    private Document doc;
    
    public void createDoc() {
        root = new Element("Personen");
        doc = new Document(root);
    }
    
    public void personHinzufügen(Person person) {
        Element oberElement = new Element("Person");
        
        Element vorname = new Element("vorname");
        vorname.setText(person.getVorname());
        
        Element geburtstag = new Element("geburtstag");
        geburtstag.setText(String.valueOf(person.getGeburtstag()));
        
        Element zimmer_nr = new Element("zimmer_nr");
        zimmer_nr.setText(String.valueOf(person.getZimmer_Nr()));
        
        oberElement.addContent(vorname);
        oberElement.addContent(geburtstag);
        oberElement.addContent(zimmer_nr);
        
        root.addContent(oberElement);
    }
    
    public void writeXML() {
        try {
            XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());
            outputter.output(doc, new FileOutputStream("personen.xml"));
        } catch (IOException ex) {
            Logger.getLogger(JDOMWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}