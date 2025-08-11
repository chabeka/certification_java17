package org.example.chap3;

/**
 *
 * Si rien n'est retourné, le switch ne peut pas être affecté à une variable
 */
public class StrangeSwitch {

    public static void main(String[] args){
        new StrangeSwitch().afterDefault();
        new StrangeSwitch().caseDefaultOnTheSameLine();
        new StrangeSwitch().printItalianDay(DayOfWeek.MONDAY);
        new StrangeSwitch().switchComplex();
        new StrangeSwitch().yieldExample(DayOfWeek.MONDAY);
        new StrangeSwitch().switchMissingCase();
        new StrangeSwitch().switchDefault();
    }

    /**
     * Le switch execute toutes les autres expression qui suivent le "case default" si on ne sort pas avec un "break"
     */
    void afterDefault() {
        int x = 5;
        switch (x) {
            case 0:
                System.out.print(0);
            case 1:
                System.out.print(0);
            default:
                System.out.print(100); //100
            case 2:
                System.out.print(0);   //1000
            case 3:
                System.out.print(0);   //10000
            case 4:
                System.out.print(0);   //100000
        }
    }

    /**
     * Le switch execute toutes les autres expression qui suivent à partir du case qui vérifie la condition
     * si on ne sort pas avec un "break"
     */
    void caseDefaultOnTheSameLine() {
        System.out.println("\n");
        int x = 7;
        switch (x) {
            case 2, 3:
                System.out.println("2,3");
            case 11:
                System.out.println(" c'est 11");
            case 7:
                System.out.print(" c'est 7");  // c'est 7
            default:
                System.out.print( " default"); // c'est 7 default
            case 8, 9:
                System.out.println(" 8, 9"); // c'est 7 default 8, 9
        }
    }

    /**
     * Une expression de switch permet de retourner une valeur directement à partir du switch. Voici un exemple
     * @param day
     */
    void printItalianDay(DayOfWeek day) {
        var result = switch (day) {
            case MONDAY -> "lunedi";
            case TUESDAY -> "martedi";
            case WEDNESDAY -> "mercoledi";
            case THURSDAY -> "giovedi";
            case FRIDAY -> "venerdi";
            case SATURDAY -> "sabato";
            case SUNDAY -> "domenica";
        }; //mind the semicolon
        System.out.println("today is: " + result);
    }

    void switchComplex() {
        int parameter = 5;
        int result = switch (parameter) {
            case 0 -> 0;
            case 1 -> build();
            default -> 5;

        };
        System.out.println(result);
    }

    int build() {
        return 4;
    }

    /**
     * Un bloc de switch permet d'exécuter plusieurs instructions pour un cas donné. Voici un exemple
     */
    void switchBlockExample(){
        String day = "MONDAY";
        switch (day) {
            case "MONDAY" -> {
                System.out.println("Start of the work week");
                System.out.println("Let's be productive!");
            }
            case "FRIDAY" -> {
                System.out.println("End of the work week");
                System.out.println("Time to relax!");
            }
            case "SATURDAY", "SUNDAY" -> {
                System.out.println("Weekend!");
                System.out.println("Enjoy your time off!");
            }
            default -> System.out.println("Midweek day");
        }
    }

    void yieldExample(DayOfWeek day) {
        int dayNumber = switch (day) {
            case MONDAY -> {
                System.out.println("Processing Monday");
                yield 1;
            }
            case TUESDAY -> {
                System.out.println("Processing Tuesday");
                yield 2;
            }
            case WEDNESDAY -> {
                System.out.println("Processing Wednesday");
                yield 3;
            }
            case THURSDAY -> {
                System.out.println("Processing Thursday");
                yield 4;
            }
            case FRIDAY -> {
                System.out.println("Processing Friday");
                yield 5;
            }
            case SATURDAY -> {
                System.out.println("Processing Saturday");
                yield 6;
            }
            case SUNDAY -> {
                System.out.println("Processing Sunday");
                yield 7;
            }
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
        System.out.println("Day number: " + dayNumber);
    }

    /**
     * Cas d'erreur de Compilation avec yield
     */
    void wrongYield() {

        int magicNumber = 7;
        var ok = switch (magicNumber) {
            //break is not allowed in a switch expression
            //case 7 -> true; break;

            //missing semicolon ";"
            //case 9 -> {yield true}

            //missing brackets "{}"
            //case 11 -> yield true;

            //you can't mix switch expression and switch statement syntax.
            //case 13: {yield true;}
            default -> false;
        };
    }

    void switchStatementWithComma() {
        int x = 2;
        switch (x) {
            //here I use comma to separate the cases
            case 0, 1:
                System.out.println("0 or 1");
                //break;
            default: System.out.println("default");
        };
    }

    //it prints default
    //There is no case for THURSDAY and MONDAY, so they are just labels!!
    void switchMissingCase() {
        System.out.println("-------------switchMissingCase-----------------");
        var day = DayOfWeek.MONDAY;
        switch (day) {
            case TUESDAY:
                THURSDAY:
                MONDAY:
                System.out.println("MONDAY");  //it won't be printed!
            default:
                System.out.println("default");  //it prints default
        }
    }

    /**
     * la valeur sur laquelle le test "case" est fait doit être une constante ou une valeur finale
     * Si c'est une valeur finale passé en paramètre, on obtient une erreur de compilation
     * @param x
     */
    void switchParameter(final int x) {
        int y = 4;
        switch (y) {
            //x is not a compile-time constant since any int value can be passed as a parameter.
            // Marking it final does not change this, so it DOES NOT compile.
        /*case x:
        System.out.println("x is: "+x);*/
            default:
                System.out.println("default");
        }
    }

    /**
     * Le test "case" peut être fait sur une valeur qui n'est pas une constante à condition que la valeur soit final
     *  et qu'il ne soit pas en paramètre de la méthode
     */
    void switchWithNoConstant() {
        int x = 0;
        int result = 0;
        int aValue = 5;
        final int aConstant = 6;
        switch (x) {
            case 2:
                result++;
                break;
            default:
                result = -1;
                break;
            //not allowed, it's not final
            //case aValue:
            case aConstant:
                result = 3;
                break;
        }
        System.out.println(result);
    }

    /**
     * Type non supporté dans le switch "double" et "long"
     */
    void switchLong() {
        long aLong = 5L;
        //long not supported
        /*switch (aLong){
        case 1L:
            System.out.println(1);
        }*/
    }

    void switchDefault() {
        var k = 9;
        int result = 5;
        switch (k) {
            default:
                if (k == 10) {
                    result *= 2;
                } else {
                    result += 5;
                    break;
                }
            case 8:
                result = 2;
        }
        System.out.println(result);  //10
        // if k=10 ==> return 2

    }
}
