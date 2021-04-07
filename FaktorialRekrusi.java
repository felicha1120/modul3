package MOD3;

 class FaktorialRekrusi {
	 
	 static int factorial(int n) {
		 	if (n == 1) { /* The base case */
		 		return 1;
}
		 	
		 /* Recursive definition; Self-invocation */
		 return factorial(n-1)*n;
	 }
	 public static void main(String[] args) {
		 	int n = 5;
		 	System.out.println("n! = " + n);
		 	System.out.println("Faktorial n = "+ factorial(n));
		 }
		}
