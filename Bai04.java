import java.util.*;
public class Bai04 {
    public static void main(String[] args) {
        List<String> dsBenh = Arrays.asList("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết");
        Map<String, Integer> thongKe = new TreeMap<>();
        for (String benh : dsBenh) {thongKe.put(benh, thongKe.getOrDefault(benh, 0) + 1);}
        thongKe.forEach((key, value) -> {
            System.out.println(key + ": " + value + " ca");
        });
    }
}
