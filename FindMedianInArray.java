import java.util.Arrays;

public class FindMedianInArray {
    public static int find_median(int [] v) {
        Arrays.sort(v);
        int middle = v.length / 2;
        if (v.length % 2 == 0) {
            return (v[middle - 1] + v[middle]) / 2;
        }
        else return v[middle];
    }

    public static void main(String[] args) {
        int[] v = new int[] {90, 100, 78, 89, 67};
        int middle = find_median(v);
        System.out.print(middle);
    }
}
