public class LongestNameInStringArray {
    public static String longestNameInString(int n, String[]names) {
        String longestName = names[0];
        for (int i = 0 ; i < names.length; i++ ) {
            if (names[i] .length() > longestName.length()) {
                longestName = names[i];
            }
        }
        return longestName;
    }

    public static void main(String[] args) {
        String result = longestNameInString(5, new String[] {"Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"});
        System.out.print(result);
        }
}
