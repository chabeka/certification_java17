package org.example.chap6;

public class HidingStaticMethods {

    class Parent {
        public static void sleep() {
            System.out.println("The Mammal is sleeping");
        }

        public static void swim() {
            System.out.println("Mammal is swimming");
        }

        public static final void message() {
        }

        private static void privateStaticMethod() {
        }

        public static void publicStaticMethod() {
        }

        public void name() {
            System.out.println("name is Mammal");
        }
    }

    class Fille extends  Parent{

        // si la méthode parente est public, la méthode redéfinie doit également être public.
        public static void sleep() {
            System.out.println("The Mammal is sleeping");
        }

        // méthode redéfinie dans la classe fille doit avoir une visibilité égale ou supérieure à celle de la méthode dans la classe parente
        //protected static void publicStaticMethod(){}  //DOES NOT COMPILE!

        // La méthode redéfinie ne peut pas lancer des exceptions plus larges que celles déclarées par la méthode parente.
        //public static void publicStaticMethod() throws Exception{}  //DOES NOT COMPILE!

        // On ne peut pas redefinir une methode finale
        //public static final void message() {}  //does not compile

        // La methode Parent est "private" donc invisible dans la methode "Fille"
        private int privateStaticMethod() {
            return 0;
        }

        // Si la methode "Parent" est static, la methode dans la clasese "Fille" doit l'être aussi
        /*public void swim() {
            System.out.println("Mammal is swimming");
        }*/

        // On ne peut pas rendre static une methode dans la classe "Fille" si elle ne l'est pas dans la classe "Parent"
        /*
        public static void name() {
          System.out.println("name is Mammal");
        }
        */
    }
}
