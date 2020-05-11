  /*    _      _   _       _   _  _   _   _
      | |  |  _|  _| |_| |_  |_   | |_| |_|
     |_|  | |_   _|   |  _| |_|  | |_|  _|
  */       
 import java.util.*;
 import java.lang.*;
 class OCR_Numbers
   {
      static int value[][];
      static int n,n1;
     public static void main(String[] kathir)
       { 
          Scanner scan=new Scanner(System.in);
          System.out.print("How many Digit will be Enter :");
          n=scan.nextInt();
          System.out.print("How many row will be Enter :");
          n1=scan.nextInt();
          for(int i=0;i<n1;i++)
            {
             ocrNumber();
             System.out.println("");
            }
       }
     static void ocrNumber()
        {  
          Scanner scan1=new Scanner(System.in);
          String str[]=new String[3];
          int i1=0;
          System.out.println("Enter the OCR_Number:");
            for(int i=0;i<3;i++)
              {
                str[i]=scan1.nextLine();
              }
           System.out.print("Is converted to :");   
            for(int i=0;i<n;i++)
            {
              if(str[0].charAt(i1+1)=='_'&&str[1].charAt(i1)=='|'&&str[1].charAt(i1+1)=='_'&&str[1].charAt(i1+2)=='|'&&str[2].charAt(i1)=='|'&&str[2].charAt(i1+1)=='_'&&str[2].charAt(i1+2)=='|')
              System.out.print(8);
             if(str[0].charAt(i1+1)=='_'&&str[1].charAt(i1)=='|'&&str[1].charAt(i1+1)==' '&&str[1].charAt(i1+2)=='|'&&str[2].charAt(i1)=='|'&&str[2].charAt(i1+1)=='_'&&str[2].charAt(i1+2)=='|')
              System.out.print(0);
             if(str[0].charAt(i1+1)==' '&&str[1].charAt(i1)==' '&&str[1].charAt(i1+1)==' '&&str[1].charAt(i1+2)=='|'&&str[2].charAt(i1)==' '&&str[2].charAt(i1+1)==' '&&str[2].charAt(i1+2)=='|')
              System.out.print(1);
             if(str[0].charAt(i1+1)=='_'&&str[1].charAt(i1)==' '&&str[1].charAt(i1+1)=='_'&&str[1].charAt(i1+2)=='|'&&str[2].charAt(i1)=='|'&&str[2].charAt(i1+1)=='_'&&str[2].charAt(i1+2)==' ')
              System.out.print(2);   
             if(str[0].charAt(i1+1)=='_'&&str[1].charAt(i1)==' '&&str[1].charAt(i1+1)=='_'&&str[1].charAt(i1+2)=='|'&&str[2].charAt(i1)==' '&&str[2].charAt(i1+1)=='_'&&str[2].charAt(i1+2)=='|')
              System.out.print(3);
             if(str[0].charAt(i1+1)==' '&&str[1].charAt(i1)=='|'&&str[1].charAt(i1+1)=='_'&&str[1].charAt(i1+2)=='|'&&str[2].charAt(i1)==' '&&str[2].charAt(i1+1)==' '&&str[2].charAt(i1+2)=='|')
              System.out.print(4);
             if(str[0].charAt(i1+1)=='_'&&str[1].charAt(i1)=='|'&&str[1].charAt(i1+1)=='_'&&str[1].charAt(i1+2)==' '&&str[2].charAt(i1)==' '&&str[2].charAt(i1+1)=='_'&&str[2].charAt(i1+2)=='|')
              System.out.print(5);   
             if(str[0].charAt(i1+1)=='_'&&str[1].charAt(i1)=='|'&&str[1].charAt(i1+1)=='_'&&str[1].charAt(i1+2)==' '&&str[2].charAt(i1)=='|'&&str[2].charAt(i1+1)=='_'&&str[2].charAt(i1+2)=='|')
              System.out.print(6); 
             if(str[0].charAt(i1+1)=='_'&&str[1].charAt(i1)==' '&&str[1].charAt(i1+1)==' '&&str[1].charAt(i1+2)=='|'&&str[2].charAt(i1)==' '&&str[2].charAt(i1+1)==' '&&str[2].charAt(i1+2)=='|')
              System.out.print(7);
             if(str[0].charAt(i1+1)=='_'&&str[1].charAt(i1)=='|'&&str[1].charAt(i1+1)=='_'&&str[1].charAt(i1+2)=='|'&&str[2].charAt(i1)==' '&&str[2].charAt(i1+1)=='_'&&str[2].charAt(i1+2)=='|')
              System.out.print(9);
              i1+=3;  
            } 
       }
   }
 
