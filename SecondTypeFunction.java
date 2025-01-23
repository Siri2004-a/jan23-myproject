
public class SecondTypeFunction {
	static void pattern (char ch1,int num1,char ch2,int num2) {
		for(int i=1;i<=num1;i++) {
		System.out.println(ch1);
	}
System.out.println("/n");
for (int i=1;i<=num2;i++) {
System.out.println(ch2);
}
System.out.println("/n");
	}
	public static void main(String[] abc) {	
		pattern('*',20,'-',25);
		System.out.println("welcome");
		pattern('.',25,'-',35);
		System.out.println("hyderabad");
	}
}
