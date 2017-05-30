package com.example;

import java.util.UUID;

/**
 * Created by Jernej on 6. 03. 2017.
 */

public class Trashcan {


    String id;
    private String naziv;
    private String opis;




    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Trashcan(String naziv, String opis) {
        this.id =  UUID.randomUUID().toString().replaceAll("-", "");;
        this.naziv = naziv;
        this.opis = opis;

    }

    @Override
    public String toString() {
        return
                "ID='" + id + '\''+
                "Naziv='" + naziv + '\''+
                "Opis='" + opis + '\'';


    }
}
