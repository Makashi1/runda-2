package com.sda.kolejka;

public class Kolejka {

    int[] tablica = new int[10];
    int koniecTablicy = 0;


    @Override
    public String toString() {
        return "Kolejka{" +
                "koniecTablicy=" + koniecTablicy +
                '}';
    }

    public void add(int liczba) {
        tablica[koniecTablicy] = liczba;
        koniecTablicy++;


    }





    }