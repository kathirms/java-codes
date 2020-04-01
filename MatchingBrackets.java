//Brackets Matching using the Stack
import java.util.Scanner;
class MatchingBrackets
  {
   public static void main(String[] kathir)
     {
      int j=1,n=0,m=0,top=0,flage=0;
      Scanner scan=new Scanner(System.in);
      String a;
      char b[]=new char[50];//creat the Stack
      System.out.print("Enter the brackets[],braces{},parentheses():");
      a=scan.nextLine();
      b[0]=a.charAt(0);
      for(j=1;j<a.length();)
       {
         if(b[top]=='[')
            n=1;
         if(a.charAt(j)==']')
            m=1;
         if(b[top]=='(')
            n=2;
         if(a.charAt(j)==')')
            m=2;
         if(b[top]=='{')
            n=3;
         if(a.charAt(j)=='}')
            m=3;
         if(n==m)
            {
             top--;
              j++;
            }
         else
           {
             top++;
             b[top]=a.charAt(j);
             j++;
           }
        if(top==-1&&a.length()==j)
          {
             System.out.println("\nMatching the Brackets");flage=1;
          }
            n=0;m=0;
      }
      if(flage==0)
        System.out.println("\nnot Matching the Brackets:");
   }
 }
 
