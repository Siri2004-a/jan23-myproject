import java.util.Scanner;

public class FourthTypeFunction {
	static float anyCountryToIndianRupees(String country,int amt) {
		float res=0.0f;
		if(country.equalsIgnoreCase("USA")) {
			res = amt * 78.67f;
		}
		else if(country.equalsIgnoreCase("UK")) {
			res=amt*120.56f;
		}
		
		else if(country.equalsIgnoreCase("UAE")) {
			res = amt *20.56f;
		}
		return res;
	}
	static int getAmt() {
		return 100;
	}
	public static void main(String[] args) {
		/*int usDollars=100,ukPounds=200,uaeDirams=50;
		float rupees = anyCountryToIndianRupees("USA",getAmt());
		System.out.println("indian rupees for USA----->"+rupees);
		rupees = anyCountryToIndianRupees("UK",ukPounds);
		System.out.println("indian rupees for UK------->"+rupees);
		rupees = anyCountryToIndianRupees("UAE",uaeDirams);
		System.out.println("indian rupees for UAE------>"+rupees);*/
		Scanner sc = new Scanner(System.in);
		System.out.println("enter country---->");
		String country = sc.next();
		String cC= getAmtDetails(country);
		System.out.println("please enter"+cC);
		if(cC.equalsIgnoreCase("Country not Found")) {
			System.out.println("not able to process");
		}
		else {
			int amt = sc.nextInt();
			System.out.println("for "+country+" this amt"+amt+"indian amt"+anyCountryToIndianRupees(country,amt));
		}
	}
	static String getAmtDetails(String country) {
		String res = "";
		if(country.equalsIgnoreCase("USA")) {
			res = "Dollars";
		}
		else if(country.equalsIgnoreCase("UK")) {
			res = "Ponds";
		}
		else if(country.equalsIgnoreCase("UAE")) {
			res = "Diram";
		}
		else {
			res = "Country not Found";
		}
		return res;
	}
}

	
