import java.util.Scanner;
class Diamond
  {
   public static void main(String[] kathir)
    {
      Scanner scan=new Scanner(System.in);
      char c,c1='A';
      int a,b; 
      System.out.print("Enter the String:");
      c=scan.next().charAt(0);
      a=b=((c-'A')+(c-'A'))/2;
      for(int i=0;i<=(c-'A')+(c-'A');i++)
        {
        for(int j=0;j<=(c-'A')+(c-'A');j++)
          {
             if(a==j||b==j)
              System.out.print(c1);
             else
              System.out.print(" "); 
          }
          System.out.println("");
          if(i>=((c-'A')+(c-'A'))/2)
             {
               a++;
               b--;
               c1--;
             }
           else
             {
             a--;
             b++;
             c1++;
             }    
        }
    }
  }
