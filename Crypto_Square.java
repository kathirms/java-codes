import java.util.Scanner;
class Crypto_Square
 {
  public static void main(String[] kathir)
    {
      Scanner scan=new Scanner(System.in);
      String str;
      int k=0,l=0,j=0;
      System.out.print("  54 characters long Enter the plain text:");
      char str1[][]=new char[7][8];
      str=scan.nextLine();
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)==' '||str.charAt(i)==',')
             continue;
          if(l==8)
          {
            k++;j=0;l=0;
          }
         str1[k][j++]=str.charAt(i);
         l++;  
        }
        for(int i=0;i<k+1;i++)
          System.out.println(str1[i]);
     System.out.println("The Encryption string :");   
      for(int i=0;i<8;i++)
        {
          for(int a=0;a<7;a++)
           {
            System.out.print(str1[a][i]);
           }
          System.out.print(" "); 
        }  
         System.out.println("\nThe decryption string :");   
      for(int i=0;i<7;i++)
        {
          for(int a=0;a<8;a++)
           {
            System.out.print(str1[i][a]);
           } 
        }  
    }
 }

