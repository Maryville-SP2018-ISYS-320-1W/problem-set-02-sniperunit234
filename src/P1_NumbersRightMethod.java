/*
	ISYS 320
	Name(s):Gabriel lopez	
	Date: 04/15/2018
*/

public class P1_NumbersRightMethod {

	public static void main(String[] args) {
			int i, j;
			int size = 5;
			for (i = 1; i <= size; i++) {
				if (i < size) System.out.printf("%"+(size-i)+"s", " ");
				for (j = 1; j <= i; j++) {
					System.out.print(i);
				}
				System.out.print("\n");
			}
		}
	}