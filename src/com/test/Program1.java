package com.test;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println("Square of a number " +num + "is" +(num*num));
	}

}

