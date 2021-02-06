package loops;
import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check");
		int n=sc.nextInt();
		
		boolean isPrime = true;
		
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}
		if(n<2) {
			isPrime = false;
		}
		System.out.println("Is prime is "+ isPrime);
	}

}
