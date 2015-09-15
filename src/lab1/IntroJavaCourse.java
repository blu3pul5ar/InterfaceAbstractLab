package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse{
    
    private String prerequisites;
    private String courseNumber;
    private String courseName;
    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }


    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
    @Override
        public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        super.setCredits(credits);
    }
           public String getPrerequisites() {
        return prerequisites;
    }
 @Override
    public void setCourseNumber(String courseNumber) {
       if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
       this.courseNumber = courseNumber;
    }
     public void setCourseName(String courseName) {
       if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
       this.courseName = courseName;
    }
    
}
