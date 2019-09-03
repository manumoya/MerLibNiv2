package com.merlib.modelos;

public class Request {
    private String[] dna;

    public String[] getDna() {
        return dna;
    }

    public void setDna(String[] dna) {
        this.dna = dna;
    }

    public Request(String[] dna) {
        this.dna = dna;
    }
}
