package grades;

public class StudentTest {
    public static void main(String[] args) {

        Student isaiah = new Student("Isaiah");

        isaiah.addGrade(95);
        isaiah.addGrade(100);
        isaiah.addGrade(90);

        System.out.println(isaiah.getName() + "'s average grade is : " + isaiah.getGradeAverage());
    }
}
