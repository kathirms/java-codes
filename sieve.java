import java.util.Scanner;
 class sieve {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n,i,j;
		System.out.print("Enter the range : ");
		n = scan.nextInt();
		boolean a[] = new boolean[n+1];
		for(i = 2;i<=n;i++)
			a[i] = true;
		for(i = 2;i<=Math.sqrt(n);i++)
			if(a[i])
				for(j = i;j*i<=n;j++)
					a[j*i] = false;
		for(i = 2;i<=n;i++)
			if(a[i])
				System.out.print(i+" ");
	}
}
