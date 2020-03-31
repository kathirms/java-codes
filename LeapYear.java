import java.util.Scanner;
class LeapYear
   {
    public static void main(String[] kathir)
       {
         Scanner scan=new Scanner(System.in);
         int year;
         System.out.print("Enter the Year-->:");
         year=scan.nextInt();
         System.out.println("");
         if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
           {
             System.out.print( year+"-->:is a leap year");
           }
         else
           {
             System.out.print( year+"-->:is not a leap year");  
           }      
       }
   }
  
