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
public class startup {
    public static void main(String [] args){
    IntroToProgrammingCourse visualBasic = new IntroToProgrammingCourse("Intro to Programming", "001");
    IntroJavaCourse Java = new IntroJavaCourse("Intro To Java", "002");
    AdvancedJavaCourse AdvancedJava = new AdvancedJavaCourse("Advanced Java","003");
    //liskovs substatution works well here since we are having different classes in the same array so the array is 
    ProgrammingCourse [] courses = {visualBasic,Java,AdvancedJava};
        for(ProgrammingCourse pc : courses){
             System.out.println(pc.getCourseName());
            System.out.println(pc.getCourseNumber());
            pc.setCredits(4);
            System.out.println(pc.getCredits());
        }
    }
}
//This arcatechure is good because it allows for code reuse but it is bad becasue you can inherit bad code.
