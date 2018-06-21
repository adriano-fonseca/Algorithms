package rackerRank.com;

import org.junit.Assert;
import org.junit.Test;

import hackerRank.com.LeftRotationRecursion;

public class LeftRotationTest {
  
 
  @Test
  public void test1() {
    Assert.assertArrayEquals(new int[] { 3, 4, 5, 1, 2}, LeftRotationRecursion.rotLeft(new int[] { 1, 2, 3, 4, 5 },2)); // maior
  }
  
  @Test
  public void test2() {
	    Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5}, LeftRotationRecursion.rotLeft(new int[] { 1, 2, 3, 4, 5 }, 5)); // maior
  }
  
  @Test
  public void test3() {
	    Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5}, LeftRotationRecursion.rotLeft(new int[] { 1, 2, 3, 4, 5 }, 0)); // maior
}
  
  
}
