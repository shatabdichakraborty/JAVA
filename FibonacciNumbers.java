package loops;
import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter n->");
		int n=sc.nextInt();
		System.out.println(a+" ");
		System.out.println(b+" ");
		for(int i=1;i<n-1;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		

	}

}
