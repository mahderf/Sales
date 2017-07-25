

import java.io.*;
import java.util.*;

public class SalesReport

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double SalesTax = 0;  // intializing a variable
		double Totalamountdue=0;  // initializing a variable
	
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter your name: "); // prompts user to write name
		String name = s.next();   // accept name
		System.out.println("Enter your Customer number: "); // prompts user to wite customer number
		int number = s.nextInt();  // accept number
		System.out.println(" Enter Sales amount: ");  // prompts user to enter sales amount
		double sales = s.nextDouble(); // accepts sales amount
		System.out.println("enter tax code: "); // prompts user to enter tax code
		int code = s.nextInt(); // accepts tax code
		
	
		if(code ==0)  // checks if tax code for a condition
		{
			SalesTax=0;  // calculates sales tax
		}
		if (code ==1)  // checks if tax code for a condition
		{
	SalesTax= sales* 0.02;  // calculates sales tax
			
		}
		if (code==2)  // checks if tax code for a condition
		{
			SalesTax= sales*0.05;  // calculates sales tax
			
		}
		Totalamountdue= SalesTax + sales;  // calculates total amount due
		
System.out.println("Sales Report");
System.out.println("Customer number: " + number);
System.out.println("Customer name:"+ name);
System.out.println("Sales amount:" + sales);
System.out.println("Sales Tax:" +SalesTax);
System.out.println("Total amount do: " + Totalamountdue);



		
}
}

