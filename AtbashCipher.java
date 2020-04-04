import java.util.Scanner;
class AtbashCipher
 {
  public static void main(String[] kathir)
    {
      Scanner scan=new Scanner(System.in);
      String plain;
      char abc[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      System.out.print("Enter the Plain text :");
      plain=scan.nextLine();
      System.out.print("\nThe cipher text is :");
      for(int i=0;i<plain.length();i++)
        {
          for(int j=0;j<26;j++)
            {
               if(plain.charAt(i)==abc[j])
                 {
                   System.out.print(abc[25-j]);
                 }
            }
        }
        System.out.print("\n\nEnter the cipher text :");
        plain=scan.nextLine();
        System.out.print("\nThe plain text is :");
        for(int i=0;i<plain.length();i++)
        {
          for(int j=0;j<26;j++)
            {
               if(plain.charAt(i)==abc[j])
                 {
                   System.out.print(abc[25-j]);
                 }
            }
        }
        System.out.println();
    }
    
 }
