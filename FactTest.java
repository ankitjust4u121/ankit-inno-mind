import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactTest {
    // use @test annotation writing test cases for the Fact class
    @Test
    public void testFactorial() {
        assertEquals(120, Fact.factorial(5));
    }
    @Test
    public void testFactorialNegative() {
        assertEquals(-1, Fact.factorial(-5));
    }
    @Test
    public void testFactorialZero() {
        assertEquals(1, Fact.factorial(0));
    }
    @Test
    public void testFactorialOne() {
        assertEquals(1, Fact.factorial(1));
    }
}
