package com;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student Id: ");

		int id = scan.nextInt();
		System.out.println("Id is =: " + id);
		scan.nextLine();
		System.out.println("Enter Student Name := ");
		String name = scan.nextLine();
		System.out.println("Student Name is : " + name);
		
		System.out.println("Enter Student RollNo : ");
		int roll = scan.nextInt();
		System.out.println("Student Roll is: "+roll);
		scan.nextLine();
		
		System.out.println("Enter Student Mobile : ");
		String mobile = scan.nextLine();
		System.out.println("Student Mobile is : "+mobile);
	
	}

}
