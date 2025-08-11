package org.example.chap6;

public class ManyConstructors {

    private final int age;
    private final String name;

    public ManyConstructors(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public ManyConstructors(int age) {
        // super(); Call to 'this()' must be first statement => DOES NOT COMPILE!
        this(age, "name");
        //super();  // Call to 'super()' must be first statement => DOES NOT COMPILE!
    }

    public ManyConstructors() {
        this(30);
    }

    public static void main(String[] args) {
        var instance = new ManyConstructors();
        System.out.println(instance);

    }

    public void setAge(int age) {
        //does not compile as this.age is final
        // this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " - age: " + this.age;
    }

    static void hello() {
        //I cannot have a static block within a method
        /*
        static {
          System.out.println();
        }
         */
    }

}
