package org.example.chap7.record;

import java.time.LocalDate;

/**
 *  Les records permettent de définir des classes de données immuables de manière concise
 *  un record avec trois composants (size,marque,expires)
 * @param size
 * @param marque
 * @param expires
 */
public record RecordConstructor (int size, String marque, LocalDate expires){

    public static int MAX_STORAGE = 100;

    // On ne peut pas assigner de variable d'instance dans un record
    // final int score = 10;

    // Contructeur par defaut (contructeur canonique)
    // DOES NOT COMPILE => si il existe un constructeur compact qui est un constructeur par defaut
    /*public RecordConstructor(int size, String marque, LocalDate expires) {
        this.size = size;
        this.marque = marque;
        this.expires = expires;
    }*/

    public RecordConstructor{
        // on ne peut pas redefinir les composant vu qu'il sont implicitement final
        // this.marque = marque;
    }
    //Overloaded constructor
    public RecordConstructor() {
        //For this reason, the first line must be a call to another constructor,
        this(0, "", LocalDate.now());
    }

    //Overloaded constructor
    public RecordConstructor(int size, String marque) {
        //For this reason, the first line must be a call to another constructor,
        this(size, marque, LocalDate.now());

    }

    //Overloaded constructor (mixed up order of arg)
    public RecordConstructor(int size, LocalDate expires, String marque) {
        this(size, marque, expires);
    }

    //Non-canonical record constructor must delegate to another constructor
    //An overloaded record constructor must begin with an explicit call to another constructor via this()
    /* public RecordConstructor(LocalDate expires) {
    this.size = 0;
    this.marque="a";
    this.expires = expires;
    }*/

    // Lorsqu'on redefinit les getter, il n'es pas permit de reduire la visibilité de la methode (public => package-private)
    // @Override String toString() { return null; }

    // il est possible de redefinir les getters
    @Override
    public String marque(){
        return marque;
    }
}
