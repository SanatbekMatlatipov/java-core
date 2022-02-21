import java.util.HashMap;
import java.util.Map;

public class Main {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
//        ITelephone timsPhone;
//        timsPhone = new DeskPhone(12345);
//        timsPhone.powerOn();
//        timsPhone.callPhone(12345);
//        timsPhone.answer();
//
//        timsPhone = new MobilePhone(243232);
//        timsPhone.powerOn();
//        timsPhone.callPhone(24565);
//        timsPhone.answer();
        Student student = new Student("H234");
        Student student1 = new Student("H234");
        System.out.println(student.equals(student1));
        System.out.println(student);
        System.out.println(student1);

        Map<Student, ReportCard> studentReportCardMap = new HashMap<Student, ReportCard>();
        studentReportCardMap.put(student, new ReportCard());
        studentReportCardMap.put(student1, new ReportCard());

        System.out.println(studentReportCardMap.size());
    }
}
