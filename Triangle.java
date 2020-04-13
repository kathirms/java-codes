import java.util.Scanner;
public class Triangle {
	public static void main(String args[])
	{
          int t1,t2,t3;
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the sides of the triangle :-");
	  System.out.print("Side 1 : ");
	  t1 = scan.nextInt();
	  System.out.print("Side 2 : ");
	  t2 = scan.nextInt();
	  System.out.print("Side 3 : ");
	  t3 = scan.nextInt();
	  if(t1 == t2 && t1 == t3)
	  System.out.println("Equilateral triangle");
	  else if(t1 == t2 || t2 == t3 || t1 == t3)
	  System.out.println("Isosceles triangle");
	  else 
	  System.out.println("Scalene triangle");
	}
}
