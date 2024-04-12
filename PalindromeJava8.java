public class PalindromeJava8 {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = str.contentEquals(new StringBuilder(str).reverse());
        System.out.println(isPalindrome);
    }
}
