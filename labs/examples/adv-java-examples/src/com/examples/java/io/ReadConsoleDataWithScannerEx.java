package com.examples.java.io;

import java.util.Scanner;

public class ReadConsoleDataWithScannerEx 
{
	public static void main(String args[]) 
	{
		System.out.println("--------Enter Your Details-------- ");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.nextLine();
		System.out.print("Enter your age: ");
		int i = in.nextInt(); in.nextLine();
		System.out.print("Enter your designation: ");
		String d = in.nextLine();
		//System.out.println("Age: " + i);

		//System.out.println("Designation: " + d);
		
		System.out.format("Name \t Age \t Designation \n");
		System.out.format("%s \t %s \t %s\n", name, i, d);
		in.close();
	}
}