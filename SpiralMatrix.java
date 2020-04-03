import java.util.Scanner;
class SpiralMatrix
  {
     static int k=1;
   public static void main(String[] kathir)
     {
       Scanner scan=new Scanner(System.in);
          int n;
       System.out.print("Enter the N value:");
       n=scan.nextInt();
       int max[][]=new int[n][n];
       right(max,-1,-1,n);
       System.out.println("SpiralMatrix");
         for(int i=0;i<n;i++)
            {
              for(int j=0;j<n;j++)
                 {
                   System.out.print(String.format("%4d",max[i][j]));
                 }
               System.out.println("\n");  
            } 
     } 
   static void right(int max[][],int i,int j,int n)
      {
      if(k==(n*n+1))
               return;
        j++;i++;
        while(j!=n)
         {
            if(k==(n*n+1))
               return;
           if(max[i][j]==0)
             {
               max[i][j]=k++;
               j++;
             }
           else
            break;  
         }
        down(max,i,j,n); 
      }
    static void down(int max[][],int i,int j,int n) 
      {
         if(k==(n*n+1))
               return;
        i++;j--;
        while(i!=n)
         {
            if(k==(n*n+1))
               return;
            if(max[i][j]==0)
              {
                max[i][j]=k++;
                i++;
              }
             else
              break; 
         }
       left(max,i,j,n);  
      }
    static void left( int max[][],int i,int j,int n)
      { 
       if(k==(n*n+1))
               return;
        j--;i--;
        while(j!=-1)
         {
            if(k==(n*n+1))
               return;
           if(max[i][j]==0)
            {
             max[i][j]=k++;
             j--;
            } 
           else
             break;    
         }
       up(max,i,j,n);  
      }     
     static void up(int max[][],int i,int j,int n)
       {
          if(k==(n*n+1))
               return;
        i--;j++;
         while(max[i][j]==0)
           {
           if(k==(n*n+1))
               return;
             max[i][j]=k++;
             i--;
           }
         right(max,i,j,n);   
       } 
  }
     
     
     
     
     
     
     
     
     
