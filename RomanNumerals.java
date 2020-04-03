import java.util.*; 
public class RomanNumerals{ 
    public static void main(String[] args) 
    { 
      Scanner scan=new Scanner(System.in); 
         HashMap<Integer,String> l = new HashMap<Integer,String>(); 
        l.put(0,"");
        l.put(1,"I "); 
        l.put(2,"II"); 
        l.put(3,"III"); 
        l.put(4,"IV"); 
        l.put(5,"V"); 
        l.put(6,"VI"); 
        l.put(7,"VII"); 
        l.put(8,"VIII"); 
        l.put(9,"IX"); 
        l.put(10,"X");  
        l.put(20,"XX"); 
        l.put(30,"XXX"); 
        l.put(40,"XL"); 
        l.put(50,"L"); 
        l.put(60,"LX"); 
        l.put(70,"LXX"); 
        l.put(80,"LXXX"); 
        l.put(90,"XC"); 
        l.put(100,"C");   
        l.put(200,"CC"); 
        l.put(300,"CCC"); 
        l.put(400,"CD"); 
        l.put(500,"D"); 
        l.put(600,"DC"); 
        l.put(700,"DCC"); 
        l.put(800,"DCCC"); 
        l.put(900,"CM"); 
        l.put(1000,"M");   
        int n; 
        System.out.print("Enter the Value 1 to 1000:");
         n=scan.nextInt();
       if(n<=100)
         {  
         if(n<10)
           {
             System.out.println("Roman value: "+l.get(n));
           }
         else
           {
             System.out.println("Roman value: "+(l.get(((n/10)*10))+""+(l.get(n%10))));
           }
         }
        else
         {
            System.out.println("Roman value: "+l.get((n/100)*100) +""+l.get((n%100)-(n%10))+""+(l.get(n%10)));
         }      
    }
} 
