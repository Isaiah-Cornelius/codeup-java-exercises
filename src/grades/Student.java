package grades;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String studentName;

    private ArrayList<Integer> studentGrade;

    public Student(String name){
        this.studentGrade = new ArrayList<>();
        this.studentName = name;
    };

    public String getName(){
        return this.studentName;
    };

    public void addGrade(int grade){
        this.studentGrade.add(grade);
    };

    public double getGradeAverage(){
        double gradeSum = 0;
        double gradeAverage;
        int i;
        for (i = 0; i < this.studentGrade.size(); i++){
            gradeSum += this.studentGrade.get(i);
        }
        gradeAverage = (gradeSum / this.studentGrade.size());
        return gradeAverage;
    };

    public ArrayList<Integer> displayGrades(){
        return this.studentGrade;
    }

}
