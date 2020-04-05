import java.util.Scanner;
class RotationalCipher
   {
     public static void main(String[] kathir)
       {
        int n=0,k=0;
        Scanner scan=new Scanner(System.in);
        String str;
        char abc[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        System.out.print("Enter the plain text:");
        str=scan.nextLine();
        System.out.print("Enter the key value 0 to 25:");
        n=scan.nextInt();
        System.out.print("Enter the cipher text:");
        for(int i=0;i<str.length();i++)
        {
          for(int j=0;j<26;j++)
            {
               if(str.charAt(i)==abc[j]&&str.charAt(i)!=' '||str.charAt(i)==abc[j]-32)
                 {
                   k=j+n;
                   if(k>25)
                     {
                      k=k-25;
                         if(str.charAt(i)==abc[j]-32)
                           System.out.print((char)(abc[k-1]-32));
                         else
                           System.out.print(abc[k-1]);   
                     }
                   else
                     {
                         if(str.charAt(i)==abc[j]-32)
                           System.out.print((char)(abc[k]-32));
                         else
                           System.out.print(abc[k]);   
   
                     }      
                 }  
            }
          if(str.charAt(i)==' ')
                  {
                   System.out.print(" ");
                  }  
  
        } 
       }
   }
