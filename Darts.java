import java.util.Scanner;
class Darts
  {
   public static void main(String[] kathir)
     {
      Scanner scan=new Scanner(System.in);
      double a,b;
      System.out.println("Enter the Two Value:");
      a=scan.nextDouble();
      b=scan.nextDouble();
      System.out.println("points: "+darkDist(a,b));
     }
    static int darkDist(double a,double b)
      {
        double Dist;
           Dist=Math.sqrt((a*a)+(b*b));
      if (Dist > 10) 
        {
         return 0;
        } 
      else if (Dist > 5)
        {
         return 1;
        } 
      else if (Dist > 1) 
        {
         return 5;
        } 
      else
        {
         return 10;
        }
     } 
  }
