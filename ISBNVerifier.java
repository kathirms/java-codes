import java.util.Scanner;
class ISBNVerifier
  {
   public static void main(String[] kathir)
     {
       int l=10,total=0;
     Scanner scan=new Scanner(System.in);
     String isbn;
     System.out.print("Enter the isbn 0 to 9 :");
     isbn=scan.nextLine();
       if(10!=isbn.length())
        System.out.print("\nNot Valid"+1);
      for(int i=0;i<9;i++)
         {
            if (0<=(isbn.charAt(i)-'0')&&9 >=(isbn.charAt(i)-'0'))
              {
                     total+=((isbn.charAt(i)-'0')*l);
                     //System.out.println(" v:"+(isbn.charAt(i)-'0')+" l :"+l);
                     l--;
                     //System.out.println("\n Value"+total);
              }
            else
              System.out.print("\nNot Valid"+2);
         }  
      if((isbn.charAt(9)!='X')&&(0<=(isbn.charAt(9)-'0')&&9>=(isbn.charAt(9)-'0')!=true))
           System.out.print("\nNot Valid"+3);
      if(isbn.charAt(9)=='X')
         total+=10;
       else
         total+=isbn.charAt(9)-'0';   
      if(total%11==0)
         System.out.println("\nValid");
       else
         System.out.println("\nNot Valid");
     }
     
     
  }
