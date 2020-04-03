import java.util.Scanner;
class Series
  {
   public static void main(String[] kathir)
     {
       Scanner scan=new Scanner(System.in);
         String str;
         int n,i=0,j=0;
        System.out.print("Enter the value:");
        str=scan.nextLine();
        System.out.print("Enter the series value:");
        n=scan.nextInt();
          if(n>str.length())
             {
              System.out.print("Enter the correct series ");
             }
         while(i+n<=str.length())
           {
             for(j=i;j<n+i;j++)
                {
                 System.out.print(str.charAt(j));
                }
              System.out.println("");
              i++;  
           }
     }
  }
