import java.util.Scanner;
class Collatz_Conjecture
 {
   public static void main(String[] kathir)
    {
   Scanner scan=new Scanner(System.in);
   int n;
   System.out.print("Enter the n value:");
   n=scan.nextInt();
   System.out.print(" :"+A.fun(n)+"steps required to reach 1");
  }
}  
 class A
  {
   static int fun(int n)
    {
      int i=0;
     for(i=0;n!=1;i++)
       {
        System.out.print(" "+n);
          if(n%2==0)
            {
             n=n/2;
            }
          else
            {
              n=n*3+1;
            }  
            
       }
      return i; 
    }
  } 
  
