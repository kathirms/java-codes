import java.util.Scanner;
class Largest_Series_Product
{
public static void main(String[] kathir)
     {  
        int n=0,total=1,value=0;
        Scanner scan=new Scanner(System.in);
        String int0;
        System.out.print("Enter the String in integers:");
        int0=scan.nextLine();
        System.out.print("substring of digits of length:");
        n=scan.nextInt();
        for(int i=0;n+i<=int0.length();i++)
          {
            for(int j=i;j<n+i;j++)
              { 
                System.out.print(int0.charAt(j));
                total=total*(int0.charAt(j)-'0');     
              }
               if(value<total)
                 {
                  value=total;
                 }                 
                 System.out.println(" :"+total); 
                 total=1;
             
        }
        System.out.println("big product :"+value);
     }
}
