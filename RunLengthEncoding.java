import java.util.Scanner;
class RunLengthEncoding
  {
   public static void main(String[] kathir)
     {
      Scanner scan=new Scanner(System.in);
      String str;
      System.out.print("Enter Either Cap (or) Small String :");
      str=scan.nextLine();
      char str1[]=new char[str.length()+1];
         for(int i=0;i<str.length();i++)
            {
              str1[i]=str.charAt(i);
            }
      char str2[];
      str2=A.fun(str1,str.length());
      System.out.println("COMPRESSED STRING....");
    for(int i=0;i<str.length();i++) 
       {
         if(str2[i]>=65||str2[i]==0)
           {
            System.out.print(str2[i]);
           }
         else
           {
            System.out.print((int)str2[i]);
           }
       }
       B.fun(str2,str.length());
      
     System.out.println("");
    }   
  }
class A
 {
   static char[] fun(char str[],int l)
    {
      int count=1,k=0,i;
      char str1[]=new char[l+1];
        for(i=0;i<l;i++)
          {
            if(str[i]==str[i+1])
              {
                count++;continue;
              }
            else
              {
                 if(count==1)
                   {
                     str1[k++]=str[i];
                   }
                 else
                   {
                     str1[k++]=str[i];
                     str1[k++]=(char)count;
                   }  
              }
             count=1; 
          }
       
       return str1; 
    }
 }
class B
  {
     static void fun(char str[],int l)
       {
       System.out.println("\n=====>Normal String<=====");
         
         for(int i=0;i<l;)
            {
               if(str[i+1]>=65||str[i+1]==0)
                {
                  System.out.print(str[i]);
                  i++;
                }
                else
                {
                  for(int j=0;j<str[i+1];j++)
                     {
                      System.out.print(str[i]);
                     }
                   i+=2;  
                }
            }
       }
  } 
