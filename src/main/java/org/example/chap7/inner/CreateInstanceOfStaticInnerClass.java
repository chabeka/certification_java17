package org.example.chap7.inner;

public class CreateInstanceOfStaticInnerClass {

    static void create() {
        //Mark is a static class no need to create an instance of MixedInnerStatic
        var mark = new Mark();
        //another way to create
        CreateInstanceOfStaticInnerClass.Mark mark2 = new CreateInstanceOfStaticInnerClass.Mark();
        //here I need an instance of MixedInnerStatic
        Cub c = new CreateInstanceOfStaticInnerClass().new Cub();
    }

    static class Mark {

    }

    class Cub {

    }
}
