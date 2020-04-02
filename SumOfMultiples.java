import java.util.Scanner;
class SumOfMultiples
   {
     public static void main(String[] kathir)
       {
        int a,n,total=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the multiple value:");
        a=scan.nextInt();
        System.out.print("Enter the limit N value:");
        n=scan.nextInt();
        System.out.print("Multiples:");
        for(int i=1;a*i<=n;i++)
          {
             for(int j=1;j<=n;j++)
                {
                  if(a*i==j)
                     {
                      total=total+(a*i);
                      System.out.print(j+",");
                       break; 
                     } 
                }
          }
          System.out.println("\nsum:"+total);
       }
   }
