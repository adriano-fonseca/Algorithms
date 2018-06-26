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
  public void whenJuneInTheNorthExpectSummer() {
    Assert.assertEquals(Season.SUMMER, Solution.getSeason(Month.JUNE, Hemisphere.NORTH)); 
  }
  
  @Test
  public void whenJuneInTheSouthExpectWinter() {
	    Assert.assertEquals(Season.WINTER, Solution.getSeason(Month.JUNE, Hemisphere.SOUTH)); 
  }
  
  @Test
  public void whenAprilInTheSouthExpectFall() {
	    Assert.assertEquals(Season.FALL, Solution.getSeason(Month.APRIL, Hemisphere.SOUTH));
  }

  @Test
  public void whenAprilInTheNorthExpectSpring() {
	    Assert.assertEquals(Season.SPRING, Solution.getSeason(Month.APRIL, Hemisphere.NORTH));
  }
  
  @Test
  public void whenMarchInTheSouthExpectFall() {
	    Assert.assertEquals(Season.FALL, Solution.getSeason(Month.MARCH, Hemisphere.SOUTH));
  }

  @Test
  public void whenMarchInTheNorthExpectSpring() {
	    Assert.assertEquals(Season.SPRING, Solution.getSeason(Month.MARCH, Hemisphere.NORTH));
  }

  @Test
  public void whenJulyInTheSouthExpectWinter() {
	    Assert.assertEquals(Season.WINTER, Solution.getSeason(Month.JULY, Hemisphere.SOUTH));
  }

  @Test
  public void whenJulyInTheNorthExpectSummer() {
	    Assert.assertEquals(Season.SUMMER, Solution.getSeason(Month.JULY, Hemisphere.NORTH));
  }
  
  @Test
  public void whenAugustInTheSouthExpectWinter() {
	    Assert.assertEquals(Season.WINTER, Solution.getSeason(Month.AUGUST, Hemisphere.SOUTH));
  }

  @Test
  public void whenMarchInTheNorthExpectSummer() {
	    Assert.assertEquals(Season.SUMMER, Solution.getSeason(Month.AUGUST, Hemisphere.NORTH));
  }
  
  @Test
  public void whenSeptemberInTheSouthExpectSpring() {
	    Assert.assertEquals(Season.SPRING, Solution.getSeason(Month.SEPTEMBER, Hemisphere.SOUTH));
  }

  @Test
  public void whenSeptemberInTheNorthExpectFall() {
	    Assert.assertEquals(Season.FALL, Solution.getSeason(Month.SEPTEMBER, Hemisphere.NORTH));
  }
  
  @Test
  public void whenOctoberInTheSouthExpectSpring() {
	    Assert.assertEquals(Season.SPRING, Solution.getSeason(Month.OCTOBER, Hemisphere.SOUTH));
  }

  @Test
  public void whenOctoberInTheNorthExpectFall() {
	    Assert.assertEquals(Season.FALL, Solution.getSeason(Month.OCTOBER, Hemisphere.NORTH));
  }
  
  @Test
  public void whenNovemberInTheSouthExpectSummer() {
	    Assert.assertEquals(Season.SUMMER, Solution.getSeason(Month.NOVEMBER, Hemisphere.SOUTH));
  }

  @Test
  public void whenNovemberInTheNorthExpectWinter() {
	    Assert.assertEquals(Season.WINTER, Solution.getSeason(Month.NOVEMBER, Hemisphere.NORTH));
  }
  
  @Test
  public void whenDecemberInTheSouthExpectSummer() {
	    Assert.assertEquals(Season.SUMMER, Solution.getSeason(Month.DECEMBER, Hemisphere.SOUTH));
  }

  @Test
  public void whenDecemberInTheNorthExpectWinter() {
	    Assert.assertEquals(Season.WINTER, Solution.getSeason(Month.DECEMBER, Hemisphere.NORTH));
  }
  
  @Test
  public void whenJanuaryInTheSouthExpectSummer() {
	    Assert.assertEquals(Season.SUMMER, Solution.getSeason(Month.JANUARY, Hemisphere.SOUTH));
  }

  @Test
  public void whenJanuaryInTheNorthExpectWinter() {
	    Assert.assertEquals(Season.WINTER, Solution.getSeason(Month.JANUARY, Hemisphere.NORTH));
  }
  
  @Test
  public void whenFebruaryInTheSouthExpectSummer() {
	    Assert.assertEquals(Season.SUMMER, Solution.getSeason(Month.FEBRUARY, Hemisphere.SOUTH));
  }

  @Test
  public void whenFebruaryInTheNorthExpectWinter() {
	    Assert.assertEquals(Season.WINTER, Solution.getSeason(Month.FEBRUARY, Hemisphere.NORTH));
  }
}
