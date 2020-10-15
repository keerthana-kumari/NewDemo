import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num,  reverse = 0, remainder;
		System.out.println("enter the integer");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		 while (num!= 0)
	        {
	            remainder = num % 10;
	            reverse = reverse * 10 + remainder;
	            num= num/10;
	        }
		 System.out.println("Reversed integer" + reverse);


	}

}
