package MOD3;

import java.util.*;

	public class DecToOthers {
		public static void main(String args[]) {
			Scanner s = new Scanner(System.in);
			System.out.print("Nilai Desimal : ");
			int num = s.nextInt();
			System.out.print("Nilai Konversi Base : ");
				int base = s.nextInt();
				printBase(num, base);
				System.out.println("");
		}
			static void printBase(int num, int base) {
				int rem = 1;
				String digits = "0123456789abcdef";
				String result = "";
				/* langkah interasi */
				while (num!=0) {
					rem = num%base;
					num = num/base;
					result = result.concat(digits.charAt(rem)+"");
				}
				/* mencetak reverse dari result */
				for(int i = result.length()-1; i >= 0; i--) {
					System.out.print(result.charAt(i));
 } 
 }
}