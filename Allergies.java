import java.util.Scanner;
class Allergies
  {
    public static void main(String[] kathir)
        {
          int n,n1=0,flage=0,k=0,p=0,flage1=0;
          int n2[]=new int[8];
         Scanner scan=new Scanner(System.in);
         System.out.print("Enter the Allergies Score:");
         n=scan.nextInt();  
         if(255<n)
            {
           System.out.println("Allergies food is:"+A.food[0]);
           System.exit(0);
            }   
          
       while(n!=0)
         {
         
           for(int i=0;i<8;i++)
            {
               if(n==A.value[i])
                  {
                  n2[k++]=A.value[i];
                  n=0;
                  flage=1;
                  break;
                  }
            }
              
          for(int i=0;i<8;i++)
            {
                 if(n<A.value[i])
                     continue;
                      n1=Math.abs(n-A.value[i]);
                
              for(int j=0;j<8;j++)               //finding the given score match in the item
                {
                  if(i==j)
                   continue;
                  if(n1==A.value[j])
                   { 
                      n2[k++]=A.value[i];
                      n2[k++]=A.value[j];
                       n=0;
                      flage=1;
                      break;
                   }
                }
              if(flage==1)
                 break;  
            }
            
            if(flage==0)
               {
                  for(int i=0;i<8;i++) 
                     {
                        if(n>A.value[i])
                          {
                             if(p<A.value[i])
                                {
                                  for(int j=0;j<k;j++)
                                     {
                                        if(n2[j]==A.value[i])
                                          {
                                             flage1=1;
                                          }
                                     }
                                }
                          
                        if(flage1==0)
                          {
                             p=A.value[i];
                          }
                        
                         }
                        flage1=0;    
                     }
                 n=n-p;
                 n2[k++]=p;
                 p=0;    
               }   
          }
          if(flage==1)
               {
                 for(int i=0;i<k;i++)
                      
                        {
                           for(int j=0;j<8;j++)
                             {
                               if(n2[i]==A.value[j])
                                 System.out.println("Allergies food is:"+A.food[j]);           
                             }
                        }              
               }     
        }
          
  }
class A   //lists of the items and score
 {
   static String[]food={"eggs","peanuts","shellfish","strawberries","tomatoes","chocolate","pollen","cats"};
   static int value[]={1,2,4,8,16,32,64,128};
 }  
