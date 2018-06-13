package maharishi.university.sampleTest.test;

import org.junit.Assert;
import org.junit.Test;

import maharishi.university.sampleTest.HasArrayNDifferentValues;


public class HasArrayNDifferentValuesTest {
  HasArrayNDifferentValues hasArrayNDifferentValues = new HasArrayNDifferentValues();
  
  @Test
  public void test1() {
    //{1, 2, 2, 1}  2  ->  1 (because there are 2 different element values, 1 and 2)
    Assert.assertEquals(1, hasArrayNDifferentValues.hasNValues(new int[] { 1, 2, 2, 1 },2)); 
  }
  
  @Test
  public void test2() {
    //{1, 1, 1, 8, 1, 1, 1, 3, 3} 3 1 (because there are 3 different element values, 1, 3, 8)
    Assert.assertEquals(1, hasArrayNDifferentValues.hasNValues(new int[] {1, 1, 1, 8, 1, 1, 1, 3, 3},3)); 
  }
  
  @Test
  public void test3() {
    //{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10} 10  1 (because there are 10 different element values)
    Assert.assertEquals(1, hasArrayNDifferentValues.hasNValues(new int[] {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10},10)); 
  }
  
  @Test
  public void test4() {
    //{1, 2, 2, 1}  3 0 (because there are 2 different element values, not 3 as required)
    Assert.assertEquals(0, hasArrayNDifferentValues.hasNValues(new int[] {1, 2, 2, 1},3)); 
  }
  
  @Test
  public void test5() {
    //{1, 1, 1, 8, 1, 1, 1, 3, 3} 2 0 (because there are 3 different element values, not 2 as required)
    Assert.assertEquals(0, hasArrayNDifferentValues.hasNValues(new int[] {1, 1, 1, 8, 1, 1, 1, 3, 3},2)); 
  }
  
  @Test
  public void test6() {
    // 20  0 (because there are 10 different element values, not 20 as required)
    Assert.assertEquals(0, hasArrayNDifferentValues.hasNValues(new int[] {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10},20)); 
  }
  
  
  

}
