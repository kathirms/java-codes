import java.util.ArrayList;
import java.util.Scanner;
class Parking_System // main class
      {
            //storing the parking levels in ArrayList
            public static ArrayList<Multi_Level_Parking> level_of_parking = new ArrayList<Multi_Level_Parking>();
          
            public static void main( String[] argu )
               {  
                  Scanner scan=new Scanner(System.in);
                  int getchoice;
                  char continueorexit='y'; 
                               
                  System.out.print("\t\t\t ***Wellcome To Multi Level Parking System***\n\n");
                       
                       level_of_parking.add(new Multi_Level_Parking());  //created initial level 0 
                       Parking_List.display(level_of_parking);//display the parking lists
                       
                       while(continueorexit=='y')
                          {    
                           
                                System.out.print("\n\t\t\t---->Enter Your Choice????\n\n"); 
                                System.out.print("     \t\t\t  1->PARKING\n     \t\t\t  2->UNPARKING   ");
                                
                                getchoice=scan.nextInt();
                      
                                if(getchoice==1)//parking process
                                    {
                                        Parking_Process.parking_process(level_of_parking);//call the parking process functon 
                               
                                        Parking_List.display(level_of_parking);//display the parking lists 
                                    }
                               else if(getchoice==2)//unparking process
                                   {
                               
                                       Unparking_process.unparking_Process(level_of_parking);//call the unparking process function
                             
                                       Parking_List.display(level_of_parking);//display the parking lists
                                   } 
                               else
                                  {
                                     System.out.println("\n\t\t\tEnter the correct choice....");// Again continue or break the process
                                     
                                     continue;
                                  }
                           System.out.print("\n\t\t\tDO You Want To Continue Again Press y Else n :");
                              
                           continueorexit=scan.next().charAt(0);// get the value of again continue or not 
                        } 
            }
     } 
   
//class of parking system
class Multi_Level_Parking
    {
      int car[]=new int[10];
      int bike[]=new int[10];
      int bicycle[]=new int[10];
    }
//class of parking lists display function
class Parking_List
    {
       static void display( ArrayList<Multi_Level_Parking> level_of_parking ) //display function
                {
                  
                  for(int i=0;i<level_of_parking.size();i++)
                     {  
                       
                        System.out.println("\t\t\t     ------->level :"+i+"<-------");
                        System.out.println("\t\t\t cars       bikes       bicycles\n");
                        for(int j=0;j<10;j++)//display process
                             {
                                   if(level_of_parking.get(i).car[j]==1) //check the value 0 or 1
                                        System.out.print("\t\t\t parked");
                                   else
                                        System.out.print("\t\t\t empty");
                                   if(level_of_parking.get(i).bike[j]==1)//check the value 0 or 1
                                        System.out.print("      parked");
                                   else
                                        System.out.print("      empty");
                                   if(level_of_parking.get(i).bicycle[j]==1)//check the value 0 or 1
                                        System.out.println("       parked");
                                   else
                                        System.out.println("       empty");      
                                    
                                 
                            }
                     }
                }                    
    }    
   //class of parking process function     
class Parking_Process
    {
        
      static void parking_process( ArrayList<Multi_Level_Parking> level_of_parking )//parking function
                {
                   int typeofvehicle=0,flage=0,checktopark[];
                   Scanner scan1=new Scanner(System.in);
                    
                   System.out.print("\n\t\t\tWhich Type Of Vehicle Do You Want to Parking...???   \n");
                   System.out.print("\t\t\t  1->Car\n\t\t\t  2->Bike\n\t\t\t  3->Bycycle   ");
                   
                   typeofvehicle=scan1.nextInt();//get the Vehicle type
                   
                    while(flage==0)
                       {

                      for(int i=0;i<level_of_parking.size();i++) //parking process
                           {
                   
                                if(typeofvehicle==1) //check the which type of Vehicle(car)
                                     checktopark=level_of_parking.get(i).car;
                                    
                                else if(typeofvehicle==2)//check the which type of Vehicle(bike)  
                                     checktopark=level_of_parking.get(i).bike;
                                     
                                else                                                            
                                     checktopark=level_of_parking.get(i).bicycle;//bicycle
                                
                             for(int j=0;j<10;j++) //finding the parking place
                                {
                              
                                   if(checktopark[j]==0)
                                       {
                                    
                                        checktopark[j]=1;//parking value set 1
                                        System.out.println("\n\t\t\t------>Your Vehicle is Parked !!!!");
                                        flage=1;
                                        
                                        break;
                                       }
                                   
                                }    
                                if(flage==1)//exit the loop when it parked 
                                   break; 
                            }
                            
                        if(flage==0)//this flage used to create the multi level parking and exit the loop
                           {
                            System.out.println("\n\t\t\t------>Your  Vehicle Move To next level To parking   Level :"+(level_of_parking.size()));
                            level_of_parking.add(new Multi_Level_Parking());//create the level of parking
                        
                           }   
                      } 
               }
    }    
//class of unparking process
class Unparking_process
    {
      static void unparking_Process( ArrayList<Multi_Level_Parking> level_of_parking)//unparking function
             {
                 Scanner scan2=new Scanner(System.in);
                 int type_of_unpark_vehicle=0,unparklevel=0,which_place=0;
                 
                 System.out.print("\n\t\t\tWhich Type OF Vehicle Do You Want to UnParking...???   \n ");
                 System.out.print("\n\t\t\t  1->Car\n\t\t\t  2->Bike\n\t\t\t  3->Bycycle   ");
                 
                 type_of_unpark_vehicle=scan2.nextInt();//get the type of vehicle??
                 
                 System.out.print("\n\t\t\tWhich Level...???   ");
                 
                 unparklevel=scan2.nextInt();//get the value of level??
                 
                 System.out.print("\n\t\t\tWhich Palace...???    ");
                 
                 which_place=scan2.nextInt();//get the value of which_place do you want to unpark??
                   
                    if(type_of_unpark_vehicle==1) //check to unpark the car
                                { 
                                    System.out.println("\n\t\t\tYour car was Unparked !!!!");
                                    level_of_parking.get(unparklevel).car[which_place]=0;
                                }
                              else if(type_of_unpark_vehicle==2)//check to unpark the bike  
                                {   
                                    System.out.println("\n\t\t\tYour bike was Unparked !!!!");
                                    level_of_parking.get(unparklevel).bike[which_place]=0;
                                }
                              else if(type_of_unpark_vehicle==3)//check to unpark the bicycle
                                { 
                                    System.out.println("\n\t\t\tYour Bicycle was Unparked !!!");
                                    level_of_parking.get(unparklevel).bicycle[which_place]=0;
                                }  
                              else
                                {
                                  System.out.println("\n\t\t\t***Enter The Correct type_of_unpark_vehicle**** \n ");
                                }  
                       
                 
             }
    }    
