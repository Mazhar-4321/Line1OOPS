package com.company;


public class Line {
    private Point p1;
    private Point p2;
    private double length;

    public double getLength() {
        length=Math.sqrt(Math.pow(p1.getxCoordinate()-p2.getxCoordinate(),2)+Math.pow(p1.getyCoordinate()-p2.getyCoordinate(),2));
        return length;
    }


    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

}
