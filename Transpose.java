import java.util.Scanner;
class Transpose
   {
    public static void main(String[] kathir)
       {  
         int n,l=0;
         Scanner scan=new Scanner(System.in);
         System.out.print("Enter the row size:");
         n=scan.nextInt();
         String max1[]=new String[n];
         System.out.println("Enter the Text:");
         char max[][]=new char[n][10];
         for(int i=0;i<n;i++)
            {
             max1[i]=scan.nextLine();
            }
         for(int i=0;i<n;i++)
            {
             for(int j=0;j<max1[i].length();j++)
                {
                   if(l<max1[i].length())
                        {
                         l=max1[i].length();
                        }
                             max[i][j]=max1[i].charAt(j);
            }
          }    
         System.out.println("THE TRANSPOSE MAX");   
            for(int i=0;i<l;i++)
               {
             for(int j=0;j<n;j++)
                  {
                        System.out.print(max[j][i]);
                        if(max[j][i]=='\0')
                        System.out.print(" ");         
                  }
               System.out.println(""); 
               }  
           
       }
   }
