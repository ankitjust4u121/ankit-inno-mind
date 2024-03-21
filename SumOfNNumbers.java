public class SumOfNNumbers {
    public static long sumOneToN(long n) {
        // This code will not work for large data
        if (n == 0) {
            return 0;
        }
        return n + sumOneToN( n - 1);
    }

    public static void main(String[] args) {
        long result = sumOneToN(5);
        System.out.print(result);
    }
}
