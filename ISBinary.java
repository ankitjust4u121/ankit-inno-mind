import org.jetbrains.annotations.NotNull;

public class ISBinary {

     public static boolean isBinary(@NotNull String str) {
        return str.matches("[01]+");
    }
    public static void main(String[] args) {
        System.out.print(isBinary("101"));
    }
}
