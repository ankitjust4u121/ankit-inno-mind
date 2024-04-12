import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    @Test
    public void testPalindrome() {
        String str = "madam";
        boolean isPalindrome = str.contentEquals(new StringBuilder(str).reverse());
        assertTrue(String.valueOf(isPalindrome), true);
    }
}
