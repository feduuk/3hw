import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PalindromeClassTest {
    @Test
    void isPalindromeTest(){
        PalindromeClass palindrome = new PalindromeClass();
        assertTrue(palindrome.isPalindrome(101));
    }
    @Test
    void isPalindromeNegativeNumberTest(){
        PalindromeClass palindrome = new PalindromeClass();
        assertTrue(palindrome.isPalindrome(-334433));
    }
    @Test
    void isPalindromeFalseTest(){
        PalindromeClass palindrome = new PalindromeClass();
        assertFalse(palindrome.isPalindrome(10));
    }

}