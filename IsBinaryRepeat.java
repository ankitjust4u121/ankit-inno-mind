public class IsBinaryRepeat {
    public static boolean isBinary(String s) {
        return s.matches("[01]+");
    }

    public static void main(String[] args) {
        System.out.print(isBinary("1010"));
    }
}
