package org.example;

public class Chaine implements Sommable<Chaine>, Comparable<Chaine> {
    private String valeur;

    public Chaine(String _valeur) {
        this.valeur = _valeur;
    }

    @Override
    public Chaine sommer(final Chaine valeur) {
        return new Chaine(this.valeur + valeur.getValeur());
    }

    public String getValeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return "Chaine[" +
                "valeur='" + valeur + '\'' +
                ']';
    }

    @Override
    public int compareTo(Chaine autre) {
        return this.valeur.compareTo(autre.getValeur());
    }
}
