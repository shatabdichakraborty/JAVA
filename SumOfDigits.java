package whileLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
	
		while(temp>0) {
			
			int lastDigit=temp % 10;
			temp/= 10;
			
			sum += lastDigit;
		}
		System.out.println("The sum of digits of " +n+ " is " +sum);
		}
}

//Formula for finding the sum of digits = logbase10(n)+1
//					=(10^x=n) + 1

//int numberOfDigits = (int)Math.log10(n)+1;
//System.out.println(numberOfDigits);
