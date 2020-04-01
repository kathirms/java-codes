import java.util.Scanner;
class NthPrime
  {
  public static void main(String[] kathir)
     {
      int n,j,n1,count=0;
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter the Number:");
      n=scan.nextInt();
      System.out.print("Enter Nth Prime No:");
      n1=scan.nextInt();
      for(int i=2;i<=n;i++)
        {
         for( j=2;j<=i;j++)
            {
              if(i%j==0)
                {
                break;
                }
             }   
             if(i==j)
               {
                count++;
               }
         if(n1==count&&i==j)
           {
            System.out.println(n1+" Prime is :"+j);
           }      
        }
     }
  }
