package com.igordurmic.testaplikacijza2nedelju;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ispis extends AppCompatActivity {

    Korisnik korisnik;
    String ime, prezime, telefon, sifra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ispis);

        Intent intent = getIntent();
        korisnik = (Korisnik) intent.getSerializableExtra("KORISNIK");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Ime: " + korisnik.getIme() + '\n' + "Prezime: " +
                korisnik.getPrezime() + '\n' + "Sifra: " + korisnik.getSifra() + '\n' + "Telefon: " + korisnik.getTelefon());

    }
}
