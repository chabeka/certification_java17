package org.example.chap7.enums;

public enum Mois {
    JANVIER(31),
    FEVRIER(28) {
        public void printDescription() {
            System.out.println("Description: Année bissectile");
        }
    },
    MARS(31),
    AVRIL(30),
    MAI(31),
    JUIN(30),
    JUILLET(31),
    AOUT(31),
    SEPTEMBRE(30),
    OCTOBRE(31),
    NOVEMBRE(30),
    DECEMBRE(31);

    private int jours;

    Mois(int jours) {
        this.jours = jours;
    }

    public int getJours() {
        return jours;
    }

    private void setJours(int jours) {
        this.jours = jours;
    }

    public void setFevrier(int jours) {
        this.setJours(jours);
    }

    void printDescription() {
        System.out.println("Description: Mois");
    }
}
