package com.example.tirsdagtomcat.Entities.Entitet;

import java.util.ArrayList;

public class Person
{
    String navn;
    String kode;
    String rolle;
    ArrayList<String> huskeliste;

    public Person(String navn, String kode)
    {
        this.navn = navn;
        this.kode = kode;
        this.rolle = "bruger";
        this.huskeliste=new ArrayList<>();
    }

    public Person(String navn, String kode, String rolle)
    {
        this.navn = navn;
        this.kode = kode;
        this.rolle = rolle;
        this.huskeliste=new ArrayList<>();
    }

    public void addToHuskeListe(String s)
    {
        huskeliste.add(s);
    }

    public String getNavn()
    {
        return navn;
    }

    public String getKode()
    {
        return kode;
    }

    public String getRolle()
    {
        return rolle;
    }

    public ArrayList<String> getHuskeliste()
    {
        return huskeliste;
    }
}
