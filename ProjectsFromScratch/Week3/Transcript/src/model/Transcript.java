package model;

import java.util.ArrayList;
import java.util.List;

/**
 * INVARIANT: course list and grade list are the same size
 * each course has a grade associated, and vice versa, at matching indices
 */

public class Transcript {

    private String studentName;
    private int studentID;
    private List<String> courses;
    private List<Double> grades;

    public Transcript(String studentName, Integer studentID){
        this.studentName = studentName;
        this.studentID = studentID;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }


    // getters

    // EFFECT: return student's name as a string
    public String getStudentName(){ return studentName; }
    // EFFECT: return student's ID as a integer
    public Integer getStudentID(){ return studentID; }
    // EFFECT: return all courses as a string
    public void getCourses() {
        for (String i : courses) {
            System.out.println(i);
        }
    }


    // setters

    // MODIFY: this
    // EFFECT: changes student's name
    public void setStudentName(String name){
        this.studentName = name;
    }

    // MODIFY: this
    // EFFECT: changes student's ID
    public void setStudentID(Integer id){
        this.studentID = id;
    }

    // TODO: Design specification for this method
    // REQUIRE: grade >= 0.0 and <= 4.0 (but grade should be an object with this spec already)
    // MODIFY: this
    // EFFECT: adds course and grade to this
    public void addGrade(String course, double grade){
        courses.add(course);
        grades.add(grade);
    }

    // TODO: Design specification for this method
    // REQUIRE: Course be in this
    //REQUIRES: a course the student has already taken
    // MODIFY: none
    // EFFECT: returns the course with the grade in the string format CourseName: Grade
    // This method should return course name and grade in some consistent String format
    public String getCourseAndGrade(String course){
        for(int i = 0 ; i < courses.size(); i++){
            if(courses.get(i) == course){
                double matchingGrade = grades.get(i);
                return course + ": " + matchingGrade;
            }
            else{
                return "Course not found";
            }
        }
        return "error";
    }

    // TODO: Design specification for this method
    // REQUIRE: none
    // MODIFY: none
    // EFFECT: prints courses with grades to stout
    public void printTranscript(){

    }

    // TODO: Design specification for this method
    // REQUIRE: none
    // MODIFY: none
    // EFFECT: returns double that is the average of all grades in transcript
    public double getGPA(){
        double totalGPA = 0;
        int numberOfGrades = 0;
        for(double grade : grades) {
            totalGPA += grade;
            numberOfGrades += 1;
        }
        return totalGPA/numberOfGrades; }

    //TODO: specification
    // REQUIRE: none
    // MODIFY: none
    // EFFECT: returns double that is the average of grades given
    public double calculateAverage(List<Double> selectedGrades){
        //once you complete this method, figure out how to add it as a helper to getGPA()
        double totalGrades = 0;
        for(double i : selectedGrades){
            totalGrades += i;
        }
        return totalGrades/selectedGrades.size();
    }

    //TODO: specification
    // REQUIRE: none
    // MODIFY: none
    // EFFECT: returns the grade that matches the course given
    public double getGradeByCourse(String course){
        //this method should return the grade for the given course parameter
        for(int i = 0 ; i < courses.size(); i++){
            if(courses.get(i) == course){
                double matchingGrade = grades.get(i);
                return matchingGrade;
            }
        }
        return 0.0;
    }


    //TODO: specification
    // REQUIRE: none
    // MODIFY: none
    // EFFECT: returns double that is the average of all grades in transcript
    public double getAverageOverSelectedCourses(List<String> selectedCourses){
        //think about which method you can call as a helper!
        List<Double> releventGrades = new ArrayList<>();
        for(String course : selectedCourses){
            releventGrades.add(getGradeByCourse(course));
        }
        return calculateAverage(releventGrades);
    }


}
