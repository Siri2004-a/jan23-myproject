
public class Pattern2 {

	public static void main(String[] args) {
		/*
		 * 5 4 3 2 1----r----1
		 * 5 4 3 2--r-2 ...
		 * 5 4 3--- r-3
		 * 5 4 --
		 * 5
		 * 
		 */
		for(int r=1;r<=5;r++) { // r--1
			for(int c=5;c>=r;c--) {// 5 4 3 2 1
				System.out.print(c+" ");
			}
			System.out.println();
		}
		}

	}

