public class GCD {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {

        GCD gcd = new GCD();
        gcd.gcd(5, 17);
    }
}
