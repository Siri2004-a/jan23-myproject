import java.util.Scanner;
public class CompareTwoDecimals {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a charater");
    char input = sc.next().charAt(0);
    if(Character.isAlphabetic(input)) {
    	System.out.println(input+"is an alphabet");
    }
    else if(Character.isDigit(input)) {
    	System.out.println(input+"is an digit");
    }
    else {
    	System.out.println(input+"is an special charater");
    }
	}
}
    
