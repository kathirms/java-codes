import java.util.Scanner;
class Minesweeper
  {
    public static void main(String[] kathir)
      {
         Scanner scan=new Scanner(System.in);
         int n;
         System.out.print("Enter the board size:");
         n=scan.nextInt();
         char board[][]=new char[n][n];
          for(int i=0;i<n;i++)
             {
              for(int j=0;j<n;j++)
                {
                  board[i][j]=' ';
                }
             }
         D.display(board,n);  
         D.bomb(board,n);
         System.out.println("Added the numbers to a minesweeper board."); 
         D.assign(board,n);     
      }
  }
class D
  {
     static void display(char board[][],int n)
       {
        for(int i=0;i<=n;i++)
            System.out.print("+ ");
            System.out.println("");
           for(int i=0;i<n;i++)
              {
               for(int j=0;j<n;j++)
                {
                  System.out.print("|"+board[i][j]);
                }
                 
               System.out.println("|"); 
              }
           for(int i=0;i<=n;i++)
            System.out.print("+ ");   
      }
    static void bomb(char board[][],int n)
    {
      Scanner scan=new Scanner(System.in);
      int x,y;
      while(true)
        {
         System.out.println("\nset the bomb,Enter the x axis and y axis");
         x=scan.nextInt();
         y=scan.nextInt();
         board[x][y]='*';
         display(board,n); 
         System.out.println("\nset the bomb again press y");
          if(scan.next().charAt(0)=='y')
            continue;
          else
            break;   
        }
    }
    static void assign(char board[][],int n)
      {
        char count=0;
         for(int i=0;i<n;i++)
           {
             for(int j=0;j<n;j++) 
               {
                 if(board[i][j]=='*')
                    continue;
                 else
                   {  
                      if(i-1!=-1&&board[i-1][j]=='*')
                       {
                         count++; 
                       }
                      if(i-1!=-1&&j+1!=n&&board[i-1][j+1]=='*') 
                       {
                        count++;
                       }
                      if(i-1!=-1&&j-1!=-1&&board[i-1][j-1]=='*')
                       {
                        count++;
                       } 
                      if(j-1!=-1&&board[i][j-1]=='*')
                       {
                        count++;
                       } 
                      if(j+1!=n&&board[i][j+1]=='*')
                       {
                        count++;
                       } 
                      if(i+1!=n&&j-1!=-1&&board[i+1][j-1]=='*')
                       {
                        count++;
                       } 
                      if(i+1!=n&&board[i+1][j]=='*')
                       {
                        count++;
                       } 
                      if(i+1!=n&&j+1!=n&&board[i+1][j+1]=='*')
                       {
                        count++;
                       }
                       board[i][j]=(char)(count+'0');
                       count=0;
                   }   
               }
           }
          display(board,n);  
      }   
 }
  
