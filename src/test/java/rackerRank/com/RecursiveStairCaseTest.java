package rackerRank.com;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.junit.Assert;
import org.junit.Test;

import hackerRank.com.LeftRotationRecursion;

//@RunWith(XMLParameterizedRunner.class)
public class RecursiveStairCaseTest {
  
 
  @Test
  public void test1() {
    Assert.assertArrayEquals(new int[] { 3, 4, 5, 1, 2}, LeftRotationRecursion.rotLeft(new int[] { 1, 2, 3, 4, 5 },2)); // maior
  }
  
  @Test
  public void test2() {
	    Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5}, LeftRotationRecursion.rotLeft(new int[] { 1, 2, 3, 4, 5 }, 5)); // maior
  }
  
  @Test
  public void test3() throws IOException {
	  	/*LineIterator it = IOUtils.lineIterator(this.getClass().getResourceAsStream("test.xml"), "UTF-8");
	  	while(it.hasNext()) {
	  		System.out.println(it.next());
	  	}*/
	  	//System.out.println(xml);
	    Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5}, LeftRotationRecursion.rotLeft(new int[] { 1, 2, 3, 4, 5 }, 0)); // maior
  }
  
  
}
