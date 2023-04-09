public class Student {
    private String name;
    private int grade;

    String getName() {
        return name;
    }

    Integer getGrade() {
        return grade;
    }

    Student() {
        name = "default";
        grade = 9;
        System.out.println("Student default Constructor");
    }

    Student(int grade, String name) {
        this.grade = grade;
        this.name = name;
        System.out.println("Student grade&name Constructor");
    }

    Student(String newName, int newGrade) {
        this.grade = newGrade;
        this.name = newName;
        System.out.println("Student grade&name Constructor");

    }

    String announce() {
        String st = this.name + " учится в " + this.grade + " классе";
        System.out.println(st);
        return st;
    }
}
