public class OneToTenWithoutLoop {
    public static void printOneToN(int N) {
        if (N > 0) {
            printOneToN(N - 1);
            System.out.print(N +"  ");
        }
    }

    public static void main(String[] args) {
        printOneToN(10);
    }
}
