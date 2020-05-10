class multi1 extends Thread 
{ 
    public void run() 
    { 
        try
        {  
            System.out.println ("Thread " + Thread.currentThread().getId() + " is running"); 
  
        } 
        catch (Exception e) 
        { 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
   
public class multi 
{ 
    public static void main(String[] args) 
    { 
        int n = 8;  
        for (int i=0; i<n; i++) 
        { 
          multi1 object = new multi1(); 
            object.start(); 
        } 
    } 
} 
