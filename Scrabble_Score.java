import java.util.Scanner;
class Scrabble_Score {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String str;
		int ans = 0;
		System.out.print("Enter the String : ");
		str = scan.nextLine();
		for(int i = 0;i<str.length();i++)
		{
			switch(str.charAt(i))
			{
			case 'q': case 'z': ans = ans+10;
			break;
			case 'j': case 'x': ans = ans+8;
			break;
			case 'k': ans = ans+5;
			case 'f': case 'h': case 'v': case 'w': case 'y': ans = ans+4;
			break;
			case 'b': case 'c': case 'm': case 'p': ans = ans+3;
			break;
			case 'd': case 'g': ans = ans+2;
			break;
			default: ans = ans+1;
			break;			
			}
		}
		System.out.println("Scrabble Score = "+ans);
		
	}
}
