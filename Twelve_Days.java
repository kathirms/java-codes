import java.util.Scanner;
 class Twelve_Days {
	public static void main(String args[]) {
		int i,j;
		Scanner scan = new Scanner(System.in);
		String s[] = {" a Patridge in a Pear Tree"," two Turtle Doves"," three French Hens"," four Calling Birds"," five Gold Rings"," six Geese-a-Laying"," seven Swans-a-Swimming"," eight Maids-a-Milking"," nine Ladies Dancing"," ten Lords-a-Leaping"," eleven Pipers Piping","  twelve Drummers Drumming"};
		for(i = 0;i<s.length;i++) {
			System.out.print("On Day "+(i+1)+" of Christmas my true love gave to me:");
			for(j = i;j>=0;j--) {
				System.out.print(s[j]);
				if(j!=0)
					System.out.print(", ");
			}
			System.out.print(".");
			System.out.println();
		}
	}

}

