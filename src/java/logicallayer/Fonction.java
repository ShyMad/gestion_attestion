/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicallayer;

import java.util.ArrayList;

/**
 *
 * @author YASSALIE
 */
public class Fonction {
    private long id;
    private String libelle;
    private ArrayList users;
    
    public Fonction() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    
}
