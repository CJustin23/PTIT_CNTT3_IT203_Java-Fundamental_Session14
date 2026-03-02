import java.util.Comparator;
import java.util.TreeSet;

class Patient {
    String name;
    int severity;
    int arrivalTime;

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String timeToString() {
        int hour = arrivalTime / 60;
        int minute = arrivalTime % 60;
        String mm = (minute < 10) ? "0" + minute : "" + minute;
        return hour + ":" + mm;
    }

    public String severityToString() {
        if (severity == 1) return "Mức 1 - Nguy kịch";
        if (severity == 2) return "Mức 2 - Nặng";
        return "Mức 3 - Nhẹ";
    }

    @Override
    public String toString() {
        return name + " (" + severityToString() + ", đến lúc " + timeToString() + ")";
    }
}

public class Bai05 {
    public static void main(String[] args) {
        Comparator<Patient> cmp = new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                if (p1.severity != p2.severity) {
                    return p1.severity - p2.severity; // 1 trước 2 trước 3
                }
                if (p1.arrivalTime != p2.arrivalTime) {
                    return p1.arrivalTime - p2.arrivalTime; // đến sớm trước
                }
                return p1.name.compareTo(p2.name);
            }
        };

        TreeSet<Patient> hangDoiCapCuu = new TreeSet<>(cmp);

        Patient A = new Patient("Bệnh nhân A", 3, 480);
        Patient B = new Patient("Bệnh nhân B", 1, 495);
        Patient C = new Patient("Bệnh nhân C", 1, 485);

        hangDoiCapCuu.add(A);
        hangDoiCapCuu.add(B);
        hangDoiCapCuu.add(C);

        System.out.println("Output (Thứ tự xử lý):");
        for (Patient p : hangDoiCapCuu) {
            System.out.println(p);
        }
    }
}