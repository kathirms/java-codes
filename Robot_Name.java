import java.util.Scanner;
import java.util.Random;
class Robot_Name
  {
   public static void main(String[] kathir)
    {  
      Scanner scan=new Scanner(System.in);
      System.out.println("random robot name  generater");
      Random r=new Random();
      while(true)
       {
      int n=r.nextInt((999-100)+1)+100;
      int a,b;
      a=(char)r.nextInt(26)+65;
      b=(char)r.nextInt(26)+65;
      System.out.print("New Robot Name is :");
      System.out.print(n);
      System.out.println((char)a+""+(char)b);
      System.out.print("Reset Robot to its Factory Settings press y :");
        if(scan.next().charAt(0)=='y') 
          continue;
        else
          break;  
      }
    }
  }
