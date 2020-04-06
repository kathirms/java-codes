import java.util.Scanner;
class Saddle_Points
 {
   public static void main(String[] kathir)
    { 
      Scanner scan=new Scanner(System.in);
      Scanner scan1=new Scanner(System.in);
      int row,col;
      System.out.print("Enter the row:");
      row=scan.nextInt();
      System.out.print("Enter the col:");
      col=scan.nextInt();
      int max[][]=new int[row][col];
      System.out.println("Enter the matrix");
      for(int i=0;i<row;i++)
        {
         for(int j=0;j<col;j++)
           {
             max[i][j]=scan1.nextInt();
           }
        }
      A.fun(max,row,col);
    }
 }
class A
 {
  static void fun(int max[][],int row,int col)
   {
     int flage=0,flage1=0;
     for(int i=0;i<row;i++)
       {
         for(int j=0;j<col;j++)
           {
             for(int l=0;l<col;l++)
               {
                 if(j==l)
                   continue;
                 else if(max[i][j]>=max[i][l])
                   flage=1;
                 else
                   {
                    flage=0;
                   break; 
                  }
               }
             for(int l=0;l<row;l++)
               {
                 if(i==l)
                  continue;
                 else if(max[i][j]<=max[l][j])
                  flage1=1;
                 else
                  {
                  flage1=0;
                  break;  
                  } 
              }
           if(flage==1&&flage1==1)
             {
               System.out.print("saddle point at column "+(j+1)+", row "+(i+1)+", with value "+max[i][j]);
             } 
            flage=0;flage1=0;   
           }
       }
   }
 }
