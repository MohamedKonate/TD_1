package org.example;

import java.util.Set;

public class Feuille<T> implements Arbre<T> {
    private final T valeur;
    private T value;

    public Feuille(T valeur) {
        this.valeur = valeur;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(final T val) {
        this.value = value;
        return value.equals(this.valeur);
    }

    @Override
    public Set<T> valeurs() {
        return Set.of(this.valeur);
    }

    @Override
    public T somme() {
        return valeur;
    }

    @Override
    public boolean estTrie() {
        return false;
    }

    @Override
    public T sommer(T a1) {
        return null;
    }
}