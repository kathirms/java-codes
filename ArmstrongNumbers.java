import java.util.Scanner;
class ArmstrongNumbers
  {
   public static void main(String[] kathir)
     {
      long armstrongnumber,armstrongnumber1;
      int length=0;
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter the Number:"); 
      armstrongnumber=scan.nextLong(); 
      armstrongnumber1=armstrongnumber;
      while(armstrongnumber>0)
        {
         armstrongnumber=armstrongnumber/10;
          length++;
        } 
       System.out.println(armstrongnumber1+" is--->:"+armstrongnumber(armstrongnumber1,length));
     }
    static String armstrongnumber(long arms,int length)
      {
       long total=0,total1=0;
       int i;
       long arms1=arms;
       while(arms>0)
        {
            total=(arms%10);
           for(i=0;i<length-1;i++)
              {
               total=total*(arms%10);
              }
            total1+=total;
            total=0;
            arms=arms/10;
        }
        System.out.println(total1+"=="+arms1+":"+(total1==arms1));
        if(total1==arms1)
           return "Armstrong";
        else
           return "NOt Armstrong";  
      }  
  }
