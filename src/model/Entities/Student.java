package model.Entities;

import java.util.ArrayList;

/**
 * Created by rzzayed on 5/23/17.
 */
public class Student extends User
{
    private int grade;
    private ArrayList<Course> courses;

    public int getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList courses) {
        this.courses = courses;
    }



}
