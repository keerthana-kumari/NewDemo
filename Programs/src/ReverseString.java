import java.lang.*;
import java.io.*;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		 java.lang.String input = "fcfgg";
		//getBytes used to convert string into bytes
		//byte[] strAsByteArray = input.getBytes();
		//byte[] result = new byte[strAsByteArray.length];
		//for(int i=0; i<strAsByteArray.length;i++)
			//result[i] = strAsByteArray[strAsByteArray.length-i-1];
		
		//System.out.println(new String(result));
		
		//StringBuilder input1 = new StringBuilder();
		//append a string into string builder input1
		//input1.append(input);
		//reverse stringbuilder input1
		//input = input1.reverse();
		//print
		//s.o.p(input1);
		
		
		
		char[] a= input.toCharArray();
		for(int i = a.length-1; i>=0; i--)
			System.out.println(a[i]);

		
	}

}
