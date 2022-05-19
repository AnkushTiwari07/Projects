package practicse;

public class Pyramid {
	
	public static void main(String args[]) {
		
		for(int i = 1  ; i<=4 ; i ++) {
			
			for(int k = i ; k<4 ; k++) {
				
				System.out.print(" ");
			
			}
			
			for(int j = 0 ; j<i;j++) {
				
				System.out.print(" *");
			}
			
			System.out.println(" ");
				
		}
		
		for(int i = 3  ; i>=1 ; i --) {
			
			for(int k = i ; k<4 ; k++) {
				
				System.out.print(" ");
			
			}
			
			for(int j = 0 ; j<i;j++) {
				
				System.out.print(" *");
			}
			
			System.out.println(" ");
				
		}
		
		
	}

	}
