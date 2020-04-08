import java.util.Scanner;
import java.util.Arrays;
class Word_Search
  {
   public static void main(String[] kathir)
     {
      int n,k=0,k1=0,f=0,f1=0;
      Scanner scan=new Scanner(System.in);
      Scanner scan1=new Scanner(System.in);
      System.out.print("Enter the row Size:");
      n=scan.nextInt();
      String str[]=new String[n];
      String str1;
      int count[]=new int[12];
      char str2[][]=new char[n][];
      System.out.println("Enter the words square shape:");
      for(int i=0;i<n;i++)
         {
           str[i]=scan1.nextLine();
         }
     
     System.out.print("Enter the Search word:");
      str1=scan1.nextLine();
      for(int i=0;i<n;i++)
         {
           str2[i]=str[i].toCharArray();
         }    
      for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
            {
               if(str2[i][j]==str1.charAt(k))
                 {
                    k++;
                    if(k==1)
                      {
                        count[0]=i;
                        count[1]=j;
                      }
                    else if(k==str1.length())
                      {
                        count[2]=i;
                        count[3]=j;
                        f=1;
                      
                      } 
                 }
               if(str2[j][i]==str1.charAt(k1))
                 {
                    k1++;
                    if(k1==1)
                      {
                        count[4]=j;
                        count[5]=i;
                      }
                    else if(k1==str1.length())
                      {
                        count[6]=j;
                        count[7]=i;
                        f1=1;
                     
                      } 
                 }  
            }
            if(f==1)
              {
                System.out.println("first letter row :"+count[0]+" col :"+count[1]+"  last latter row :"+count[2]+" col :"+count[3]);
               
              }
            if(f1==1)
              {
                System.out.println("first letter row :"+count[4]+" col :"+count[5]+"  last latter row :"+count[6]+" col :"+count[7]);
             
              }  
            k=0;f=0;
            k1=0;f1=0;  
        }
        k=0;f=0;
        k1=0;f1=0; 
         
       for(int i=0;i<n;i++)
         {
           if(str2[i][i]==str1.charAt(k))
                 {
                    k++;
                    if(k==1)
                      {
                        count[0]=i;
                        count[1]=i;
                      }
                    else if(k==str1.length())
                      {
                        count[2]=i;
                        count[3]=i;
                        f=1;
                      
                      } 
                 }
               if(str2[i][n-1-i]==str1.charAt(k1))
                 {
                    k1++;
                    if(k1==1)
                      {
                        count[4]=i;
                        count[5]=n-1-i;
                      }
                    else if(k1==str1.length())
                      {
                        count[6]=i;
                        count[7]=n-1-i;
                        f1=1;
                     
                      } 
                 } 
                 if(f==1)
              {
                System.out.println("first letter row :"+count[0]+" col :"+count[1]+"  last latter row :"+count[2]+" col :"+count[3]);
               
              }
            if(f1==1)
              {
                System.out.println("first letter row :"+count[4]+" col :"+count[5]+"  last latter row :"+count[6]+" col :"+count[7]); 
         } 
       }        
 }
}  
