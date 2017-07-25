

import java.io.*;
import java.util.*;

public class SalesReport

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double SalesTax = 0;
		double Totalamountdue=0;
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = s.next();
		System.out.println("Enter your Customer number: ");
		int number = s.nextInt();
		System.out.println(" Enter Sales amount: ");
		double sales = s.nextDouble();
		System.out.println("enter tax code: ");
		int code = s.nextInt();
		
		//Totalamountdue= SalesTax + sales;
		
		//System.out.println(name + number + sales + code);
	
		if(code ==0)
		{
			SalesTax=0;
		}
		if (code ==1)
		{
	SalesTax= sales* 0.02;
			
		}
		if (code==2)
		{
			SalesTax= sales*0.05;
			
		}
		Totalamountdue= SalesTax + sales;
		
System.out.println("Sales Report");
System.out.println("Customer number: " + number);
System.out.println("Customer name:"+ name);
System.out.println("Sales amount:" + sales);
System.out.println("Sales Tax:" +SalesTax);
System.out.println("Total amount do: " + Totalamountdue);



		
}
}

