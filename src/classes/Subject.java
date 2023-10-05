package classes;

import interfaces.AverageCalc;

public class Subject {
    private String name;
    private Teacher teacher;
    private float n1, n2, average;
    private boolean approval;
    private final AverageCalc averageMethod;

    public Subject(String name, Teacher teacher, float n1, float n2, AverageCalc averageMethod) {
        this.name = name;
        this.teacher = teacher;
        this.n1 = n1;
        this.n2 = n2;
        this.averageMethod = averageMethod;
    }

    public void generateAverage() {
        this.average = this.averageMethod.calcAverage(this.n1, this.n2);
        this.approval = this.average >= 7;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public boolean isApproval() {
        return approval;
    }

    public void setApproval(boolean approval) {
        this.approval = approval;
    }
}
