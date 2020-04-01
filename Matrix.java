import java.util.Scanner;
class Matrix
  {
   public static void main(String[] kathir)
     {  
       Scanner scan=new Scanner(System.in);
       int row,col;
       System.out.print("Enter the Row:");
        row=scan.nextInt();
       System.out.print("Enter the Row:");
        col=scan.nextInt();        
       int max[][]=new int[row][col];
      
        for(int i=0;i<row;i++)
           {
           for(int j=0;j<col;j++)
             {
              max[i][j]=scan.nextInt(); 
             }
              System.out.println("");
          }
           System.out.println("===Column");
          for(int i=0;i<row;i++)
           {
           for(int j=0;j<col;j++)      //print row
             {
               System.out.print(max[i][j]);
             }
              System.out.println("");
          }
          
          System.out.println("===row");
          for(int i=0;i<row;i++)
           {
           for(int j=0;j<col;j++)      //print col
             {
               System.out.print(max[j][i]);
             }
              System.out.println("");
          
          }
 } 
 }
