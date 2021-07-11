public class PalindromeImpl implements Palindrome{
//    @Override
//    public boolean isPalindrome(int x) {
//        int num = Math.abs(x);
//        String strFromLeft = String.valueOf(num);
//        String strFromRight = "";
//        char array[] = strFromLeft.toCharArray();
//        for(int i = array.length-1; i>=0; i--){
//            strFromRight += array[i];
//        }
//
//        return strFromLeft.equals(strFromRight);
//    }

    @Override
    public boolean isPalindrome(int x) {
        int number = Math.abs(x);
        int fromLeftNumber = number;
        int fromRightNumber = 0;
        int remainder;
        while(number != 0){
            remainder = number % 10;
            number /= 10;
            fromRightNumber = fromRightNumber * 10 + remainder;
        }
        return fromLeftNumber == fromRightNumber;
    }

}
