package Evaluvation1.BinaryOrnot;

import java.util.Scanner;

public class BinaryOrNot {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a number to check is Binar or Not :");
		int num=sc.nextInt();
		isBinaryOrNot(num);
		
	}
	static void isBinaryOrNot(int number){
        boolean isBinary = true;
        int temp = number;
        while (temp != 0) {
            int rem = temp%10;   
            if(rem > 1){
                isBinary = false;
                break;
            }
            else{
                temp = temp/10;   
            }
        }
        if (isBinary){
            System.out.println(number+" is a binary number");
        }
        else{
            System.out.println(number+" is not a binary number");
        }
    }
}
