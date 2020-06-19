import java.util.ArrayList;
import java.util.Scanner;
class ParkingSystem // main class
     {
            //storing the parking levels in ArrayList
            public static ArrayList<MultiLevelParkingSystem> parkingList = new ArrayList<MultiLevelParkingSystem>();
            //main function         
            public static void main( String[] argu )
               {  
               
                  Scanner scan=new Scanner(System.in);
                  
                  int getChoice;
                  char continueOrExit='y'; 
                               
                  System.out.print("\t\t\t ***Wellcome To Multi Level Parking System***\n\n");
                       
                       parkingList.add(new MultiLevelParkingSystem());  //created initial level 0 
                       DisplayClass.display(parkingList);//display the parking lists
                      
                       while(continueOrExit=='y')
                          {    
                           
                                System.out.print("\n\t\t\t---->Enter Your Choice????\n\n"); 
                                System.out.print("     \t\t\t  1->PARKING\n     \t\t\t  2->UNPARKING   ");
                                
                                getChoice=scan.nextInt();
                                
                                //parking process
                                if(getChoice==1)
                                    {
                                         ParkingProcessClass.parkingProcess(parkingList);//call the parking process functon 
                               
                                         DisplayClass.display(parkingList);//call the display function 
                                    }
                                 //unparking process   
                               else if(getChoice==2)
                                    {
                               
                                        UnparkingProcessClass.unparkingProcess(parkingList);//call the unparking process function
                             
                                        DisplayClass.display(parkingList);//call the display function
                                    } 
                               else
                                    {
                                        System.out.println("\n\t\t\tEnter the correct choice....");
                                     
                                        continue;
                                    }
                           System.out.print("\n\t\t\tDO You Want To Continue Again Press y Else n :");
                              
                           continueOrExit=scan.next().charAt(0);// get the value of again continue or break the process(y=>continue or n=>break)
                          } 
               }
     } 
   
//class of multilevel parking system
class MultiLevelParkingSystem
    {
    
       int car[]=new int[10];
       int bike[]=new int[10];
       int bicycle[]=new int[10];
       
    }
//class of display function
class DisplayClass
    {
      
       static void display( ArrayList<MultiLevelParkingSystem> parkingList ) //display function
                {
                  
                  for(int i=0;i<parkingList.size();i++)
                     {  
                       
                        System.out.println("\t\t\t     ------->level :"+i+"<-------");
                        System.out.println("\t\t\t cars       bikes       bicycles\n");
                        
                        //display process(0=>empty and 1=>parked)
                        
                        for(int j=0;j<10;j++)
                             {
                              
                                   if(parkingList.get(i).car[j]==1) //check the value 0 or 1 in the car Array
                                        {
                                          System.out.print("\t\t\t parked");
                                        }  
                                   else
                                        {                                   
                                          System.out.print("\t\t\t empty");
                                        }
                                   if(parkingList.get(i).bike[j]==1)//check the value 0 or 1 in the bike Array
                                        {    
                                          System.out.print("      parked");
                                        }
                                   else
                                        {                                   
                                          System.out.print("      empty");
                                        }
                                   if(parkingList.get(i).bicycle[j]==1)//check the value 0 or 1 in the Bicycle Array
                                        { 
                                          System.out.println("       parked");
                                        }
                                   else
                                        {
                                          System.out.println("       empty");      
                                        }
                                 
                            }
                     }
                }                    
    }    
   //class of parking process function     
class ParkingProcessClass
    {
        
      static void parkingProcess( ArrayList<MultiLevelParkingSystem> parkingList )//parking function
                {
                
                   int typeOfVehicle=0,flage=0,checkToParking[];
                   Scanner scan1=new Scanner(System.in);
                    
                   System.out.print("\n\t\t\tWhich Type Of Vehicle Do You Want to Parking...???   \n");
                   System.out.print("\t\t\t  1->Car\n\t\t\t  2->Bike\n\t\t\t  3->Bycycle   ");
                   
                   typeOfVehicle=scan1.nextInt();//get the Vehicle type
                   
                    while(flage==0)
                       {
                       
                       //parking process(set the value 1 to parking Vehicle)
                       
                      for(int i=0;i<parkingList.size();i++) 
                           {
                            
                                if(typeOfVehicle==1) //car 
                                
                                     checkToParking=parkingList.get(i).car;//get the car array for parking
                                    
                                else if(typeOfVehicle==2)//bike 
                                 
                                     checkToParking=parkingList.get(i).bike;//get the bike array for parking
                                     
                                else //bicycle
                                                                                           
                                     checkToParking=parkingList.get(i).bicycle;//get the bicycle array for parking
                                
                                for(int j=0;j<10;j++) //finding the parking place
                                   {
                                
                                      if(checkToParking[j]==0)//finding the empty place to parking
                                         {
                                    
                                            checkToParking[j]=1;//parking value set 1
                                            System.out.println("\n\t\t\t------>Your Vehicle is Parked !!!!");
                                            flage=1;
                                        
                                            break;
                                         }
                                   
                                   }    
                                   
                                if(flage==1)//exit the loop when Vehicle parked!
                                 
                                         break; 
                            }
                            
                      if(flage==0)//when can not finding the empty place  create the next parkinglevel
                           {
                           
                             System.out.println("\n\t\t\t------>Your  Vehicle Move To next level To parking   Level :"+(parkingList.size()));
                             parkingList.add(new MultiLevelParkingSystem());//create the level of parking and adding the parkingList(ArrayList)
                        
                           }   
                      } 
               }
    }    
//class of unparking process
class UnparkingProcessClass
    {
      
      static void unparkingProcess( ArrayList<MultiLevelParkingSystem> parkingList)//unparking function
             { 
             
                 Scanner scan2=new Scanner(System.in);
                 
                 int typeOfUnparkingVehicle=0,unparkingLevel=0,unparkingPlace=0;
                 
                 System.out.print("\n\t\t\tWhich Type OF Vehicle Do You Want to UnParking...???   \n ");
                 System.out.print("\n\t\t\t  1->Car\n\t\t\t  2->Bike\n\t\t\t  3->Bycycle   ");
                 
                 typeOfUnparkingVehicle=scan2.nextInt();//get the type of vehicle??
                 
                 System.out.print("\n\t\t\tWhich Level...???   ");
                 
                 unparkingLevel=scan2.nextInt();//get the value of parkinglevel??
                 
                 System.out.print("\n\t\t\tWhich Palace...???    ");
                 
                 unparkingPlace=scan2.nextInt();//get the value of which place want to unparking
                 
                              //unparking process(set the value 0 to unparking Vehicle)
                              
                              if(typeOfUnparkingVehicle==1) //check to unparking the car
                                { 
                                    System.out.println("\n\t\t\tYour car was Unparked !!!!");
                                    parkingList.get(unparkingLevel).car[unparkingPlace]=0;//unparking car(set value 0)
                                }
                              else if(typeOfUnparkingVehicle==2)//check to unparking the bike  
                                {   
                                    System.out.println("\n\t\t\tYour bike was Unparked !!!!");
                                    parkingList.get(unparkingLevel).bike[unparkingPlace]=0;//unparking bike(set value 0)
                                }
                              else if(typeOfUnparkingVehicle==3)//check to unparking the bicycle
                                { 
                                    System.out.println("\n\t\t\tYour Bicycle was Unparked !!!");
                                    parkingList.get(unparkingLevel).bicycle[unparkingPlace]=0;//unparking bicycle(set value 0)
                                }  
                              else                             
                                {
                                  System.out.println("\n\t\t\t***Enter The Correct type_of_unparking_vehicle**** \n "); 
                                }  
                       
                 
             }
    }    

