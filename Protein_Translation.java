
import java.util.*;
class Protein_Translation
   {
    public static void main(String[] kathir)
       {
           int k=0,j=0,l=0;
         Scanner scan=new Scanner(System.in);
         System.out.print("Enter the RNA sequences like this UUU,UCC...:");
         String str=scan.nextLine();
         String t="";
         String[] str1=new String[str.length()/3];
         for(int i=0;i<str.length();i++)
          {
             if(l==3)
               {
                t="";l=0;
               }
               l++;
               t=t+str.charAt(i); 
                 
             switch(t)
			{
			case "aug": System.out.print("Methionine ,");
			break;
			case "uuu": case "uug" : System.out.print("Phenylalanine ,");
			break;
			case "ucu" : case "ucc" : case "uca" : case "ucg" : System.out.print("Serine ,");
			break;
			case "uau" : case "uac" : System.out.print("Tyrosine ,");
			break;
			case "ugu" : case "ugc" : System.out.print("Cysteine ,");
			break;
			case "ugg" : System.out.print("Tryptophan ,");
			break;
			case "uaa" : case "uag" : case "uga" : System.out.print("STOP ,");
			break;
			}                    
          }
          
       }
   }
