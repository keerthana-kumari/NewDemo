
import java.util.Scanner;
import java.lang.String;

public class RemoveString {

	public static void main(String[] args) {
		String str;
		String numbers;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string that contains the number");
		str = sc.nextLine();
		
		numbers = str.replaceAll("[^0-9]", "");
		System.out.println("Numbers are:" + numbers);
		
		
	}

}
