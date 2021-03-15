package uk.ac.ous.i2p.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		/*Initial phase of the script where the data is hard coded and the Maps are created as
		objects with the type of the interface */
		
		//Create the first map 
		Map<String, String> studentNameNum = new HashMap<>();
		//Add the data to the map
		studentNameNum.put("Clint Eastwood", "S101");
		studentNameNum.put("Jamie Foxx", "S102");
		studentNameNum.put("Olivia Wilde", "S103");
		
		//Create the second map
		Map<String, String> studentNumEmail = new HashMap<>();
		studentNumEmail.put("S101", "abc@uos.ac.uk");
		studentNumEmail.put("S102", "xyz@uos.ac.uk");
		studentNumEmail.put("S104", "klm@uos.ac.uk");
		
		//Create the third map
		Map<String, String> courseNameID = new HashMap<>();
		courseNameID.put("Software Engineering", "SE01");
		courseNameID.put("Network Engineering", "NE02");
		courseNameID.put("Cyber Security", "CS03");
		
		//Create the Maps identifying which student is on which course
		Map<String, String> studentCourseIDNE02 = new HashMap<>();
		studentCourseIDNE02.put("S101", "NE02");
		studentCourseIDNE02.put("S103", "NE02");
		studentCourseIDNE02.put("S105", "NE02");
		
		Map <String, String> studentCourseIDSE01 = new HashMap<>();
		studentCourseIDSE01.put("S102", "SE01");
		studentCourseIDSE01.put("S103", "SE01");
		studentCourseIDSE01.put("S104", "SE01");
		
		Map <String, String> studentCourseIDCS03 = new HashMap<>();
		studentCourseIDCS03.put("S101", "CS03");
		studentCourseIDCS03.put("S102", "CS03");
		studentCourseIDCS03.put("S103", "CS03");
		


		
		//Add pre-defined map (studentNameNum) to the variables defined in Students representing the maps 
		//student.loadStudentList(studentNameNum);
		//System.out.print(student.map_student);
		
		/*Create the Object with the type of the Interface, we can then use the empty methods
		that are referenced in Students to add the previously created maps to the object
		 */
		ContactTracing student = new Students();		
		student.loadStudentList(studentNameNum);
		student.loadEmailList(studentNumEmail);
		
		//Define the objects for each course list
		ContactTracing courseNE02 = new Students();				
		courseNE02.loadCourseList(courseNameID);
		courseNE02.loadStudentCourseList(studentCourseIDNE02);
		
		ContactTracing courseSE01 = new Students();
		courseSE01.loadCourseList(courseNameID);
		courseSE01.loadStudentCourseList(studentCourseIDSE01);
		
		ContactTracing courseCS03 = new Students();
		courseCS03.loadCourseList(courseNameID);
		courseCS03.loadStudentCourseList(studentCourseIDCS03);
		
		//Which student to search for
        String student_number = "S101";
        
        //Search through each of the course lists for the student and convert them to a string, in preparation to add to a List
		String s1 = courseNE02.findMatchingCourses(student_number).toString();
		String s2 = courseSE01.findMatchingCourses(student_number).toString();
		String s3 = courseCS03.findMatchingCourses(student_number).toString();
		
		//Create the list that will 
		List<String> main_list = new ArrayList<>();
		main_list.add(s1);
		main_list.add(s2);
		main_list.add(s3);
		
		System.out.print(main_list);
		
		student.findMatchingStudents(main_list);
		
	}
}