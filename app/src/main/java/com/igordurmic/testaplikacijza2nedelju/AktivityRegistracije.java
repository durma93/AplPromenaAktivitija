package com.igordurmic.testaplikacijza2nedelju;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AktivityRegistracije extends AppCompatActivity {

    EditText editIme, editPrezime, editTelefon, editSifra;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivity_registracije);

        editIme = (EditText) findViewById(R.id.editTextIme);
        editPrezime = (EditText) findViewById(R.id.editTextPrezime);
        editSifra = (EditText) findViewById(R.id.editTextSifra);
        editTelefon = (EditText) findViewById(R.id.editTextTelefon);

        btnRegister = (Button) findViewById(R.id.buttonSaveRegistracija);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pozoviAktivnostRegistruj();
            }
        });
    }


    public void pozoviAktivnostRegistruj() {
        Intent intent = new Intent(AktivityRegistracije.this, MainActivity.class);
        String ime = editIme.getText().toString();
        String prezime = editPrezime.getText().toString();
        String telefon = editTelefon.getText().toString();
        String sifra = editSifra.getText().toString();

        Korisnik korisnik = new Korisnik(ime, prezime, sifra, telefon);

        intent.putExtra("KORISNIK", korisnik);
        startActivity(intent);
    }
}
