package com.company;

public class Main {

    public static void main(String[] args) {
        Line line1 = new Line();
        Point line1point1= new Point();
        line1point1.setxCoordinate(3);
        line1point1.setyCoordinate(4);
        line1.setP1(line1point1);
        Point line1point2= new Point();
        line1point2.setxCoordinate(3);
        line1point2.setyCoordinate(5);
        line1.setP2(line1point2);
        Line line2 = new Line();
        Point line2point1= new Point();
        line2point1.setxCoordinate(20);
        line2point1.setyCoordinate(3);
        line2.setP1(line2point1);
        Point line2point2= new Point();
        line2point2.setxCoordinate(14);
        line2point2.setyCoordinate(5);
        line2.setP2(line2point2);
        Double line1Length= line1.getLength();
        Double line2Length=line2.getLength();
        System.out.println(line1Length.equals(line2Length));
    }
}
