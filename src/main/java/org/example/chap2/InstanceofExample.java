package org.example.chap2;

import java.util.List;

/**
 * l'opérateur instanceof est utilisé pour vérifier si un objet est une instance d'une classe spécifique
 * ou d'une sous-classe de cette classe. Il est particulièrement utile pour les vérifications
 * de type lors de l'utilisation de polymorphisme et de castings
 */
public class InstanceofExample {

    public static void main(String[] args) throws Exception {
        new InstanceofExample().instanceofScope();
    }

    void usage() {
        Exception exception = new Exception();
        Throwable t = new Throwable();
        String s = "hello";
        if (exception instanceof Throwable) {
            System.out.println("It's an instance of Throwable");
        }
        if (exception instanceof Exception) {
            System.out.println("It's an instance of Exception");
        }

        //this won't compile : Inconvertible types; cannot cast 'java.lang.String' to 'java.lang.Throwable'
        /*
        if(s instanceof Throwable){
                    System.out.println("It's an instance of Throwable");
                }
        */
    }

    void nullInstanceof() {
        //this always returns false!
        if (null instanceof String) {
            System.out.println("It's null");
        } else {
            System.out.println("It's not");
        }
        Object object = new String("A");
        //this does not compile!
        // if(object instanceof null){}

    }

    void instanceofScope() throws Exception {
        Object fish = "fish";

        if (!(fish instanceof String guppy)) {
            System.out.print("Eat!");
            return;
        }
        //here I can access to guppy...because If I am here
        //that means that fish is an instance of String!
        System.out.println(" guppy = " + guppy);

        //Based on flow scoping, guppy is in scope after lines if the type is not a String.
        // In this case, the next line declares a variable guppy that is a duplicate of the
        // previously defined local variable defined on line 41.

        //TODO - review this
        /*    else if (!(fish instanceof String guppy)) {
                throw new RuntimeException();
         }*/
        System.out.print("Swim!");

        /*Les "pattern variables" (variables de liaison déclarées dans les modèles) utilisent une portée sensible au flux .
        Contrairement aux variables locales ordinaires, qui sont dans la portée de régions contiguës,
        les "pattern variables" sont dans la portée où elles seraient définitivement assignées par leur modèle déclarant*/

        if (fish instanceof String str1) {
            //A;
        } else {
            //B;
        }
        // alors str1 est dans la portée de A, mais pas de B, car rien ne garantit qu'une valeur lui sera définitivement
        // attribuée dans les cas où nous atteindrons B. Si nous inversons notre test en utilisant la refactorisation évidente

        if (!(fish instanceof String str2)) {
            //B;
        }
        else {
            //A;
        }
        // Il en va de même ; str2 est dans le champ d'application de A mais pas à B. Les règles sont exactement les mêmes
        // que celles d'assignation définitive pour les variables locales : « Cette valeur est-elle garantie d'avoir
        // été assignée si j'atteins ce point ? »

        // D'autres constructions conditionnelles, telles que le court-circuit && et ||, participent également à cette définition.
        // Par exemple, l'exemple suivant est valide :

        if (fish instanceof String str3 && str3 != null) {
            //A;
        }
        //mais ce qui suit ne l'est pas : COMPILE ERROR
        /*if (fish instanceof String str3 || str3 != null) {
            //A;
        }*/
        // car dans ce dernier cas, il n'est pas garanti qu'une valeur ait été attribuée à str3 lorsque nous arrivons à la clause str3 != null.

        //Les règles intègrent même des flux de contrôle non locaux, comme les exceptions. Par exemple, si nous avions :

        if (!(fish instanceof String str4)) {
            System.out.println("Not a Foo");
        }
        // B(str4);
        //ce serait une erreur, car il n'est pas garanti qu'une valeur ait été attribuée lorsque nous atteignons B(str4),

        // mais si le bloc if se termine brusquement :
        if (!(fish instanceof String str5)) {
            throw new Exception();
        }
        // B(str5);
        //alors str5 est dans le champ d'application B(str5) car on nous garantit que si on atteint ce point,
        // str5 à une valeur qui lui a été attribuée.
    }

    /**
     *  Pourque le Pattern type ne cause pas d'erreur de compile, il faut que le type de la variable soit strictement
     *  une sous classe de la classe que "instanceof Class" compare, sinon on obtient une erreur de compile
     *  Sauf pour les interface " instanceof interface" ou la condition sur le sous type strict n'est pas applicable.
     */
    void sameType() {
        Number number = 5;
        if (number instanceof Number) {
        }  //this is OK

        //Pattern type 'Number' is the same as expression type
        //pattern variable type must be a strict subtype of Number
        //if(number instanceof Number n2){} //DOES NOT COMPILE!
        //this is ok as Long is a strict subtype Of Number
        if (number instanceof Long nL) {
        }

        Object object = new String();
        //same case with Object
        //if(object instanceof Object obj){}  //does not compile!
        if (object instanceof Object) {
        }


        Throwable t = null;
        // t est une sous classe de Exception
        if (t instanceof Exception e) {
            System.out.println(e.getMessage());
        }
        //type not compatible
        /*
        if(t instanceof String s) {
        }
        */

        //strange behavior for interface!
        if (t instanceof List list) {
            System.out.println("that's weird");
        }
    }

    /**
     * La variable est definie (a une portée) dans le bloc ou la condition est vrai
     * @param object
     */
    void accessingOutOfScope(Object object) {
        if (!(object instanceof String s) || s.equals("enrico")) {
            System.out.println("bye bye");
        } else {
            //here s is defined as the first of condition is wrong
            System.out.println(s);
        }

        //You CANNOT access the pattern variable `s` here
        //System.out.println(s);
    }

    void flowScoping(Number number) {
        //it cannot make sure data is an integer
        //does not compile
        /*
            if(number instanceof Integer data || data.compareTo(5)>0){
            }
        */

        // compile
        if(!(number instanceof Integer data) || data.compareTo(5)>0){
        }

        //this is fine as it's a logical and
        if (number instanceof Integer data && data.compareTo(5) > 0) {

        }

        //this is not fine as it is short-circuit logical and: both of the parts need to be evaluated
        //does not compile! (bitwise AND Operator)
        /*  if(number instanceof Integer data & data.compareTo(5)>0){}*/

    }

    void notInScope(Object fish) {
        if (!(fish instanceof String guppy)) {
            System.out.print("Eat!");
        }

        //guppy is still in the scope here
        // else if (!(fish instanceof String guppy)) {
        //       throw new RuntimeException(); }
        System.out.print("Swim!");

    }
}
