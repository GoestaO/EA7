/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea7;

import java.io.FileNotFoundException;

/**
 *
 * @author goesta
 */
public class DateiNichtGefundenAusnahme extends FileNotFoundException {

    String dateiname;

    public DateiNichtGefundenAusnahme(String dateiname) {
        super("Datei wurde nicht gefunden.");
    }

    public String liefereDateinamen() {
        return dateiname;
    }

}
