import java.util.Scanner;

public class sample {
   public static void main(String[] args) {
	 //10
	   // 1 2 5 10
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter amount to return");
	   int rupees=sc.nextInt();
	   //54
	   int n10=0,coin5=0,coin2=0,coin1=0;
	   if (rupees > 10) {
		   // 54 /10---5
		   n10 = rupees / 10;//5 of 10
		   rupees = rupees % 10;// 8
		   {
			if(rupees > 5) {//
				 coin5 = rupees /5;// 5 -- 1
				 rupees = rupees % 5;//3
			}
			if(rupees > 2) {//
				coin2 = rupees /2;
				rupees = rupees % 2;
			}
			if(rupees > 1) {//
				coin1 = rupees /1;
				rupees = rupees %1;
			}
			System.out.println("number of 10rs notes--->"+n10);
			
				
			}
		   }
	   
	   
