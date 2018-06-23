package com.zone;

import java.time.Month;

import org.junit.Assert;
import org.junit.Test;
import com.zone.Solution.Season;

/**
 * @author adriano-fonseca
 *
 * The follow pattern to name the unit tests
 * 
 * When_StateUnderTest_Expect_ExpectedBehavior
 */
public class SolutionTest {
  
 
  @Test
  public void test1() {
    Assert.assertEquals(Season.SUMMER, Solution.getSeason(Month.JUNE, Hemisphere.NORTH)); 
  }
  
  @Test
  public void test2() {
	    Assert.assertEquals(Season.SUMMER, Solution.getSeason(Month.JUNE, Hemisphere.NORTH)); 
  }
  
  @Test
  public void test3() {
	    Assert.assertEquals(Season.WINTER, Solution.getSeason(Month.JUNE, Hemisphere.SOUTH)); 
  }
  
  @Test
  public void test4() {
	    Assert.assertEquals(Season.WINTER, Solution.getSeason(Month.JUNE, Hemisphere.SOUTH));
  }
  


  
  
  
  
}
