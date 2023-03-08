package com.example.tirsdagtomcat.Entities.Entitet;

public class Person
{
    String navn;
    String kode;
    String rolle;

    public Person(String navn, String kode)
    {
        this.navn = navn;
        this.kode = kode;
        this.rolle = "bruger";
    }

    public Person(String navn, String kode, String rolle)
    {
        this.navn = navn;
        this.kode = kode;
        this.rolle = rolle;
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
}
