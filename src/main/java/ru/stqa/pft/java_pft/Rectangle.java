package ru.stqa.pft.java_pft;

/**
 * Created by nickolay on 29.01.18.
 */
public class Rectangle {
  public double a;
  public double b;

  public Rectangle (double a, double b) {
    this.a = a;
    this.b = b;
  }
  public double area () {
    return this.a * this.b;
  }
}
