package Evaluvation1.Swapping;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NUM1 and NUM2 ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Before Swaping Num1 = "+num1+" Num2 = "+num2 );
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swaping Num1 = "+num1+" Num2 = "+num2 );
	}
}
