package maharishi.university.sampleTest.test;

import org.junit.Assert;
import org.junit.Test;

import maharishi.university.sampleTest.SecondLargestOnArray;


public class SecondLargestOnArrayTest {
  SecondLargestOnArray secondLargestOnArray = new SecondLargestOnArray();
  
  @Test
  public void test1() {
    Assert.assertEquals(3, secondLargestOnArray.f(new int[] { 1, 2, 3, 4 })); //3
  }

  @Test
  public void test2() {
    Assert.assertEquals(3, secondLargestOnArray.f(new int[] { 4, 1, 2, 3 })); //3
  }

  @Test
  public void test3() {
    Assert.assertEquals(1,  secondLargestOnArray.f(new int[] { 1, 1, 2, 2 })); //1
  }

  @Test
  public void test4() {
    Assert.assertEquals(-1, secondLargestOnArray.f(new int[] { 1, 1 })); //-1
  }

  @Test
  public void test5() {
    Assert.assertEquals(-1, secondLargestOnArray.f(new int[] { 1 })); //-1
  }

  @Test
  public void test6() {
    Assert.assertEquals(-1, secondLargestOnArray.f(new int[] {})); //-1
  }

  

}
