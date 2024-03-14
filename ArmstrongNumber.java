public class ArmstrongNumber {
    public static String armStrongNumber(int n) {
        int originalNumber = n;
        int result = 0;
        while (originalNumber != 0) {
            int reminder = originalNumber % 10;
            result += reminder * reminder * reminder;
            originalNumber /= 10;
        }
        if (result == n) {
            return "Yes";
        }
        else {
            return "No";
        }
    }
    public static void main(String[] args) {
     System.out.print(armStrongNumber(153));
    }
}
