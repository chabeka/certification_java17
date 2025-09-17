package org.example;

import org.example.chap7.defaultmethode.InterfaceMethodeManagementImpl;

import java.io.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void main (){
        int i = 0;
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*executeCommand("sudo chmod +x /hawai/data/ged/dfce-scripts-utils/index_range_counter_migration.sh");
        executeCommand("sudo chmod +x /hawai/data/ged/dfce-scripts-utils/indexation_mode_migration.sh");
        executeCommand("sudo chmod +x /hawai/data/ged/dfce-scripts-utils/range-index-reference-migration.sh");

        executeCommand("sudo /hawai/data/ged/dfce-scripts-utils/index_range_counter_migration.sh");
        executeCommand("sudo /hawai/data/ged/dfce-scripts-utils/indexation_mode_migration.sh");
        executeCommand("sudo /hawai/data/ged/dfce-scripts-utils/range-index-reference-migration.sh");*/

        Duration duration = Duration.ofMillis(5000);
        System.out.println(duration);

        int a, b, c=2;
        System.out.println(c + " " );
        int moon = 9, star = 2 + 2 * 3;
        float sun = star>10 ? 1 : 3;
        double jupiter = (sun + moon) - 1.0f;
        int mars = --moon <= 8 ? 2 : 3;
        System.out.println(sun+", "+jupiter+", "+mars);

        List<Integer> data = new ArrayList<>();
        IntStream.range(0,100).parallel().forEach(s -> data.add(s));
        System.out.println(data.size());

        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();

         var result = Stream.generate(() -> "").limit(1000)
            .filter(notEmpty)
            .collect(Collectors.groupingBy(k -> k))
            .entrySet()
            .stream()
            .map(Map.Entry::getValue)
            .flatMap(Collection::stream)
            .collect(Collectors.partitioningBy(notEmpty));
         System.out.println(result);

         var im = new InterfaceMethodeManagementImpl();
         im.defaultMethode();
    }

    public static void executeCommand(String command) {
        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();

            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            System.out.println(" -----------------------------out---------------------------------- ");
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }
            reader.close();

            System.out.println(" -----------------------------int commande---------------------------------- ");
            OutputStream outputStream = p.getOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            printStream.println();
            printStream.flush();
            printStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}