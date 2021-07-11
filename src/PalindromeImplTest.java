import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PalindromeImplTest {
    @Test
    void isPalindromeTest(){
        PalindromeImpl palindrome = new PalindromeImpl();
        assertTrue(palindrome.isPalindrome(101));
        assertTrue(palindrome.isPalindrome(101101));
        assertTrue(palindrome.isPalindrome(1));
        assertTrue(palindrome.isPalindrome(0));
    }
    @Test
    void isPalindromeNegativeNumberTest(){
        PalindromeImpl palindrome = new PalindromeImpl();
        assertTrue(palindrome.isPalindrome(-334433));
    }
    @Test
    void isPalindromeFalseTest(){
        PalindromeImpl palindrome = new PalindromeImpl();
        assertFalse(palindrome.isPalindrome(10));
    }

}