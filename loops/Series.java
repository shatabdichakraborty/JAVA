package loops;
import java.util.Scanner;
public class Series {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		float result = 0;
		
//	for(float i=1;i<=n;i++) {
//		result += 1/i;
//		}
//	System.out.println(result);

		for(float i=1;i<=n;i++) {
			if(i%2==0) {
				result -= 1/i;
			}else {
				result +=1/i; 
			}
		}
	}

}