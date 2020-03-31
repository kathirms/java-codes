import java.util.Scanner;
class Flames1
  {
     public static void main(String[] kathir)
       {
          char c;
          Scanner s=new Scanner(System.in);
           Percentage per=new Percentage();
          while(true) 
           {   
                per.percentage();
                System.out.println("\n@@@@@Continue Again Press y:");
                c=s.next().charAt(0);
                if(c=='y')
                   continue;
                else
                  break;              
           }
       }
  }
class Percentage
  {
     void percentage()
      {
       {
             Relation k=new Relation(); 
             char c=1;
             int flage=0,count=0,f=0,l=0,f1=0,i,j;
             int[] a=new int[50];
             int[] b=new int[50];
             char[] s3=new char[50];
             char[] s4=new char[50];
             System.out.println("\t\t!!!!!~~~~FLAMES~~~~!!!!!");         
             Scanner s=new Scanner(System.in);
             String s1,s2;
             System.out.print("Enter 1st Name===--->:");
             s1=s.nextLine();
             for(i=0;i<s1.length();i++)
                  {
                     s3[i]=s1.charAt(i); 
                  }
                 s3[i]=64;
             System.out.println("");
             System.out.print("Enter 2nd Name===--->:");
             s2=s.nextLine();
             for(i=0;i<s2.length();i++)
                {
                   s4[i]=s2.charAt(i); 
                }
                 s4[i]=64;
             for(i=0;i<s1.length();i++)
                 {
                   for(j=0;j<s2.length();j++)
                      {
                          if(s3[i]==s4[j])
                             {
                               s3[i]=c;
                               s4[j]=c;
                               a[count++]=2;
                               c++;
                             }
                      }      
                }
             for(i=0;i<s1.length();i++)
                   {  
                        if(s3[i]>64)
                          a[count++]=1;                   
                   }
             for(i=0;i<s2.length();i++)
                  {
                       if(s4[i]>64)
                         a[count++]=1;
                  }  
                   k.relation(a,count); // call the Relation class relation methode
             System.out.println("CALCULATION....???");    
              while(count!=2)
                  {
                          for(i=0;i<count;i++)
                            {
                              System.out.print(a[i]);
                            }
                      System.out.println("");
                          for(i=0;i<count-1;i++)
                            {
                                a[i]=a[i]+a[count-1];
                                count--;
                                if(a[i]>=10)
                                   {
                                     flage=1;                             
                                   }   
                            }
                       if(flage==1)
                         {    
                             f=a[0];
                                for(i=0;i<count;i++)
                                   {
                             
                                     f1=a[i+1];
                                        if(f>=10)
                                          {   
                                        
                                            a[l++]=f/10;
                                            a[l++]=f%10;
                                            f=f1;
                                          }
                                        else
                                          {
                                            a[l++]=f;
                                            f=f1;
                                          }       
                                    
                                   }
                             count=l;
                             l=0;
                             flage=0;   
                        }  
                }
            if(a[0]==1&&a[1]==0&&a[2]==0)
              System.out.println("~~~~~~>***PERCENTAGE***==>:"+a[0]+""+a[1]+""+a[2]+"%.....");
            else
               System.out.println("~~~~~~~~>***PERCENTAGE***==>:"+a[0]+""+a[1]+"%.....");    
      }
      }
  }
class Relation
  {
   void relation(int a[],int length)
    {
          char c=0;
          int l=0,i=0,j=0,flage=0;
          for(i=0;i<length;i++)
               {
                if(a[i]!=2)
                   l=l+a[i];
               }
          char b[]={'F','L','A','M','E','S'};
         //System.out.println(l);
          while(true)
            {
              for(i=0;i<6;i++)
                  {
                    if(b[i]!='0')
                       {
                        j++;
                       }
                     if(b[i]=='0')
                       {
                        continue;
                       }
                    if(l==j)
                       {
                        c=b[i];
                        b[i]='0';
                        flage++;
                        j=0;
                       // break;
                       }  
                  }
              if(flage==6)
                 {
                  break;
                 }    
             }
           
         //System.out.println("final:"+c);
         switch(c)
            {
              case 'F':System.out.println("\n~~~~~~>***RELATIONSHIP***==>: FRIENDSHIP!!!");break;
              case 'L':System.out.println("\n~~~~~~>***RELATIONSHIP***==>: LOVE~~~");break;
              case 'A':System.out.println("\n~~~~~~>***RELATIONSHIP***==>: AFFECTION@@@");break;
              case 'M':System.out.println("\n~~~~~~>***RELATIONSHIP***==>: MARRIAGE$$$");break;
              case 'E':System.out.println("\n~~~~~~>***RELATIONSHIP***==>: ENEMY???");break;
              case 'S':System.out.println("\n~~~~~~>***RELATIONSHIP***==>: SISTER***");break;
            }      
      }   
  }   
