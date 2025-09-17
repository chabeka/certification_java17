package org.example.chap8.functionalinterface;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.IntFunction;
import java.util.function.ToDoubleBiFunction;

public class FIMain {
    public static void main(String[] args) {
        Calculateur addition = (a, b) -> a+b;
        Calculateur multi = (a, b) -> a*b;
        Calculateur divise = (a, b) -> a/b;

        int dd = addition.calculer(2, 10);
        int m = multi.calculer(2, 10);
        int d = divise.calculer(2, 10);

        Calculateur ad = Math::max;
        int max = ad.calculer(12, 23);
        IntFunction<Double> intf = n -> (double) n/3;

        var localDate = LocalDate.of(2022, 3, 13);
        var localTime = LocalTime.of(1, 0);
        var zone = ZoneId.of("America/New_York");
        var z = ZonedDateTime.of(localDate, localTime, zone);

        var offset = z.getOffset();
        var duration = Duration.ofHours(3);
        var later = z.plus(duration);

        System.out.println(later.getHour() + " "
                + offset.equals(later.getOffset()));

        var line = new StringBuilder("-");
        var line1 = line.append("-");
        System.out.println(line == line1);

        System.out.println("""
                "azeaze"
                "eeee"
                "sdfsd"
                """);


        /**
         * A. List<?> list = new HashSet<String>()
         * B. ArrayList<? super Date> list = new ArrayList<Date>()
         * C. List<?> list = new ArrayList<?>()
         * D. List<Exception> list = new LinkedList<java.io.IOException>()
         * E. ArrayList<? extends Number> list = new ArrayList<Integer>()
         * F. Aucun des propositions
         */
        FIMain card = new FIMain();
        ArrayList<? super Date> list = new ArrayList<Date>();
        card.showSize(list);

    }

    void use() {
        IntFunction<Double> fi = n -> (double) n / 3;
        Double result = fi.apply(10);
        System.out.println(result); //3.3333333333333335

    }


    public void showSize(List<?> list) {
        System.out.println(list.size());
    }
}
