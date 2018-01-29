package ru.stqa.pft.java_pft;

/**
 * Created by nickolay on 29.01.18.
 */
public class Point {
  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point point) {
    return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
  }

  public static class Distance {

    public static void main(String[] args) {

      Point point1 = new Point(5, 10);
      Point point2 = new Point(8, 14);

      System.out.println(point1.distance(point2));
    }
  }
}