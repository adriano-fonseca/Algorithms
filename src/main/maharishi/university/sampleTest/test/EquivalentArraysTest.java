package maharishi.university.sampleTest.test;

import org.junit.Assert;
import org.junit.Test;

import maharishi.university.sampleTest.EquivalentArrays;


public class EquivalentArraysTest {
  
  EquivalentArrays testQ2 = new EquivalentArrays();
  
  @Test
  public void test1() {
    Assert.assertEquals(1, testQ2.equivalentArrays(new int[] {0, 1, 2},new int[] {0, 1, 2})); 
  }
  
  @Test
  public void test2() {
    Assert.assertEquals(1, testQ2.equivalentArrays(new int[] {0, 1, 2},new int[] {2, 0, 1})); 
  }
  
  @Test
  public void test3() {
//    {0, 1, 2, 1}  {2, 0, 1} 1 (because both arrays contain the values 0, 1, 2)
    Assert.assertEquals(1, testQ2.equivalentArrays(new int[] {0, 1, 2, 1},new int[] {0, 1, 2})); 
  }
  
  @Test
  public void test4() {
//    {0, 1, 2, 1}  {2, 0, 1} 1 (because both arrays contain the values 0, 1, 2)
    Assert.assertEquals(1, testQ2.equivalentArrays(new int[] {0, 1, 2}, new int[] {0, 1, 2, 1})); 
  }
  
  @Test
  public void test5() {
//   {0, 5, 5, 5, 1, 2, 1} {5, 2, 0, 1}  1 (because both arrays contain the values 0, 1, 2, 5)
    Assert.assertEquals(1, testQ2.equivalentArrays(new int[] {0, 5, 5, 5, 1, 2, 1}, new int[]{5, 2, 0, 1})); 
  }
  
  
  @Test
  public void test6() {
//   {0, 2, 1, 2}  {3, 1, 2, 0}  0 (the value 3 is not in the first array)
    Assert.assertEquals(0, testQ2.equivalentArrays(new int[] {0, 2, 1, 2} , new int[] {3, 1, 2, 0})); 
  }
  
  @Test
  public void test7() {
//  {5, 2, 0, 1}  {0, 5, 5, 5, 1, 2, 1} 1 (because both arrays contain the values 0, 1, 2, 5)
    Assert.assertEquals(1, testQ2.equivalentArrays(new int[] {5, 2, 0, 1} , new int[]{0, 5, 5, 5, 1, 2, 1})); 
  }
  
  @Test
  public void test8() {
//  0, 2, 1, 2}  {3, 1, 2, 0}  0 (the value 3 is not in the first array)
    Assert.assertEquals(0, testQ2.equivalentArrays(new int[] {0, 2, 1, 2} , new int[]{3, 1, 2, 0})); 
  }
  
  @Test
  public void test9() {
//    {3, 1, 2, 0}  {0, 2, 1, 0}  0 (the value 3 is not in the second array)
    Assert.assertEquals(0, testQ2.equivalentArrays(new int[] {3, 1, 2, 0}  , new int[]{0, 2, 1, 0} )); 
  }
  
  @Test
  public void test10() {
//    {1, 1, 1, 1, 1, 1}  {1, 1, 1, 1, 1, 2}  0 (the value 2 is not in the first array)
    Assert.assertEquals(0, testQ2.equivalentArrays(new int[]  {1, 1, 1, 1, 1, 1}  , new int[]{1, 1, 1, 1, 1, 2}  )); 
  }
  
  @Test
  public void test11() {
//   {}  {3, 1, 1, 1, 1, 2}  0 (3 is not in the first array.)
    Assert.assertEquals(0, testQ2.equivalentArrays(new int[1], new int[]{3, 1, 1, 1, 1, 2}  )); 
  }
  
  @Test
  public void test12() {
//    {}  {3, 1, 1, 1, 1, 2}  0 (3 is not in the first array.)
    Assert.assertEquals(0, testQ2.equivalentArrays(new int[1], new int[]{3, 1, 1, 1, 1, 2}  )); 
  }


  @Test
  public void test13() {
//    {}  {3, 1, 1, 1, 1, 2}  0 (3 is not in the first array.)
    Assert.assertEquals(1, testQ2.equivalentArrays(new int[1], new int[1])); 
  }
}
