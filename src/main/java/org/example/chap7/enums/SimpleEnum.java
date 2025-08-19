package org.example.chap7.enums;

public class SimpleEnum {

    public static void main(String[] args) {
        new SimpleEnum().values();
        new SimpleEnum().switchEnumExpression();

    }

    void values() {
        for(CardinalPoints point : CardinalPoints.values()){
            System.out.println(point.name() + " - " + point.ordinal());
        }
    }

    void switchEnumExpression() {

        var north = CardinalPoints.NORTH;
        char result;
        result = switch (north) {
            case EAST -> 'E';
            case WEST -> 'W';
            case NORTH -> 'N';
            case SOUTH -> 'S';
        };
        System.out.println(result);
    }

    void comparable() {
        // Les Enums implement Comparable
        int compare = CardinalPoints.NORTH.compareTo(CardinalPoints.EAST);
        System.out.println(compare);
    }
}
