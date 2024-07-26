import java.util.Scanner;

public class EmployeeManagement {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		
		//Operation op=new Operation();
		
		System.out.println("****** EMPLOYEE MANAGEMENT SYSTEM ******");
		char ch='y';
		
		while(ch=='y') {
			System.out.println("----------------------------------------------------\nEnter any option \n\t1.INSERT\n\t2.DELETE\n\t3.UPDATE\n\t4.SHOW\n-----------------------------------------------------");
			int val=sc.nextInt();
			if(val<5 && val>0) {
				switch(val) {
				case 1:
					Operation.insert();
					break;
					
				case 2:
					Operation.delete();
					break;
					
				case 3:
					Operation.update();
					break;
				
				case 4:
					Operation.show();
					break;
					
				default:
					System.out.println("Please enter valid option......");
					
				}
			}
			System.out.println("do you wnt to continue? (y/n)");
			ch=sc.next().charAt(0);
			
			if(ch=='n')
				System.out.println("Thankyou.........");
		
		}
		
	}

}
