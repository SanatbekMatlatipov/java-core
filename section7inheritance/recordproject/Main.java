package section7inheritance.recordproject;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <=5; i++) {
            LPAStudent student = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Lisa";
                        default -> "Sanatbek";
                    },
                    "04/01/1994",
                    "Java learning Sanatbek");
            System.out.println(student);
        }
        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 300");
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 300");
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
