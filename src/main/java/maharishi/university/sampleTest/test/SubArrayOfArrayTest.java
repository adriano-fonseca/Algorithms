package maharishi.university.sampleTest.test;

import org.junit.Assert;
import org.junit.Test;

import maharishi.university.sampleTest.SubArrayOfArray;

public class SubArrayOfArrayTest {
  SubArrayOfArray subArrayOfArray = new SubArrayOfArray();
  
  @Test
  public void test1() {
    //{'a', 'b', 'c'}, 0, 4 null
    Assert.assertNull(null, subArrayOfArray.f(new char[] { 'a', 'b', 'c'}, 0, 4));
  }

  @Test
  public void test2() {
    Assert.assertArrayEquals(new char[] { 'a', 'b', 'c'}, subArrayOfArray.f(new char[] { 'a', 'b', 'c'}, 0, 3)); 
  }

  @Test
  public void test3() {
    Assert.assertNull(null, subArrayOfArray.f(new char[] { 'a', 'b', 'c'}, 1, 3)); 
  }
  
  @Test
  public void test4() {
    Assert.assertArrayEquals(new char[] { 'b', 'c'}, subArrayOfArray.f(new char[] { 'a', 'b', 'c'}, 1, 2));
  }

  @Test
  public void test5() {
    Assert.assertArrayEquals(new char[] { 'b'}, subArrayOfArray.f(new char[] { 'a', 'b', 'c'}, 1, 1));
  }
  
  @Test
  public void test6() {
    Assert.assertNull(null, subArrayOfArray.f(new char[] { 'a', 'b', 'c'}, 2, 2));
  }

  @Test
  public void test7() {
    Assert.assertArrayEquals(new char[] { 'c'}, subArrayOfArray.f(new char[] { 'a', 'b', 'c'}, 2, 1));
  }

  @Test
  public void test8() {
    Assert.assertNull(null, subArrayOfArray.f(new char[] { 'a', 'b', 'c'}, 3, 1));
  }
  
  @Test
  public void test9() {
    Assert.assertEquals(0, subArrayOfArray.f(new char[] { 'a', 'b', 'c'}, 1, 0).length);
  }

  @Test
  public void test10() {
    Assert.assertNull(subArrayOfArray.f(new char[] { 'a', 'b', 'c'}, -1, 2));
  }
  
  @Test
  public void test11() {
    Assert.assertNull(subArrayOfArray.f(new char[] {}, 0, 1));
  }
  

}
