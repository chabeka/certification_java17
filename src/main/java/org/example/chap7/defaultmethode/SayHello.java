package org.example.chap7.defaultmethode;


public class SayHello implements Message, WarnMaessage{
    /*
     Lorsque la classe implémente plusieurs interface definissant la méthode par défaut, on est obligé de redéfinir la
     méthode de la classe héritante. Sinon le compilateur ne sait pas quelle methode à choisir des deux interface héritée.
     */
    @Override
    public void hello() {
        Message.super.hello();
    }

    /*
    Lorsque la classe implémente plusieurs interface definissant la méthode par défaut avec le même nom et retournant des types
     covariant, la classe qui implément ces interfaces doit implémenter la méthode en retournant le type covariant le plus bas
     (le type enfant le plus bas)
     Dans notre cas "Long" est enfant du type "Number"
     Cela ne fonction pas avec les types primitifs
     */
    @Override
    public Long getNbMessage() {
        return WarnMaessage.super.getNbMessage();
    }

    /*
        Cela ne fonction pas avec les types primitifs
     */
    /*@Override
    public int getLongeurMessage() {
        return Message.super.getLongeurMessage();
    } */
}
