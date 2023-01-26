import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {13, 56, 75, 42};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{42, 75, 56, 13}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {13,75,18, 35};
    assertArrayEquals(new int[]{35,18,75,13}, ArrayExamples.reversed(input1));
  }

  @Test
  public void findAverageWithoutLowest() {
    double[] numbers = {15.0,20.0,25.0,60.0,40.0};
    assertEquals(36.25, ArrayExamples.averageWithoutLowest(numbers),36.25);
  }

  @Test
  public void AvgWithoutLowest() {
    double[] numbers = {1,2,3,4,5,6,0};
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(numbers),0.1);
  }
}
