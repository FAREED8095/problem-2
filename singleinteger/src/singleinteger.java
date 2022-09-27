import java.util.Scanner;

public class singleinteger {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the integer value");
		a= scan.nextInt();
				
		System.out.println("----------------------------- ");
		for(int i=1; i<=a; i++)
		{
		b=	i*2;
		c=b-1;
			System.out.print( c+" ");
			
		}
		}
}


