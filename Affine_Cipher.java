import java.util.Scanner;
class Affine_Cipher
  {
    public static void main(String[] kathir)
      {  
        int a,b,c=0,flag=0;
        Scanner scan=new Scanner(System.in);
        Scanner scan1=new Scanner(System.in);
        String str,str1;
        System.out.print("enter the plain text in Caps letter:");
        str=scan.nextLine();
        System.out.print("enter the key a value:");
        a=scan.nextInt();
        System.out.print("enter the key b value:");
        b=scan.nextInt();
        System.out.print("The Encryption value is :");
        for(int i=0;i<str.length();i++)
           {
            if(str.charAt(i)==' ')
              {
               System.out.print(" ");
              continue;
              }
              System.out.print((char)((((a*(str.charAt(i)-'A'))+b)%26)+'A'));
           }
        for (int i = 0; i < 26; i++) 
          { 
            flag = (a * i) % 26; 
             if (flag == 1) 
              {  
                 c = i; 
              }            
          }
            System.out.print("\nEnter the Cypher text:");
            str1=scan1.nextLine();
           System.out.print("\nThe decryption value is :");
        for(int i=0;i<str1.length();i++)
           {
            if(str1.charAt(i)==' ')
              {
               System.out.print(" ");
              continue;
              }
              System.out.print((char) (((c *((str1.charAt(i) + 'A' - b)) % 26)) + 'A') );  
           }  
      }
  }
