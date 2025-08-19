package org.example.chap7.record;

import javax.swing.*;

public record RecordWithVarargs(String... informations) {

    public RecordWithVarargs(String nom) {
        this(new String[]{nom});
    }

    @Override
    public String[] informations() {
        return this.informations;
    }

}
