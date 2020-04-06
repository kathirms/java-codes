import java.util.Scanner;
class Raindrops
  {
    public static void main(String[] kathir)
      {
   Scanner scan=new Scanner(System.in);
   int n,f=0;
   int n1[];
   System.out.print("Enter the value:");
   n=scan.nextInt();
   n1=A.fun(n);
   //System.out.print("In raindrop-speak, this would be a ");
    for(int i=0;i<n;i++)
       {
         if(n1[i]==3){
         System.out.print("Pling");f=1;}
         if(n1[i]==5){
         System.out.print("Plang");f=1;}
         if(n1[i]==7){
         System.out.print("Plong");f=1;}
       }  
       if(f==0)
         {
          System.out.print("In raindrop-speak, this would be "+n);
         }
     }     
  }
class A
 {
  static int[] fun(int n)
    { 
       int n1[]=new int[n];
       int k=0;
     for(int i=1;i<=n;i++)
       {
           if(n%i==0)
             {
                n1[k++]=i; 
             }
       }
      return n1; 
    }
 } 
