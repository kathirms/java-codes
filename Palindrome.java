import java.util.Scanner;
class No
{
	static  int r,ans;
	public static boolean num(int n)
	{
		int temp = n;
		while(n>0)
		{
			r = n%10;
			ans = ans*10+r;
			n = n/10;
		}
		if(ans == temp)
			return true;
		else
			return false;
	}
}
class string			
{
	public static boolean str(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		if(s.equals(sb.reverse().toString())) 
			return true;
		else
			return false;
	}
	
	
}
public class Palindrome {
	public static void main(String args[])
	{
		int choice;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		System.out.println("Press 1 for Number Palindrome checking");
		System.out.println("Press 2 for String Palindrome checking");
		choice = scan.nextInt();
		switch(choice)
		  {
		case 1:
		
			System.out.print("Enter the number : ");
			int num = scan.nextInt();
			if(No.num(num))
				System.out.println("Palindrome!!!");
			else
				System.out.println("Not a Palindrome...");
	                break;	
		case 2:
		 
			System.out.println("Enter the String : ");
			String str = scan.next();
			if(string.str(str))
				System.out.println("Palindrome!!!");
			else
				System.out.println("Not a Palindrome...");
		        break;
		default:
		
			System.out.println("Invalid input...");
			System.exit(0);
	           	
	        }		
	}
}
