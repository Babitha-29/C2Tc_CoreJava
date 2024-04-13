package com.tnsif.assignment1;
import java.util.Scanner;
public class Details {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		char ini,grade;
		long rollNo;
		float prct;
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your initial:");
		ini=sc.next().charAt(0);
		System.out.println("Enter ur Rollno.:");
		rollNo=sc.nextLong();
		System.out.println("Enter your Grade:");
		grade=sc.next().charAt(0);
		System.out.println("Enter your percentage:");
		prct=sc.nextFloat();
		
		System.out.println("Name:"+name+" "+ini);
		System.out.println("RollNo.:"+rollNo);
		System.out.println("Grade:"+grade);
		System.out.println("Percentage:"+prct);
		}

}
