/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Nicholas
 */
public class startUp {
       public static void main(String [] args){
    IntroToProgrammingCourse visualBasic = new IntroToProgrammingCourse("Intro to Programming", "001");
    IntroJavaCourse Java = new IntroJavaCourse("Intro To Java", "002");
    AdvancedJavaCourse AdvancedJava = new AdvancedJavaCourse("Advanced Java","003");
    //liskovs substatution works well here since we are having different classes in the same array so the array is 
    ProgrammingCourse [] courses = {visualBasic,Java,AdvancedJava};
        for(ProgrammingCourse pc : courses){
             System.out.println(pc.getCourseName());
            System.out.println(pc.getCourseNumber());
            System.out.println(pc.getCredits());
        }
    }
}
//liskovs substation is good when you need to use a bunch of objects that are similar and use the same methods such as in my for loop
//this arcatecture is good becasue it is more secure but it doesnt allow code reuse