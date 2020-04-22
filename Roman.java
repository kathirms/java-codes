import java.util.Scanner;
class Roman
  {
    public static void main(String[] kathir)
      {
        Scanner scan=new Scanner(System.in);
        int number,i=12;
        System.out.print("Enter the Number :");
        number=scan.nextInt();
        
        int num[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000}; 
        String sym[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};  
        while(number>0) 
          { 
            int div = number/num[i]; 
            number = number%num[i]; 
            while(0<div--) 
             { 
              System.out.print(sym[i]); 
             } 
            i--; 
         } 
      } 
   
  }

