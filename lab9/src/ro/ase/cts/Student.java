package ro.ase.cts;

import java.util.List;

public class Student {

    private final String name;
    private final int age;
    private final int groupId;
    private final List<Double> grades;

    public Student(String name, int age, int groupId, List<Double> grades) {
        this.name = name;
        this.age = age;
        this.groupId = groupId;
        this.grades = grades;
    }

    public double computeAverageGrade() {
        var result = 0d;
        for(var grade : grades) {
            result += grade;
        }

        return result / grades.size();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double computeSqrt() {
        var result = 0d;
        for(var grade : grades) {
            result += grade;
        }

        return Math.sqrt(result);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGroupId() {
        return groupId;
    }

    public List<Double> getGrades() {
        return grades;
    }
}
