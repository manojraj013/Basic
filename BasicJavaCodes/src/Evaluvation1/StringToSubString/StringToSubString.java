package Evaluvation1.StringToSubString;

public class StringToSubString {
	public static void main(String args[]) {
	      String str = "jan-feb-march";
	      String[] temp;
	      String atpoint = "-";
	      temp = str.split(atpoint);
	      
	      for(int i = 0; i < temp.length; i++) {
	         System.out.println(temp[i]);
	      }
	      
	}

}
