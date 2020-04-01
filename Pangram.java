import java.util.Scanner;
class Pangram
   {
    public static void main(String[] kathir)
      {
       String str;
        char c=65;
        int count=0;
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter the String:");
       str=scan.nextLine();
       
       for(int i=0;i<str.length();i++)
          {
           for( int j=0;j<str.length();j++)
              {
                  if(str.charAt(j)==c||str.charAt(j)==c+32)//check the caps and small letter
                    {
                     count++;
                     c++;              
                    }
              }
           
          }
        if(count==26)
         System.out.print("This is Pangram"); 
        else      
        System.out.print("NOT Pangram"+count);
      }
   }
