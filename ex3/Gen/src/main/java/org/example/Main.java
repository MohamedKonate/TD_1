package org.example;
import java.util.List;

public class Main {
    public static <Arbre> void main(String[] args) {
        org.example.Arbre<Integer> f1 = new Feuille<T>(2);
        org.example.Arbre<Integer> r2 = new Noeud<> (List.of(f1,r2));

    }
}