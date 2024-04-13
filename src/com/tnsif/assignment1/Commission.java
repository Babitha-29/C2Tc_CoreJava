package com.tnsif.assignment1;
import java.util.Scanner;

public class Commission {
	
	String name,addr,commission;
	long phoneNo;
	double sales_amount;
	
	Scanner sc=new Scanner(System.in);
	
	
	public void detailsOfEmployee() {
	System.out.println("Name of Employee:");
	name=sc.nextLine();
	System.out.println("Address of employee:");
	addr=sc.nextLine();
	System.out.println("Phone number:");
	phoneNo=sc.nextLong();
	System.out.println("Sales Amount");
	sales_amount=sc.nextDouble();
	
	}
	public void calculateCommission() {
		if(sales_amount>=100000) 
			commission="10%";
		else if(50000>=sales_amount && sales_amount<100000)
			commission="5%";
		else if(30000>=sales_amount && sales_amount<50000)
			commission="3%";
		else
			commission="0";
		System.out.println(" Your Commission is "+commission);
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Commission c=new Commission();
		c.detailsOfEmployee();
		c.calculateCommission();

	}

}
