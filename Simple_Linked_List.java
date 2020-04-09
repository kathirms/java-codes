import java.util.Scanner;
class Simple_Linked_List
 {
  static List root;
  public static void main(String[] kathir)
    {
       Scanner scan=new Scanner(System.in);
       while(true)
         {
          System.out.print("Create the Node press 1 :");
          if(scan.nextInt()==1)
            {
              System.out.print("Enter the Data :");
              node(scan.nextInt());
            }
          else
            break;  
         }
       System.out.print("\nlist data is:");  
       while(root!=null)
         {
           System.out.print(" "+root.data);
           root=root.next;
         }
    }
   static void node( int data)
     {
      List temp=new List(data);
      temp.next=root;
      root=temp;
       
     }
 }
class List
  { 
    List(int data)
     {
       this.data=data;
     }
    int data;
    List next;
  }
  
