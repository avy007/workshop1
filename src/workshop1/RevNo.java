package workshop1;

public class RevNo {

	public static void main(String[] args) {
		int num=123;
		int r;
		
		while(num>0) {
			
			r=num%10;
			System.out.print(r);
			
			num=num/10;
		}
		
		}

	}


