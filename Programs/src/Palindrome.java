import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {	
		
		int n, reversedN = 0, remainder, temp;
		System.out.println("enter the integer");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		temp = n;
		while (n != 0) {
	        remainder = n % 10;
	        reversedN = reversedN * 10 + remainder;
	        n /= 10;
	    }
		if (temp == reversedN)
        System.out.printf(" palindrome.", temp);
		
    else
        System.out.printf(" not a palindrome.", temp);
    

	}

}
