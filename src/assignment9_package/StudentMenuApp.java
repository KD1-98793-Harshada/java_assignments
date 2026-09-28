package assignment9_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentMenuApp {

	public static int menuList(Scanner sc) {
		System.out.println("0.Exit");
		System.out.println("1.Add Student");
		System.out.println("2. Display All Students (using Iterator)"); 
		System.out.println("3. Search Student by Roll No");
		System.out.println("4. Sort Students by Roll No");
		System.out.println("5. Sort Students by Name"); 
		System.out.println("6. Sort Students by Marks");	
		System.out.println("Enter choice");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> studentList = new ArrayList<>();
		int choice;
		
		do {
			choice = menuList(sc);
			
			switch(choice) {
			case 1:
				System.out.println("Enter rollno");
				int rollNo = sc.nextInt(); sc.nextLine(); 
				System.out.print(" Name: ");
				String name = sc.nextLine();
				System.out.print(" Marks: ");
				double marks = sc.nextDouble();
				
				studentList.add(new Student(rollNo, name,marks));
				System.out.println();
				break;
				
			case 2: 
				if (studentList.isEmpty()) {
					System.out.println("empty  No students"); 
					} else {
						System.out.println(""); 
						Iterator<Student> itr = studentList.iterator();
						while(itr.hasNext()) {
							Student s = itr.next();
							System.out.println(s);
						}
				}
				break;
			case 3:
				if(studentList.isEmpty()) {
					System.out.println("Empty");
				}else {
					System.out.println("Enter rollno :");
					int searchroll = sc.nextInt();
					
					boolean found = false;
					for(Student s : studentList) {
						if(s.getRollno() == searchroll) {
							System.out.println(s);
							found = true;
							break;
						}
					}
					if(!found) {
						System.out.println("searchno ");
					}
				}
				break;
			case 4:
				if(studentList.isEmpty()) {
					System.out.println("is empty");
				}else {
					Collections.sort(studentList);
					System.out.println("Students sorted");
				}
				break;
			case 5:
				if(studentList.isEmpty()) {
					System.out.println("is empty");
				}else { 
					studentList.sort(Comparator.comparing(Student::getName));
					System.out.println("Students sorted by Name successfully!"); 
					} 
				break;
			case 6: 
				if (studentList.isEmpty()) {
					System.out.println("Collection is empty!"); 
					} else { 
						studentList.sort((s1, s2) -> Double.compare(s2.getMarks(), s1.getMarks())); 
						System.out.println("Students sorted by Marks (highest to lowest) successfully!"); 
						}
				break;
			}
		}while(choice != 0);

	}

}
