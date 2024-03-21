import java.util.ArrayList;
import java.util.List;

public class ArrayListGetDemo {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("Apple");
        lists.add("Banana");
        lists.add("Cherry");
        System.out.println(lists.get(0));
        System.out.println(lists.get(1));
        System.out.println(lists.get(2));
    }
}
