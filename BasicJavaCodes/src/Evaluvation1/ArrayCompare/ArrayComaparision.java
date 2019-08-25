package Evaluvation1.ArrayCompare;

import java.util.Arrays;

public class ArrayComaparision {
	public static void main(String []args) {
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		if (Arrays.equals(arr1, arr2))
            System.out.println("The Array 1 and 2 are Same");
        else
            System.out.println("The Array 1 and 2 are different");
	}

}
