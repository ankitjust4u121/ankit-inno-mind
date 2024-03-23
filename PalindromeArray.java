public class PalindromeArray {
    public static int palinArray(int [] arr, int n) {
        for (int i = 0 ; i < n ; i++) {
            if (!isPalindrome(arr[i])) {
                return 0;
            }
        }
        return 1;
    }

    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while (n > 0) {
            int reminder = n % 10;
            reversed = reversed * 10 + reminder;
            n /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        int result = palinArray(new int[] {111, 222,  333,  444, 555}, 5);
        System.out.print(result);
    }
}
