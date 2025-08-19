package org.example.chap7.sealed;

public class SealedInnerClasse {

    // Si classe qui étand est une sous classe de la classe scéllée,
    // on a pas besoin de le lister dans la liste des "permits"
    sealed class InnerClass {

        public final class SubClass extends InnerClass {

        }
    }
}
