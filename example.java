import java.util.Scanner;
class Customer
  {  
  
  long a=0;
  long amount=10000;  
  
synchronized void withdraw(long amount)
  {  
    System.out.println("going to withdraw...");  
  
    if(this.amount<amount)
      {  
          System.out.println("Less balance; waiting for deposit...");
          System.out.print("deposit :");
          
          try
          {
           Thread.sleep(1000);
          wait();
          }
          catch(Exception e){}
          
      }  
    this.amount-=amount;  
    
       System.out.println("withdraw completed...");
       System.out.println("available balance :"+this.amount);    
  }  
  
synchronized void deposit()
    {  
      Scanner scan=new Scanner(System.in);
      a=scan.nextInt();
      this.amount+=a;    
      System.out.println("going to deposit...");  
      System.out.println("deposit completed... ");  
      notify();  
    }  
  }  
  
class example
  {  
    public static void main(String args[])
      {  
         final Customer c=new Customer();   
         Scanner scan=new Scanner(System.in);
         long a;
         System.out.println("your balance :10000");  
         System.out.print("going to withdraw Enter your amount :");
         a=scan.nextInt();  
         new Thread()
           {  
            public void run()
               {
                 c.withdraw(a);
               }  
           }.start(); 
       if(a>10000){     
         new Thread()
           {  
             public void run(){c.deposit();}  
           }.start();  
           }
      }
      
}  
