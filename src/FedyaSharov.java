public class FedyaSharov {

    public static void main(String[] args) {
        int i = -202;
        PalindromeImpl palindrome = new PalindromeImpl();
        boolean b = palindrome.isPalindrome(i);
        if(b) System.out.printf("Number %d is palindrome\n", i);
        else  System.out.printf("Number %d is not palindrome\n", i);

    }
}
