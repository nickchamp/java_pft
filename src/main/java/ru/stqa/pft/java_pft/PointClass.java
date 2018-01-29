package ru.stqa.pft.java_pft;

/**
 * Created by nickolay on 29.01.18.
 */
public class PointClass {
  public static void main(String[] args) {

    Point point1 = new Point(5, 10);
    Point point2 = new Point(5, 19);

    System.out.println(point1.distance(point2));
  }
}
