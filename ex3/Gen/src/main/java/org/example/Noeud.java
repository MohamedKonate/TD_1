package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Noeud<T> implements Arbre<T>, Sommable<T> {
    private List<Arbre<T>> fils;

    public Noeud(List<Arbre<T>> fils) {
        this.fils = new ArrayList<>();
    }

    @Override
    public int taille() {
        return 0;
    }

    @Override
    public boolean contient(T value) {
        return false;
    }

    @Override
    public Set<T> valeurs() {
        return null;
    }

    @Override
    public T somme() {
        return null;
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