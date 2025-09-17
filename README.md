# certification_java17
/*
Nous pouvons utiliser des caractères génériques avec des limites de trois manières :
Caractères génériques illimités : Liste<?> – représente une liste de n'importe quel type
Caractères génériques à limite supérieure : List<? extends Number> – représente une liste de Number ou de ses sous-types (par exemple, Double ou Integer ).
Caractères génériques à limite inférieure : Liste<? super Integer> – représente une liste d' entiers ou de ses supertypes, Number et Object
*/
type illimité 
public static void swap(List<?> list, int srcIndex, int destIndex){}
// borne inferieur
public static void addNumber(List<? super Integer> list, Integer number) {}
// borne superieur
public static long sumWildcard(List<? extends Number> numbers){}

/*
Il existe deux façons de lier des paramètres de type :
Paramètre de type non limité : List<T> représente une liste de type T
Paramètre de type délimité : List<T extends Number & Comparable> représente une liste de Number ou de ses sous-types tels que Integer et Double qui implémentent l' interface Comparable*/

/*
List<Long> n'est pas un sous-type de List<Number> .
List<Number> != List<Integer>
*/
public static long sum(List<Number> numbers) {
return numbers.stream().mapToLong(Number::longValue).sum();
}
List<Number> numbers = new ArrayList<>();
sum(numbers); // OK

List<Integer> numbers = new ArrayList<>();
sum(numbers); // KO -erreur

// Corriger - utiliser un caractère générique avec une limite supérieure
public static long sumWildcard(List<? extends Number> numbers) {
return numbers.stream().mapToLong(Number::longValue).sum();
}

/*
Notion : PECS – Producer Extends, Consumer Super
Chaque fois que notre méthode consomme une collection, par exemple en ajoutant des éléments, nous devons utiliser une borne inférieure.
En revanche, si notre méthode ne lit que des éléments, nous devons utiliser la borne supérieure
types non bornés si produit et consomme une collection
*/
