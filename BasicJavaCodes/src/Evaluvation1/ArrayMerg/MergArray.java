package Evaluvation1.ArrayMerg;

public class MergArray {
	 public static void main(String[] args) {
	      int[]a = {1,2,3,4};
	      int[]b = {4,16,1,2,3,22};
	      int[]c = new int[a.length+b.length];
	      int count = 0;
	      System.out.println("Element of array A ");
	      for(int i = 0; i<a.length; i++) { 
	    	  System.out.print(a[i]+" "); 
	          c[i] = a[i];
	          count++;
	      } 
	      System.out.println();
	      System.out.println("Element of array B ");
	      for(int j = 0;j<b.length;j++) { 
	    	  System.out.print(b[j]+" ");
	          c[count++] = b[j];
	      } 
	      System.out.println();
	      System.out.println("Combined Array of A and B = ");
	      for(int i = 0;i<c.length;i++) {
	    	  System.out.print(c[i]+" ");
	      }
	   } 
}
