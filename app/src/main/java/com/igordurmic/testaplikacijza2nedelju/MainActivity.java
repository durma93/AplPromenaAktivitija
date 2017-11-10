package com.igordurmic.testaplikacijza2nedelju;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnReg , btnLog;
    private ArrayList<Korisnik> korisnici = new ArrayList<>();
    private EditText editTextIme;
    private EditText editTextSifra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        korisnici.add(new Korisnik("Igor", "Durmic", "123", "555"));
        korisnici.add(new Korisnik("Ivan", "Djordjevic", "321", "777"));

        btnReg = findViewById(R.id.buttonRegistracijaNaLoginu);
        btnLog = findViewById(R.id.buttonLogin);
        editTextIme = findViewById(R.id.editTextLogInIme);
        editTextSifra = findViewById(R.id.edittextLogInsifra);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pozoviAktivnostRegistracije();
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pozoviAktivnostiLogin();
            }
        });

        dodajRegistrovaniKontakt();
    }

    public void pozoviAktivnostRegistracije(){
        Intent i = new Intent(MainActivity.this, AktivityRegistracije.class);
        startActivity(i);

    }

    public void pozoviAktivnostiLogin(){
        Intent intent = new Intent(MainActivity.this, Ispis.class);
        Korisnik korisnik = null;
        String ime = editTextIme.getText().toString();
        String sifra = editTextSifra.getText().toString();

        for (int i=0;i<korisnici.size();i++){
            korisnik = korisnici.get(i);

            if(ime.equals(korisnici.get(i).getIme()) && sifra.equals(korisnici.get(i).getSifra())) {
                korisnik = korisnici.get(i);
                intent.putExtra("KORISNIK", korisnik);
                startActivity(intent);
            }
        }

    }

    public void dodajRegistrovaniKontakt() {
        Intent intent = getIntent();
        Korisnik korisnik = (Korisnik) intent.getSerializableExtra("KORISNIK");
        korisnici.add(korisnik);
    }
}
