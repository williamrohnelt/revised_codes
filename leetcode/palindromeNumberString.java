package leetcode;

class PalindromeNumberString {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x % 10 == 0 && x != 0) {
            return false;
        } else {
            String numero = String.valueOf(x);
            int start = 0;
            int end = numero.length() - 1;
            while (start < end) {
                if (numero.charAt(start) == numero.charAt(end)) {
                    start++;
                    end--;
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}