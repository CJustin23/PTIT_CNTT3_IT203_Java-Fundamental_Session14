import java.util.*;
public class Bai03 {
    public static void main(String[] args) {
        Set<String> thuocMoi = new HashSet<>(Arrays.asList("Aspirin", "Caffeine", "Paracetamol"));
        Set<String> benhNhan = new HashSet<>(Arrays.asList("Penicillin", "Aspirin"));
        Set<String> warning = new HashSet<>(thuocMoi);
        warning.retainAll(benhNhan);
        Set<String> safe = new HashSet<>(thuocMoi);
        safe.removeAll(benhNhan);
        System.out.println("Cảnh báo dị ứng: " + warning);
        System.out.println("Thành phần an toàn: " + safe);
    }
}
