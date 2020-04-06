import java.util.Scanner;
class Phone_Number
 {
  public static void main(String[] kathir)
   {
  Scanner scan=new Scanner(System.in);
  String str;
  int k=0;
  System.out.print("Enter the phone No:");
  str=scan.nextLine();
  char no[]=new char[str.length()];
  for(int i=0;i<str.length();i++)
   {
    if(str.charAt(i)==' '||str.charAt(i)=='+'||str.charAt(i)=='('||str.charAt(i)==')'||str.charAt(i)=='.'||str.charAt(i)=='-')
      continue;
    else
      no[k++]=str.charAt(i);  
   }
    k=0;
   for(int i=0;i<str.length();i++)
     {
       if(no[i]!='\0')
         {
          k++;
         }
     }
   for(int i=k-10;i<k;i++) 
      System.out.print(no[i]);
 }
 }
