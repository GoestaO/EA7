/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a73;

import java.io.FileNotFoundException;

/**
 * Implementierung der eigenen Ausnahme DateiNichtGefundenAusnahme. Der Konstruktor dieser Klasse bekommt den Dateinamen als String übergeben.
 * @author goesta
 */
public class DateiNichtGefundenAusnahme extends FileNotFoundException {

    private String dateiname;

    public DateiNichtGefundenAusnahme(String dateiname) {
        super("Datei wurde nicht gefunden.");
        this.dateiname = dateiname;
    }

    /**
     * Mit Hilfe dieser Methode kann die Ausnahme nach dem Namen der nicht
     * gefundenen Datei gefragt werden.
     *
     * @return
     */
    public String liefereDateinamen() {
        return dateiname;
    }

    public void setzeDateinamen(String dateiname) {
        this.dateiname = dateiname;
    }

}
