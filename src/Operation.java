import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Operation {
	static String query;
	static int id;
	static String name;
	static String location;
	static double salary;
	static String designation;
	
	static Scanner sc=new Scanner(System.in);
	
	
	
	  public static void insert()throws Exception {
		 
		Connection con =ConnectionEstablishment.conn();
		Statement stmt=con.createStatement();
		PreparedStatement ps;
		
		System.out.println("Enter employee ID :");
		id=sc.nextInt();
		
		System.out.println("Enter employee name :");
		name=sc.next();
		
		System.out.println("Enter employee Location :");
		location=sc.next();
		
		System.out.println("Enter employee salary :");
		salary=sc.nextDouble();
		
		System.out.println("Enter employee designation :");
		designation=sc.next();
		
		
		query ="insert into Details values (?,?,?,?,?);";
		 
		ps=con.prepareStatement(query);
		 ps.setInt(1, id);
		 ps.setString(2, name);
		 ps.setString(3, location);
		 ps.setDouble(4, salary);
		 ps.setString(5, designation);
		 
		 ps.executeUpdate();
		
		 System.out.println("row INSERTED");
			
	}
	
	public static void delete() throws Exception {
		
		System.out.println("Enter employee ID :");
		id=sc.nextInt();
		
		query ="delete from Details where id="+id+";";
		Connection con =ConnectionEstablishment.conn();
		Statement stmt=con.createStatement();
		
		int n=stmt.executeUpdate(query);
		
		if(n==1)
			System.out.println("row DELETED");
		else
			System.out.println("row is invalid");
		
	}
	
	public static void show() throws  Exception{
		query ="select * from Details";
		Connection con =ConnectionEstablishment.conn();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		
		System.out.println("ID   "+"emp_name    "+"Location  "+"Salary "+"Designation");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"    "+rs.getString(3)+"  "+rs.getDouble(4)+" "+rs.getString(5));
		}
	}
	
	public static void update() throws Exception {
		

		System.out.println("Enter employee ID to update:");
		id=sc.nextInt();
		
		//String arr[]= {"location","salary","designation"};
		
		while(true) {
			System.out.println("what do you want to update(1.location,2.salary,3.designation)?");
			int val=sc.nextInt();
			
			if(val<4 && val>0) {
				switch(val) {
				case 1:
					System.out.println("Updated Location :");
					location=sc.next();
					query ="update Details set location='"+location+"' where id="+id+";";
					break;
					
				case 2:
					System.out.println("Updated salary :");
					salary=sc.nextDouble();
					query ="update Details set salary="+salary+" where id="+id+";";
					break;
					
				case 3:
					System.out.println("Updated designation :");
					designation=sc.next();
					query ="update Details set designation='"+designation+"' where id="+id+";";
					break;
					
				default:
					System.out.println("invalid values....");
					
				}
			}
			Connection con =ConnectionEstablishment.conn();
			Statement stmt=con.createStatement();
			
			int n=stmt.executeUpdate(query);
			
			if(n==1)
				System.out.println("row UPDATED");
			else
				System.out.println("UPDATION  is invalid");
			
			System.out.println("Need more updation?");
			char ch=sc.next().charAt(0);
			
			if(ch=='n')
				break;
			
		}
		
		
		
		
		
		
		
	}
	
}
