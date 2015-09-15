/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Nicholas
 */
public abstract class ProgrammingCourse {
    private String courseName;
    private double credits;
    private String courseNumber;

    public ProgrammingCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    
    public final String getCourseNumber() {
        return courseNumber;
    }
      public final double getCredits() {
        return credits;
    }
      public final String getCourseName() {
        return courseName;
    }
      public abstract void setCourseName(String Name);
        public abstract void setCourseNumber(String courseNumber);
        
        
    
        public void setCredits(double credits){
            this.credits = credits;
        }

     
}
