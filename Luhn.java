import java.util.Arrays;
import java.util.*;
class Luhn
 {
 public static void main(String[] kathir)
   {
     Scanner scan=new Scanner(System.in);
     String str;
     int k=0,total=0;
     System.out.println("Given a number determine whether or not it is valid per the Luhn formula....");
     System.out.print("\nEnter your id 0 t0 9 length 16 digit :");
     str=scan.nextLine();
     char str1[]=str.toCharArray(); 
     for(int i=0;i<str.length();i++)
       {
         if(str.charAt(i)==' ')
           continue;
         else
         { 
           if(k==0)
             {
                if(9<(str1[i]-'0')+(str1[i]-'0'))
                   {
                    str1[i]=(char)(((str1[i]-'0'+str1[i]-'0')-9)+'0');
                    k=1;
                   }
                 else
                   {
                     str1[i]=(char)((str1[i]-'0'+str1[i]-'0')+'0');
                     k=1;
                   }  
             }
            else
             {
              k=0;
             }  
         }  
         
       }
      for(int i=0;i<str.length();i++)
         {
            if(str1[i]==' ')
              continue;
            else
              {
                 total+=str1[i]-'0';
              } 
              
         }
        if(total%10==0)
           {
            System.out.print("\n number is valid..\n");
           }
         else
           {
            System.out.print("\n  number is not valid..\n");
           }    
   }
 }
