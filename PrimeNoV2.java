
public class PrimeNoV2 {

	public static void main(String[] args) {
		//1....100
		for(int i=1,k=0;i<=100;i++) {
			int num = i;
			int counter=0;
			for(int p=1;p<=num;p++) {
				if(num % p ==0) counter++;
			}// for p
			if(counter == 2) {
				System.out.println(num+" ");
				k++;
				if(k==6) {
					System.out.println();
					k=0;
				}// k
				
				
				}
			}
		}

	}


