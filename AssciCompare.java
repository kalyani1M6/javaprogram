import java.util.Scanner;
class AssciCompare
{
public static void main(String[] args){
	Scanner src = new Scanner(System.in);
	System.out.println("Enter your  input string");
	String input = src.next();

	char c = input.charAt(0);

	if(c >= 65 && c <= 90){
		System.out.println( "is capital");
	}
	else if(c>= 97 && c<= 122){
		System.out.println( "is Lower letter");

	}
	else{
		System.out.println("Invalid alphabaet entered");
	}



}
}