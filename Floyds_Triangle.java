import java.util.Scanner;
public class Floyds_Triangle {
	public static void main(String args[])
	{
		int n,n1=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows ");
		n= scan.nextInt();
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<=i;j++)
				System.out.print(n1+++" ");
			System.out.println("");
		}
	}

}

