package com.greatlearning;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee("FirstNmaeLastName"," pr123@sh");
		System.out.println(emp);
		
		
		System.out.println("Please enter the Department for the following : ");
		System.out.println (" 1. Technical");
		System.out.println (" 2. Admin");
		System.out.println (" 3. Human Resource");
		System.out.println (" 4. legal");
		int option = 0;
		Scanner sc = new Scanner (System.in);
		option = sc.nextInt();
		if (option == 1) {
			System.out.println("Technical");

			System.out.println("Dear Prachi your generated credentials are as follows");
			
			System.out.println("Email -->>PrachiSharma@department.company.com");
			System.out.println("Password -->> pr123@sh");
		}
		if (option == 2) {
			System.out.println("Admin");

			System.out.println("Dear Prachi your generated credentials are as follows");
			
			System.out.println("Email -->>PrachiSharma@department.company.com");
			System.out.println("Password -->> pr123@sh");
		}
		if (option == 3) {
			System.out.println("Human Resourse");

			System.out.println("Dear Prachi your generated credentials are as follows");
			
			System.out.println("Email -->>PrachiSharma@department.company.com");
			System.out.println("Password -->> pr123@sh");
		}
		if (option == 4) {
			System.out.println("Legal");
		

			System.out.println("Dear Prachi your generated credentials are as follows");
			
			System.out.println("Email -->>PrachiSharma@department.company.com");
			System.out.println("Password -->> pr123@sh");
		}
		 
		
		

	}
	
	 

}
