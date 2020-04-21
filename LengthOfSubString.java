import java.util.Scanner;
public class LengthOfSubString 
     {
         public static void main(String[] kathir)
         {
             Scanner scan = new Scanner(System.in);
             String string;
             int count = 1,k = 0,temp,large = 0;
             System.out.print("Enter the string :");
             string = scan.nextLine();
             char[] str = string.toCharArray();
             int ans[] = new int[str.length];
             for(int i = 0;i<str.length;i++)
             {
            	 count = 1;
                 for(int j = i+1;j<str.length;j++)
                 {
                     if(str[i] == str[j])
                     {
                         count = j-i;
                         break;
                     }
                 }
                 if(count!=0)
                 {
                     if(count > large)
                     {
                    	 System.out.println("Count = "+count);
                         large = count;
                     }
                 }
             }
             System.out.print("The length of the longest substring is "+large);
         }
         
}
