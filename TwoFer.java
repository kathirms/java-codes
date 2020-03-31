import java.util.Scanner;
class TwoFer
  {
   public static void main(String[] kathir)
     {
      Scanner scan=new Scanner(System.in);
      String name;
      System.out.print("Enter the Name-->:");
      name=scan.nextLine();
      System.out.println(fun(name)); 
     }
   static String fun(String name)
       {
          if(name.equals("")) 
           return "\none for you ,one for me";
          else
           return "\none for "+name+" ,one for me";
       }  
     
  }
