public class PrintAlternateNumberInArray {
    public static void printAlternateNumberInArray(int[] arr, int n) {
        for (int i = 0; i < n ; i += 2) {
             System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        printAlternateNumberInArray(new int[] {1,2,3,4}, 4);
    }
}
