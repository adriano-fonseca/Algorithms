package maharishi.university.sampleTest.test;

import org.junit.Assert;
import org.junit.Test;

import maharishi.university.sampleTest.ThirdLargestOnArray;

public class ThirdLargestTest {

  ThirdLargestOnArray thirdLargestOnArray = new ThirdLargestOnArray();
 
  @Test
  public void test1() {
    Assert.assertEquals(2, thirdLargestOnArray.f(new int[] { 1, 2, 3, 4 })); 
  }

  @Test
  public void test2() {
    Assert.assertEquals(2,  thirdLargestOnArray.f(new int[] { 4, 1, 2, 3 })); 
  }

  @Test
  public void test3() {
    Assert.assertEquals(-1, thirdLargestOnArray.f(new int[] { 1, 1, 2, 2 })); 
  }
  
  @Test
  public void test8() {
    Assert.assertEquals(1,  thirdLargestOnArray.f(new int[] { 1, 1, 2, 2, 3 }));
  }
  
  @Test
  public void test7() {
    Assert.assertEquals(2,   thirdLargestOnArray.f(new int[] { 1, 1, 2, 3, 5, 5 })); 
  }

  @Test
  public void test4() {
    Assert.assertEquals(-1,  thirdLargestOnArray.f(new int[] { 1, 1 })); 
  }
  
  @Test
  public void test9() {
    Assert.assertEquals(-1,  thirdLargestOnArray.f(new int[] { 1, 1, 1, 1 })); 
  }

  @Test
  public void test5() {
    Assert.assertEquals(-1,  thirdLargestOnArray.f(new int[] { 1 })); 
  }

  @Test
  public void test6() {
    Assert.assertEquals(-1,  thirdLargestOnArray.f(new int[] {})); 
  }
}
