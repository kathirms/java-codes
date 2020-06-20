import java.util.ArrayList;
import java.util.Scanner;

// main class
class ParkingSystem {

          //storing the parking levels in ArrayList          
          public static ArrayList < MultiLevelParkingSystem > parkingLists = new ArrayList < MultiLevelParkingSystem >();
          
          //main function                   
          public static void main( String[] argu ) {  
                    Scanner scan=new Scanner( System.in );
                    int getChoice;
                    char continueOrExit='y';                                
                    System.out.print("\t\t\t ***Wellcome To Multi Level Parking System***\n\n");                      
                    parkingLists.add( new MultiLevelParkingSystem() );  //created initial level 0                       
                    DisplayClass.display( parkingLists );//display the parking lists
                    
                         while( continueOrExit=='y' )  {    
                                   System.out.print("\n\t\t\t---->Enter Your Choice????\n\n"); 
                                   System.out.print("     \t\t\t  1->PARKING\n     \t\t\t  2->UNPARKING   ");
                                   getChoice=scan.nextInt();
                                   
                                   //parking process
                                   if( getChoice==1 ) {
                                             ParkingProcessClass.park( parkingLists );//call the park process functon 
                                             
                                             DisplayClass.display( parkingLists );//call the display function 
                                   }
                                   
                                   //unparking process                                     
                                   else if( getChoice==2 ) {
                                             UnparkingProcessClass.unpark( parkingLists );//call the unpark process function
                                             
                                             DisplayClass.display( parkingLists );//call the display function
                                   }
                                   else  {
                                             System.out.println("\n\t\t\tEnter the correct choice....");
                                             continue;
                                   }
                                   
                                   System.out.print("\n\t\t\tDO You Want To Continue Again Press y Else n :");
                                   
                                   continueOrExit=scan.next().charAt(0);// get the value of again continue or break the process(y=>continue or n=>break)
                         }                               
          }               
} 
   
//class of multilevel parking system
class MultiLevelParkingSystem {    
          int car[]=new int[10];       
          int bike[]=new int[10];       
          int bicycle[]=new int[10];
}

//class of display function
class DisplayClass {

          //display function           
          static void display( ArrayList< MultiLevelParkingSystem > parkingLists ) { 
                           
                    for(int i=0; i<parkingLists.size() ; i++) {                         
                              System.out.println("\t\t\t     ------->level :"+i+"<-------");
                              System.out.println("\t\t\t cars       bikes       bicycles\n");
                                                      
                              //display process(0=>empty and 1=>parked)                             
                              for(int j=0; j<10; j++) {      
                                                        
                                        //check the value 0 or 1 in the car Array                                        
                                        if( parkingLists.get(i).car[j]==1 ) {
                                                  System.out.print("\t\t\t parked");                                          
                                        }
                                        else {                                                                          
                                                  System.out.print("\t\t\t empty");                                          
                                        }
                                        
                                        //check the value 0 or 1 in the bike Array
                                        if( parkingLists.get(i).bike[j]==1 ) {                                            
                                                  System.out.print("      parked");                                          
                                        }                                        
                                        else {                                                                           
                                                  System.out.print("      empty");                                          
                                        }
                                                                                
                                        //check the value 0 or 1 in the Bicycle Array                                        
                                        if( parkingLists.get(i).bicycle[j]==1 ) {                                         
                                                  System.out.println("       parked");                                          
                                        }                                        
                                        else {                                        
                                                  System.out.println("       empty");         
                                        }                                         
                              }                           
                    }                     
          }                                    
}
    
   //class of park process function        
class ParkingProcessClass {   
     
          //park function          
          static void park( ArrayList< MultiLevelParkingSystem > parkingLists ) {                
                    int typeOfVehicle=0;
                    int flage=0;
                    int checkToParking[];                    
                    Scanner scan1=new Scanner(System.in);                    
                    System.out.print("\n\t\t\tWhich Type Of Vehicle Do You Want to Park...???   \n");                   
                    System.out.print("\t\t\t  1->Car\n\t\t\t  2->Bike\n\t\t\t  3->Bycycle   ");                   
                    typeOfVehicle=scan1.nextInt();//get the Vehicle type 
                                      
                    while(flage==0) {   
                                        
                              //park process(set the value 1 to park Vehicle)                       
                              for(int i=0; i<parkingLists.size() ; i++) {                            
                                        if( typeOfVehicle==1 ) {                                                 
                                                  checkToParking=parkingLists.get(i).car;//get the car array to park the car
                                        }
                                        else if( typeOfVehicle==2 ) {                                   
                                                  checkToParking=parkingLists.get(i).bike;//get the bike array to park the bike
                                        }
                                        else {      
                                                  checkToParking=parkingLists.get(i).bicycle;//get the bicycle array to park the bicycle
                                        }  
                                                                        
                                        //finding the parking place       
                                        for(int j=0; j<10; j++) {
                                        
                                                  //finding the empty place to park
                                                  if( checkToParking[j]==0 ) {
                                                            checkToParking[j]=1;//parked Vehicle (value set 1)
                                                            System.out.println("\n\t\t\t------>Your Vehicle is Parked !!!!");
                                                            flage=1;
                                                            break;
                                                  }
                                        }    
                                        if( flage==1 ) { //exit the loop when Vehicle parked!
                                                   break;
                                        }
                              }
                              
                              //when can not finding the empty place  create the next parkinglevel     
                              if( flage==0 ) {
                                        System.out.println("\n\t\t\t------>Your  Vehicle Move To next level To parking   Level :"+( parkingLists.size() ));
                                        parkingLists.add( new MultiLevelParkingSystem() );//create the level of parking and adding the parkingList(ArrayList)
                              }           
                    }
          }
}    

//class of unpark process function
class UnparkingProcessClass {

          //unpark function                    
          static void unpark( ArrayList< MultiLevelParkingSystem > parkingLists ) {              
                    Scanner scan2=new Scanner( System.in );                 
                    int typeOfUnparkingVehicle=0;
                    int unparkingLevel=0;
                    int unparkingPlace=0;                 
                    System.out.print("\n\t\t\tWhich Type Of Vehicle Do You Want to UnPark...???   \n ");                
                    System.out.print("\n\t\t\t  1->Car\n\t\t\t  2->Bike\n\t\t\t  3->Bycycle   ");                 
                    typeOfUnparkingVehicle=scan2.nextInt();//get the type of vehicle??                 
                    System.out.print("\n\t\t\tWhich Level...???   ");                 
                    unparkingLevel=scan2.nextInt();//get the value of parkinglevel??                 
                    System.out.print("\n\t\t\tWhich Palace...???    ");                 
                    unparkingPlace=scan2.nextInt();//get the value of which place want to unpark
                                     
                          //unpark process(set the value 0 to unpark Vehicle)
                         if( typeOfUnparkingVehicle==1 ) {//check to unpark the car                                      
                                   System.out.println("\n\t\t\tYour car was Unparked !!!!");         
                                   parkingLists.get( unparkingLevel ).car[ unparkingPlace ]=0;//unparked car(set value 0)
                         }                              
                         else if( typeOfUnparkingVehicle==2 ) {//check to unpark the bike                                  
                                   System.out.println("\n\t\t\tYour bike was Unparked !!!!");                                    
                                   parkingLists.get( unparkingLevel ).bike[ unparkingPlace ]=0;//unparked bike(set value 0)
                         }    
                         else if( typeOfUnparkingVehicle==3 ) {//check to unpark the bicycle              
                                   System.out.println("\n\t\t\tYour Bicycle was Unparked !!!");
                                   parkingLists.get( unparkingLevel ).bicycle[ unparkingPlace ]=0;//unparked bicycle(set value 0)
                         }  
                         else {        
                                   System.out.println("\n\t\t\t***Enter The Correct type of unparking vehicle**** \n ");  
                         } 
          }
}    

