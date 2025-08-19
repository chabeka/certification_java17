package org.example.chap7.record;

public record CompactConstructorRecord (String firstName, String lastName, int age){
    // // Constructeur compact
    public CompactConstructorRecord {  //no parenthesis
        if (firstName.isEmpty() || lastName.isEmpty()) {
            throw new IllegalArgumentException("invalid");
        }
        age = 30;
        System.out.println(age);
        //Cannot assign a value to final variable 'age'
        //compact constructor cannot modify fields
        //this.age = 40;  //does not compile!
        System.out.println(this.age());
        System.out.println(this.firstName());
        System.out.println(this.lastName());
    }


    //you can see that a record can contain a main
    public static void main(String[] args) {
        //throw Exception in thread "main" java.lang.IllegalArgumentException: invalid
        CompactConstructorRecord enrico =
                new CompactConstructorRecord("Enrico", "Giurin", 40);
        System.out.println(enrico);
    }
}
