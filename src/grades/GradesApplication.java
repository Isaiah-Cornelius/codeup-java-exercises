package grades;

import util.Input;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

    static HashMap <String, Student> students = new HashMap<>();





    private static void pickAnotherStudent(HashMap<String, Student> hashMap){
        boolean userChoice = Input.yesNo("Would you like to see another student?");
        System.out.println();
        if (userChoice == true){
            chooseStudent(hashMap);
        } else {
            System.out.println("Goodbye, and have a wonderful day!");
        }
    }

    private static void displayStudentGrades(Student studentSelected, String gitHubUsername){
        System.out.println("Name: " + studentSelected.getName() + "- GitHub Username: " + gitHubUsername);
        System.out.println("Current Grades : " + studentSelected.displayGrades());
        System.out.println("Current Average: " + studentSelected.getGradeAverage());
        System.out.println();
    }

    public static void displayClassAverage(HashMap<String, Student> hashMap){
        double classSum = 0;
        for(Map.Entry<String, Student> student: hashMap.entrySet()){
            Student studentSelected = student.getValue();
            classSum += studentSelected.getGradeAverage();
        }
        double classAverage = (classSum / hashMap.size());
        System.out.println("Class Average is: " + classAverage);
        System.out.println();
    }

    private static void chooseStudent(HashMap<String, Student> hashMap){
        System.out.println("Which student would you like to see more information on?");
        String userChoice = Input.getString();
        System.out.println();
        if(userChoice.equals("ViewClassAverage")){
            displayClassAverage(hashMap);
        } else if(userChoice.equals("ViewAllStudentGrades")){
            for (Map.Entry<String, Student> student : students.entrySet()){
                String gitHubUsername = student.getKey();
                Student studentObject = student.getValue();
                displayStudentGrades(studentObject, gitHubUsername);
            }
        } else if(hashMap.containsKey(userChoice)){
            Student studentSelected = hashMap.get(userChoice);
            displayStudentGrades(studentSelected, userChoice);
        } else {
            System.out.println("Sorry, no student found with the GitHub username of \"" + userChoice + "\".");
        }
        pickAnotherStudent(hashMap);
    }


    public static void main(String[] args) {

        Student isaiah = new Student("Isaiah");
        isaiah.addGrade(90);
        isaiah.addGrade(95);
        isaiah.addGrade(100);

        Student studentA = new Student("Student A");
        studentA.addGrade(90);
        studentA.addGrade(98);
        studentA.addGrade(99);

        Student studentB = new Student("Student B");
        studentB.addGrade(80);
        studentB.addGrade(88);
        studentB.addGrade(89);

        Student studentC = new Student("Student C");
        studentC.addGrade(70);
        studentC.addGrade(78);
        studentC.addGrade(79);


        students.put("gitIsaiah", isaiah);
        students.put("gitStudentA", studentA);
        students.put("gitStudentB", studentB);
        students.put("gitStudentC", studentC);

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println();
        String studentsString = "|";
        for (Map.Entry<String, Student> student : students.entrySet()){
            String studentName = student.getKey();
            studentsString += studentName + "| |";
        }
        studentsString += "ViewAllStudentGrades| |ViewClassAverage| |ViewClassCSV|";
        System.out.println(studentsString);
        System.out.println();

        chooseStudent(students);


    }
}
