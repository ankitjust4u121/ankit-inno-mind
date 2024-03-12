public class SumOfOneToN {
    public static long sumOfOneToN(long n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        long result = sumOfOneToN(10);
        System.out.println(result);
    }
}
