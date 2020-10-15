import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the elements you wants in array");
		int n = in.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter all the elements");
		for(int i=0; i < a.length; i++)
		{
			a[i]= in.nextInt();
		}
		
		int largest1, largest2, temp;
		
		largest1 = a[0];
		largest2 = a[1];
		
			if(largest1<largest2) {
				temp = largest1;
				largest1= largest2;
				largest2 = temp;
			}
				
			
		for (int i=2;i<a.length;i++) {
			if(a[i]>largest1) {
				largest2= largest1;
				largest1= a[i];
			}
			else if(a[i]>largest2 && a[i]<largest1) {
				largest2 = a[i];
			}
		}
			System.out.println("first largest is" + largest1);
			System.out.println("second largest is" + largest2);
			
		

	}

}
