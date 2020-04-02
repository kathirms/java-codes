import java.util.Scanner;
class DifferenceOfSquares
   {
     public static void main(String[] kathir)
      {
      Scanner scan=new Scanner(System.in);
       int n;
      int total=0,total1=0;
      System.out.print("Enter the value:");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
          {
           total+=i;
          }
        System.out.println("square of the sum:"+total*total);
       for(int i=1;i<=n;i++)
         {
           total1+=i*i;
         }
         // n1=Math.abs(total-total1);
         System.out.println("square of the sum:"+total1);
         //System.out.println("square of the sum:"+total1+"  "+total);
         
         System.out.println(" difference:"+Math.abs(total1-(total*total)));
       }
                      
   }
