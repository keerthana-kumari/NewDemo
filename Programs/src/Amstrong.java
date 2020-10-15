import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		int num, temp, remainder, result = 0;
		System.out.println("enter the integer");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
        temp = num;

        while (temp!= 0)
        {
            remainder = temp % 10;
            result += remainder*remainder*remainder;
            temp /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");

	}

}
