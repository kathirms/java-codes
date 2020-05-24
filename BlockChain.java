import java.util.ArrayList;
import java.security.MessageDigest;
import java.util.Date;
import java.util.Scanner;
class BlockChain 
  {
	
	 public static ArrayList<Block> blockchain = new ArrayList<Block>();
	 
         public static int difficulty =5;
          //message communication between two computers 
	 public static void main(String[] kathir) 
	   {        
	         int l=0,bcount=0;
	         char c;
	         Scanner scan=new Scanner(System.in);
	         Scanner scan1=new Scanner(System.in);
	         String data;
		 System.out.println("--------->simple blockChain<---------");
		 System.out.println("created The genieans Block");
		 System.out.print("Alice Send the message to Bob.... \nEnter the Message  :");
		 data=scan.nextLine();
		 blockchain.add(new Block(data, "0"));
		 System.out.println("Trying to Mine GenesisBlock... ");
		 blockchain.get(0).mineBlock(difficulty);
		 while(true)
		   {  
		       if(l==0)
		         {
		           System.out.print("Bob Send the message to Alice.... \nEnter the Message  :");
		           l=1;
		           
		         }
		       else
		         {
		           System.out.print("Alice Send the message to Bob.... \nEnter the Message  :");
	                   l=0;
		         }  
		      data=scan.nextLine();
		       
		      blockchain.add(new Block(data,blockchain.get((blockchain.size()-1)).hash));
		      
		      System.out.println("Trying to Mine Block "+(blockchain.size()-1)+"... ");
		      
		      blockchain.get(blockchain.size()-1).mineBlock(difficulty);
		      
		      System.out.print("Do you Want to Continue press y else n:");
		      
		       if(scan1.next().charAt(0)=='y')
		          continue;
		       else
		          break;     
	          }
	             System.out.println("\n------->Blockchain is Valid: " + isChainValid()+" :)\n");
	             
	             System.out.println("------->Created The BlockChain :):)--->\n");
	             
		     for(int i=0;i<blockchain.size();i++)
		          {
		           System.out.println("~~~~~~~[[Block"+i+"]]~~~~~~~");
		           System.out.println("[Hash :"+blockchain.get(i).hash);
		           System.out.println(" PreviousHash :"+blockchain.get(i).previousHash);
		           System.out.println(" Data :"+blockchain.get(i).data);
		           System.out.println(" TimeStamp :"+blockchain.get(i).timeStamp);
		           System.out.println(" Nonce :"+blockchain.get(i).nonce+"]");      
                          }
	    }  
	    //check BlockChain is Valid
	public static Boolean isChainValid() 
	   {
		Block currentBlock;
		 
		Block previousBlock;
		
		String hashTarget = new String(new char[difficulty]).replace('\0', '0');
		
		for(int i=1; i < blockchain.size(); i++) 
		    {
			currentBlock = blockchain.get(i);
			
			previousBlock = blockchain.get(i-1);

			if(!currentBlock.hash.equals(currentBlock.calculateHash()) )
			    {
				System.out.println("Current Hashes not equal");			
				return false;
			    }
			if(!previousBlock.hash.equals(currentBlock.previousHash) ) 
			    {
				System.out.println("Previous Hashes not equal");
				return false;
			    }
			if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) 
			   {
				System.out.println("This block hasn't been mined");
				return false;
			   }
		    }
		return true;
	    }   
	
	
  }
class Block 
   {
	//create the block
	public String hash;
	public String previousHash; 
	public String data; 
	public long timeStamp;
	public int nonce;
  
	public Block(String data,String previousHash ) 
	     {
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		
		this.hash = calculateHash();
	     }
	
	//Calculate hash 
	public String calculateHash() 
	    {
		String calculatedhash = StringUtil.applySha256( 
				previousHash +
				Long.toString(timeStamp) +
				Integer.toString(nonce) + 
				data 
				);
		return calculatedhash;
	    }
	
	public void mineBlock(int difficulty)
	    {
		String target = new String(new char[difficulty]).replace('\0', '0'); 
		while(!hash.substring( 0, difficulty).equals(target)) 
		   {
			nonce ++;
			hash = calculateHash();
		   }
		System.out.println("Block Mined!!! : " + hash);
	    }
   }
 class StringUtil
   {
	//Applies Sha256 
	public static String applySha256(String input)
	   {		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");	        
		 
			byte[] hash = digest.digest(input.getBytes("UTF-8"));	        
			StringBuffer hexString = new StringBuffer(); 
			for (int i = 0; i < hash.length; i++) 
			   {
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			  }
			return hexString.toString();
		   }
		catch(Exception e) 
		   {
			throw new RuntimeException(e);
		   }
	   }	
}
