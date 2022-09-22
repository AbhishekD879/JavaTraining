package com.JavaTraining.Day7.EuroProblem;

import java.util.Objects;

public class Euro {
    int value;
    Euro(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Euro euro = (Euro) o;
        return value == euro.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
    Euro addEuro(Euro eur){
        return new Euro(this.value+ eur.getValue());
    }
}
