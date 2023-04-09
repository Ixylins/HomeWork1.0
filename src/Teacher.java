public class Teacher {
    private String name;
    private static Student[] students = new Student[30];
    private static int temp = 0;
    int getTemp() {
        return this.temp;
    }

    Student[] getStudents() {
        return this.students;
    }

    String getName() {
        return this.name;
    }

    Teacher(String name) {
        this.name = name;
        System.out.println("Teacher name Constructor");
    }

    public static String addStudent(Student student){
        for (int i = 0; i < 30; i++) {
            students[i] = new Student();
            temp++;
        }
        String[] rollCall; {
            String f = ""+ student.announce();
            for (int i = 0; i < students.length; i++) {
                students[i] = new Student();
                System.out.println(f);
            }
            return f;
        }
    }
}

