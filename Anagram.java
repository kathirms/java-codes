import java.util.Scanner;
class Anagram
  {
    public static void main(String[] kathir)
      { 
        int n,l=0,flage=0;
        Scanner scan=new Scanner(System.in);
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in); 
        System.out.print("How Many name want to Enter:");
        n=scan.nextInt();
        String  list[]=new String[n];
        char list1[][]=new char[n][20];
        String name;
        char name1[]=new char[50];
        for(int i=0;i<n;i++)
          {
           list[i]=scan1.nextLine();
          }
        for(int i=0;i<n;i++)
          {
            for(int j=0;j<list[i].length();j++)
                 list1[i][j]=list[i].charAt(j);
          }
        System.out.print("Enter the Finding word:");
        name=scan2.nextLine();
          for(int i=0;i<name.length();i++)
            name1[i]=name.charAt(i);
           for(int i=0;i<n;i++)
             {
             for(int m=0;m<name.length();m++)
             name1[m]=name.charAt(m);
                if(name.length()!=list[i].length())
                     continue;
                 for(int j=0;j<list[i].length();j++)
                    {
                      for(int k=0;k<name.length();k++)
                         {    
                            if(list1[i][j]==name1[k])
                                {
                                 name1[k]='0';
                                 l++;
                                }
                         }            
                    }
                 if(l==list[i].length())
                      {
                       System.out.println(" the Finding Anagram word:"+list[i]);
                       flage=1;
                      } 
                    l=0;  
            }
          if(flage==0) 
            System.out.println("No Anagram");   
      }
  }
