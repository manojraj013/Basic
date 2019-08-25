package Evaluvation1.LargeandSmall;

public class LargestAndSmallest {

	public static void main(String[] args) {
		int arr[]= {2,34,45,156,94,209};
		int min=arr[0];
		int max=arr.length ;
		for(int i=1;i<arr.length;i++){
			if(min>arr[i])  
				min=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		
		System.out.println("smallest in array is "+min);
		System.out.println("Largest in array is "+max);
		

	}

}
