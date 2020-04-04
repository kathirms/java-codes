import java.util.Arrays;
import java.util.Scanner;
class WordCount
  {
    public static void main(String[] kathir)
     {
    Scanner scan=new Scanner(System.in);
    String str;
     int k=0,l=0;
    System.out.print("Enter the String:");
    str=scan.nextLine();
    char str1[]=str.toCharArray();
    char str2[][]=new char[50][50];
      for(int i=0;i<str.length();i++)
        {
         if(str1[i]!=' ')
           {
             str2[k][l++]=str1[i];
           }
         else
           {
             k++;l=0;
           } 
        }
        fun(str2,k+1);     
     }
    static void fun(char str[][],int l)
      {
       int count=1;
        for(int i=0;i<l;i++)
           {
            for(int j=i+1;j<l;j++)
              {  try
                   {
                     if(Arrays.equals(str[i],str[j]))
                        {
                         count++;                    //using the exception handling
                         str[j]=null;
                        }
                   }
                  catch(NullPointerException a)
                      {
                        System.out.print("");         
                      }     
              }
              try
                { 
                  System.out.print(str[i]);
                  System.out.println(" :"+count);
                  count=1;
                }
             catch(NullPointerException b)
                {
                  System.out.print(""); 
                }              
           }
      }
         
  }
  
