import java.util.Scanner;
class PascalTriangle
   {
    public static void main(String[] kathir)
     {
      Scanner scan=new Scanner(System.in);
      int n,cal=0;
       System.out.print("Enter the row:");
       n=scan.nextInt();
       for(int i=0; i<n; i++)            
         {
        for(int space=1;space<=n-i;space++) 
            System.out.print(" ");
 
        for(int j=0;j<=i;j++)     
        {
            if (j==0||i==0)     
                cal = 1;
            else
                cal = cal*(i-j+1)/j;  
 
            System.out.print(cal+" ");
        }
        System.out.println("");
    } 
     }
   }
