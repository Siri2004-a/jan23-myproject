
public class Pattern1 {
 
	public static void main(String[] args) {
      /*
      *5
      *5 4
      *5 4 3
      *5 4 3 2
      *5 4 3 2 1
      */
		for(int r=5;r>=1;r--) {
			for(int c=5;c>=r;c--) {//1<=1
				System.out.print(c+" ");
			}
		System.out.println();
			}
	}
	}
