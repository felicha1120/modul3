package MOD3;
import java.util.Scanner;



	public class DecToOtherRektutif {
		static void printBase(int num, int base) {
			String digits = "0123456789abcdef";
			/* Langkah Rekursif*/
			if (num >= base) {
				printBase(num/base, base);
			}
			
			
			/* Base case: num < base */
			System.out.print(digits.charAt(num%base));
		}	
			public static void main(String args[]) {
				// TODO code application logic here
				Scanner s = new Scanner(System.in);
				System.out.print("Nilai Desimal : ");
					int num = s.nextInt();
		 System.out.print("Nilai Konversi Base: ");
		 int base = s.nextInt();
		 printBase(num, base);
		 System.out.println("");
	 }
	}