import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grade = new ArrayList<>();

    public Student(String studentName, int studentGrade){
        this.name = studentName;
        grade.add(studentGrade);
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grade.add(grade);
    }

    public double getGradeAverage(){
        double totalGrade = 0;
        for (Integer number: grade){
             totalGrade += number;
        }
        return totalGrade/grade.size();
    }

}
