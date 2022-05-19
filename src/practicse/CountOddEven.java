package practicse;

public class CountOddEven {
	public static void main(String[] args) {
		
		int arr[] = { 23 , 64 , 65 , 32 };
		
		System.out.println("All odd numbers are :");
		
		for(int i = 0 ; i <= arr.length-1 ; i++) {			

			if(arr[i]%2==0) {	
				System.out.println(arr[i]);

			}
			
			System.out.println("All even numbers are :");
			for(int j = 0 ; j <= arr.length-1 ; j++) {			

				if(arr[j]%2!=0) {	
					System.out.println(arr[j]);

	}
		
	}

		}}}
