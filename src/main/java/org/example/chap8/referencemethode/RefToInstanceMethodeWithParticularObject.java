package org.example.chap8.referencemethode;

import java.util.function.Consumer;

class Personne {
    public void afficheDetail(String infos) {
        String[] tab = infos.split(",");
        System.out.println("Nom: " + tab[0]);
        System.out.println("Prénom: " + tab[1]);
        System.out.println("Date de naissance: " + tab[2]);
    }
}
public class RefToInstanceMethodeWithParticularObject {

    public void afficherMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        RefToInstanceMethodeWithParticularObject exemple = new RefToInstanceMethodeWithParticularObject();
        Consumer<String> consumer = exemple::afficherMessage;
        consumer.accept("Bonjour, monde!"); // Affiche "Bonjour, monde!"

        Personne pers = new Personne();
        Consumer<String> affDetail = pers::afficheDetail;
        affDetail.accept("blabla, toto, 02/02.80");
    }
}
