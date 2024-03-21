class Solution {
    public static long factorial(int n) {
        // Base case: Factorial of 0 is 1
        if (n == 0) {
            return 1;
        } else {
            // Recursive case: n * factorial(n - 1)
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        long result = factorial(5);
        System.out.print(result);
    }
}
