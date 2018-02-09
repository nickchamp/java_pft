package ru.stqa.pft.java_pft;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by nickolay on 09.02.18.
 */
public class DistanceTest {
  @Test
  public void testDistance() {
    Point p1 = new Point(5, 4);
    Point p2 = new Point(5, 13);
    Assert.assertEquals(p1.distance(p2), 9.0);
  }
}
