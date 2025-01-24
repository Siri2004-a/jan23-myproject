
public class Pattern3 {

	public static void main(String[] args) {
		/*
		 * 
		 *1
		 *2 2
		 *3 3 3
		 *4 4 4 4
		 *5 5 5 5 5
		 * 
		 */
		for(int r= 1,sp=10;r<=5;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print(" ");
			}
			sp=sp -1;
			for(int c=1;c<=r;c++) {
			System.out.print(r+" ");
			}
			System.out.println();
		}
	}
}

