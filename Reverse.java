import java.util.Scanner;
class Reverse
  {
   public static void main(String[] kathir)
     {
      int n;
      Scanner scan=new Scanner(System.in);
      String string;
      System.out.print("Enter The String-->:");
      string=scan.nextLine();
      System.out.print("\nReverse String is-->:");
      n=string.length();     
      for(int i=n-1;0<=i;i--)
        {
          System.out.print(string.charAt(i));
        }
       System.out.println(""); 
     }
  }
