public class PalindromeClass implements Palindrome{
    @Override
    public boolean isPalindrome(int x) {
        int num = Math.abs(x);
        String strFromLeft = String.valueOf(num);
        String strFromRight = "";
        char array[] = strFromLeft.toCharArray();
        for(int i = array.length-1; i>=0; i--){
            strFromRight += array[i];
        }

        return strFromLeft.equals(strFromRight);
    }

}
