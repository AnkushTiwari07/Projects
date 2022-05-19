package practicse;

public class ab {
	
	public static void main(String[] args) {
		
		int var = 1221;
		int original = var;
		int tempvar = 0;
		
		while(var!=0) {
			
			tempvar = tempvar*10+var%10;
			
			var=var/10;
			
			
		}
		System.out.println("It's a Actual  String : "+original);
		System.out.println("It's a reverse String : "+var);
		
	}
	
		
	}

		
			




