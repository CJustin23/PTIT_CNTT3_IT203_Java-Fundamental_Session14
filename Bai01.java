import java.util.*;
public class Bai01 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Nguyễn Văn A – Yên Bái", "Trần Thị B – Thái Bình", "Nguyễn Văn A – Yên Bái", "Lê Văn C – Hưng Yên");
        Set<String> patients = new LinkedHashSet<>(input);
        System.out.println("Danh sách gọi khám:");
        for (String p : patients) {
            System.out.println(p);
        }
    }
}
