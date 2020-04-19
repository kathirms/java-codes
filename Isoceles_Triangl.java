import java.util.Scanner;
import java.lang.Math;
 class Isoceles_Triangl {
  public static void main(String[] kathir)
    {
	int same_sides,last_side;
	double area,base,height;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the same sides of the isoceles triangle ");
	same_sides = scan.nextInt();
	System.out.println("Enter the 3rd side of the isoceles trianlge ");
	last_side = scan.nextInt();
	base = last_side/2;
	height = Math.sqrt((base*base)+(same_sides*same_sides));
	area = ((double)1/2)*(base*height);
	System.out.println("Base: "+base);
	System.out.println("Height: "+height);
	System.out.println("The area of the isoceles triangle is "+area);
    }

}
