import java.util.Scanner;
class AllYourBase
  {
   public static void main(String[] kathir)
     {
      Scanner scan=new Scanner(System.in);
      int n,base,l=0,total=0;
      System.out.print("Enter the N value:");
      n=scan.nextInt();
      System.out.print("Enter the Base value:");
      base=scan.nextInt();
    //  System.out.print("Enter the powe:"+(int)Math.pow(n,2));
      while(n>0)
      {
       total+=(int)Math.pow((n%10)*base,l);
       n=n/10;
       l++;
      }
      System.out.print("value is: "+total);
     }
  }
