import java.util.Scanner;
class Acronym
  {
   public static void main(String[] kathir)
      {
        Scanner scan=new Scanner(System.in);
        String str;
        int k=1;
        System.out.print("Enter the String :");
        str=scan.nextLine();
        char str1[]=new char[str.length()];
        str1[0]=str.charAt(0);
        for(int i=0;i<str.length()-1;i++)
          {
            if(str.charAt(i)==' ')
              {
                str1[k++]=str.charAt(i+1);
              }
          }
        System.out.print("Acronym is :");
        for(int i=0;i<k;i++)
          {
             System.out.print(str1[i]);
          }  
          System.out.println("");
      }
  }
