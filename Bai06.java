import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BenhNhan {
    String ten;
    int tuoi;
    String khoa;

    public BenhNhan(String ten, int tuoi, String khoa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return ten;
    }
}

public class Bai06 {
    public static void main(String[] args) {

        List<BenhNhan> dsBenhNhan = new ArrayList<>();
        dsBenhNhan.add(new BenhNhan("Lan", 25, "Tim mạch"));
        dsBenhNhan.add(new BenhNhan("Hùng", 30, "Nội tiết"));
        dsBenhNhan.add(new BenhNhan("Mai", 22, "Tim mạch"));

        HashMap<String, List<BenhNhan>> mapKhoa = new HashMap<>();

        for (int i = 0; i < dsBenhNhan.size(); i++) {
            BenhNhan bn = dsBenhNhan.get(i);
            String tenKhoa = bn.khoa;

            if (mapKhoa.containsKey(tenKhoa) == false) {
                List<BenhNhan> dsMoi = new ArrayList<>();
                dsMoi.add(bn);
                mapKhoa.put(tenKhoa, dsMoi);
            } else {
                List<BenhNhan> dsCu = mapKhoa.get(tenKhoa);
                dsCu.add(bn);
            }
        }

        System.out.println("Output Map Structure:");
        for (Map.Entry<String, List<BenhNhan>> entry : mapKhoa.entrySet()) {
            System.out.println("Key \"" + entry.getKey() + "\" -> Value " + entry.getValue());
        }

        String khoaCanXem = "Tim mạch";
        System.out.println("\nDanh sách bệnh nhân khoa \"" + khoaCanXem + "\":");

        if (mapKhoa.containsKey(khoaCanXem)) {
            List<BenhNhan> ds = mapKhoa.get(khoaCanXem);
            for (int i = 0; i < ds.size(); i++) {
                System.out.println("- " + ds.get(i).ten + " (" + ds.get(i).tuoi + " tuổi)");
            }
        } else {
            System.out.println("Không có khoa này trong danh sách.");
        }

        String khoaDongNhat = "";
        int max = 0;

        for (Map.Entry<String, List<BenhNhan>> entry : mapKhoa.entrySet()) {
            int soLuong = entry.getValue().size();
            if (soLuong > max) {
                max = soLuong;
                khoaDongNhat = entry.getKey();
            }
        }

        System.out.println("\nOutput Analysis: \"Khoa " + khoaDongNhat + " đang đông nhất (" + max + " bệnh nhân)\".");
    }
}