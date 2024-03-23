public class ReverseDigit {
    public static long reverse(long n) {
        long reversed = 0;
        while (n > 0) {
            long digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
     System.out.print(reverse(100));
    }
}
