public class CountsOfSmallerElements {
    public static int countOfElements(int []arr,int n,int x) {
        int count = 0;
        for (int i = 0; i < n ; i++) {
            if (arr[i] < x) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
         int result = countOfElements(new int[] {1,2,3,4,5}, 5, 5);
         System.out.print(result);
    }
}
