package MOD3;

public class FactorialIter {
	
	static int factorial(int n) {
		
			int result = 1;
			for (int i = n; i > 1; i--) {
				result *= i;
		}
			
			return result;
	}
	
			public static void main(String[] args) {
				int n = 5;
				System.out.println("n = " + n);
				System.out.println("Faktorial n = "+ factorial(n));
		}
		}


