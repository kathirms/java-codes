import java.util.Scanner;
class Isograms
 {
   public static void main(String[] kathir)
    {
      int flage=0;
     Scanner scan=new Scanner(System.in);
     String str;
     System.out.print("Enter the String:");
     str=scan.nextLine();
     for(int i=0;i<str.length();i++)
        {
          for(int j=i+1;j<str.length();j++)
           {
             if(str.charAt(j)==' '||str.charAt(j)=='_'||str.charAt(j)=='+')
               continue;
             if(str.charAt(j)==str.charAt(i))
               {
                 flage=1;
                 break;
               }
           }
        }
       if(flage==0)
         {
           System.out.print("Given string is Isograms");
         }
       else
         {
          System.out.print("Given string is not Isograms");
         }   
    }
 }
