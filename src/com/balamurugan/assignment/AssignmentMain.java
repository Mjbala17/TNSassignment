package com.balamurugan.assignment;
import java.util.Scanner;

import com.balamurugan.assignment.utilities.*;

public class AssignmentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the option , developer (or) manager  : ");
		
		new EmployeeUtilities(sc.next());
		

	}

}
