package Evaluvation1.EnumEg;

import java.util.Scanner;

public class EumAndSwitch {
	public static void main(String []args) {
		EnumDays[] day=EnumDays.values();
		System.out.println("Enter the day order number to print the day ");
		Scanner sc = new Scanner(System.in);
		int ch=sc.nextInt();
		switchMethod(ch);
		
	}

	private static void switchMethod(int ch) {
		switch(ch) {
		case 1:
			System.out.println(EnumDays.SUNDAY);break;
		case 2:
			System.out.println(EnumDays.MONDAY);break;
		case 3:
			System.out.println(EnumDays.TUESDAY);break;
		case 4:
			System.out.println(EnumDays.WEDNESDAY);break;	
		case 5:
			System.out.println(EnumDays.THURSDAY);break;
		case 6:
			System.out.println(EnumDays.FRIDAY);break;	
		case 7:
			System.out.println(EnumDays.SATURDAY);break;	
		default :
			System.out.println("No Such Data Exist  ");
			break;
		}
	}
}
