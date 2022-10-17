package org.example;

import java.util.Set;
public interface Arbre<T> extends Sommable<T> {
    int taille();

    boolean contient(final T val);

    Set<T> valeurs();

    T somme();

    boolean estTrie();

}
