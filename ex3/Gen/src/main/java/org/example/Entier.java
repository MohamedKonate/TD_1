package org.example;

import java.util.Objects;

public class Entier implements Sommable<Entier> {

    private final Integer value = null;

    public Entier(final Integer val) {
    }

    @Override
    public Entier sommer(Entier v) {
        return new Entier(this.value + v.getVal());
    }

    public Integer getVal() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Entier entier = (Entier) o;
        return Objects.equals(value, entier.value);
    }


    @Override
    public String toString() {
        return "Entier[" +
                "value=" + value +
                ']';
    }

}

