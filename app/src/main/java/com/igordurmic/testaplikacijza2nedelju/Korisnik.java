package com.igordurmic.testaplikacijza2nedelju;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by igordurmic on 9.11.17..
 */

public class Korisnik implements Serializable {

    private String ime, prezime, sifra, telefon;


    public Korisnik() { }

    public Korisnik(String ime, String prezime, String sifra, String telefon) {
        this.ime = ime;
        this.prezime = prezime;
        this.sifra = sifra;
        this.telefon = telefon;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

}
