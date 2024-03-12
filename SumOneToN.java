public class SumOneToN {
    public static long printOneToN(long n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        long sum = printOneToN(10);
        System.out.print(sum);
    }
}
