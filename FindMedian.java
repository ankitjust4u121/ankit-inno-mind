import java.util.Arrays;

public class FindMedian {
    public static int findMedian(int []v) {
        Arrays.sort(v);
        if (v.length != 0) {
            return v [v.length / 2];
        } else {
            int mid1 = v[v.length / 2 - 1];
            int mid2 = v[v.length / 2];
            return mid1 + mid2;
        }
    }

    public static void main(String[] args) {
        System.out.print(findMedian(new int[] {90,100, 78, 89, 67}));
    }
}
