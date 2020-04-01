import java.util.Scanner;
class ErrorHandling
  {
     void fun(int a)//here a is 1 throw the ArithmeticException object 
        {
         try{
           if(a==1)
             a=10/(a-1);
        
           if(a==2)//here a is 2 throw the ArrayIndexOutOfBoundsException object
             {
             int t[]={1};
               t[1]=90;            
             }
          }
          catch(ArrayIndexOutOfBoundsException we)//here catch ArrayIndexOutOfBoundsException object
            {
             System.out.println("hai kathir ths Exception:"+we);//here print the messsage
            } 
        }   
  public static void main(String[] kathir)
    {
       int a,b;
       Scanner scan=new Scanner(System.in);
       ErrorHandling k=new ErrorHandling();
       System.out.print("Enter the A value:");
          a=scan.nextInt();
       System.out.print("Enter the B value:");
       b=scan.nextInt();
         try{
              System.out.println(a/b);//given value is x/0,here throw the ArithmeticException object 
               k.fun(2);
            }
         catch(ArithmeticException r) //here catch the ArithmeticException object
            {
             System.out.println("Error kathir"+r); // here print the messsage
            }  
            
        
    }
  }
