import javax.swing.ImageIcon;
import java.util.Random;
import java.util.Scanner;
import java.awt.*;  
import javax.swing.*;
import java.awt.event.*;
//Frameclass 
class FrameClass implements ActionListener {
     TimerClass timer= new TimerClass();//using the time counter
     int level=3;
     int size=0;
     ImageIcon ima=new ImageIcon("bomb.png");//bomb image
     JButton buttons[][]; 
     char board[][];
     JFrame frame;
     JLabel label,label1,label2;
     JButton submit,easy,normal,hard;
     JTextField text;
     //Timer timer;
     public FrameClass() {      
          text=new JTextField();
          submit=new JButton("Submit");//Submit button
          easy=new JButton("Easy");//easy mode button
          normal=new JButton("Normal");//normal mode button
          hard= new JButton("Hard"); //hard mode button      
          frame=new JFrame("!!!***MineSweeper***!!!");
          label=new JLabel("Enter the Size: ");
          label1=new JLabel("Time: ");
          label2=new JLabel("");
          label.setBounds(310,10,200,40);
          label1.setBounds(590,10,80,40);
          label2.setBounds(635,10,80,40);
          submit.setBounds(478,17,90,25);
          text.setBounds(425,17,50,25);
          easy.setBounds(40,17,70,25);
          normal.setBounds(112,17,100,25);
          hard.setBounds(214,17,70,25);
          frame.setVisible(true);
          frame.setSize(700,600);
          frame.setLayout(null); 
          frame.add(text);
          frame.add(easy);
          frame.add(normal);
          frame.add(hard);
          frame.add(submit);      
          frame.add(label);
          frame.add(label1);
          frame.add(label2);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          submit.addActionListener(this);
          easy.addActionListener(this);
          normal.addActionListener(this);
          hard.addActionListener(this);
     }
     public void actionPerformed(ActionEvent e)  { //given the definition of actionPerformed function 
         
          if(e.getSource()==submit) { 
               size = Integer.parseInt(text.getText());
               //reset the game
               if(!(buttons==null)) { 
                ResetClass.reset(buttons,frame);//reset the game
               }
                
               frame.repaint();//refreshing the game
               makeBoard();//creating the MineSweeper board
               timer.setTime(label2);//start the time counter
               addRightMouseButton();
               
               
          }
          else if(e.getSource()==easy){//easy mode
               level=4;
          }
          else if(e.getSource()==normal){//normal mode
               level=3;
          }
          else if(e.getSource()==hard){//hard mode
               level=2;
          }
          else {
               //finding the which button clicked
               for(int i=0;i<size;i++) {
               
                    for(int j=0;j<size;j++) {
                         if(e.getSource()==buttons[i][j]) {
                              find(i,j);
                              findResult(); 
                              break;
                         }
                    }                   
               }              
          } 
         
          
     }
     
     //minesweeper board making process
     void makeBoard() { 
          int axisX=65;
          int axisY=65;
          buttons=new JButton[size][size];
          
               for(int i=0;i<size;i++) {
               
                    for(int j=0;j<size;j++)  {
                         buttons[i][j]=new JButton("");
                         buttons[i][j].setBounds(axisX,axisY,50,50);
                         axisX=axisX+50;
                         frame.add(buttons[i][j]);
                         buttons[i][j].addActionListener(this);
                               
                    }
                    axisX=65;
                    axisY=axisY+50;
                               
               }
             
               setBomb(); 
                    
               
     }
     //when RightMouseButton click set the flag(F) in the button
     void addRightMouseButton() {
          
          for( int i=0;i<buttons.length;i++) {
          
               for( int j=0;j<buttons.length;j++) { 
                    buttons[i][j].addMouseListener(new MouseAdapter() {  //using abstract MouseAdapter class 
                         public void mouseClicked(MouseEvent e) {//given the definition of mouseClicked function
                              if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1) {
                              
                                   for (int i = 0; i < buttons.length; i++) {
                                   
                                        for (int j = 0; j < buttons.length; j++) {
                                             if (buttons[i][j] == e.getSource()) { 
                                                 if(buttons[i][j].getText().equals("F")){
                                                       buttons[i][j].setText("");
                                                  }else  {
                                                               buttons[i][j].setText("F");
                                                               findResult();//when  set the flag(F) finding the game result 
                                                  }  
                                                            
                                             }
                                        }
                                   }    
                              }
                         }
                    });
               }
          }     
     }
         
     //set the bombs randomly in the minesweeper board
     void setBomb() {
          Random rand=new Random();
          board=new char[size][size];
          
          for(int i=0;i<(size*size)/level;i++) {
               if(!(board[rand.nextInt(size)][rand.nextInt(size)]=='*')) {
                    board[rand.nextInt(size)][rand.nextInt(size)]='*';
               }
          }
          assignValue();
    }
    //setting  the values according to the bombs
    // \ *\ *\ 1\  
    // \ 2\ 3\ 2\   
    // \ 1\ 3\ *\  
    // \ *\ 3\ *\   
    void assignValue() {
         char count=0;
         
              for(int i=0;i<size;i++) {
              
                   for(int j=0;j<size;j++) {
                        if(board[i][j]=='*') continue;
                        else {                                                         
                             if(i-1!=-1&&board[i-1][j]=='*') {
                                  count++;                                             
                             }                                                         
                             if(i-1!=-1&&j+1!=size&&board[i-1][j+1]=='*') {    
                                  count++;
                             }
                             if(i-1!=-1&&j-1!=-1&&board[i-1][j-1]=='*') {
                                  count++;
                             } 
                             if(j-1!=-1&&board[i][j-1]=='*') {
                                  count++;
                             } 
                             if(j+1!=size&&board[i][j+1]=='*') {
                                  count++;
                             }  
                             if(i+1!=size&&j-1!=-1&&board[i+1][j-1]=='*') {
                                  count++;
                             } 
                             if(i+1!=size&&board[i+1][j]=='*') {
                                  count++;
                             } 
                             if(i+1!=size&&j+1!=size&&board[i+1][j+1]=='*') {
                                  count++;
                             }
                             board[i][j]=(char)(count+'0');
                             count=0;
                        }   
                   } 
              }
    }  
     //This functon find your clicked button  bomb or not
    void find(int i,int j) {
         //when your clicked the bomb button  
         if(board[i][j]=='*') {
              buttons[i][j].setIcon(ima);
              timer.stop();//stop the time counter
              JOptionPane.showMessageDialog(frame," You Touched The Bomb");
              Bombs.show(board,buttons);//showing the all bombs
         }
         //when your clicked the without bomb buttons
         //open the nearest box(wihtout bomb box) 
         else if(buttons[i][j].getText().equals("")) {
              buttons[i][j].setText(Character.toString(board[i][j]));
              if(i-1!=-1&&board[i-1][j]!='*') {
                   buttons[i-1][j].setText(Character.toString(board[i-1][j]));      
              }
              if(i-1!=-1&&j+1!=size&&board[i-1][j+1]!='*') {
                   buttons[i-1][j+1].setText(Character.toString(board[i-1][j+1]));
              }
              if(i-1!=-1&&j-1!=-1&&board[i-1][j-1]!='*') {
                   buttons[i-1][j-1].setText(Character.toString(board[i-1][j-1]));
              } 
              if(j-1!=-1&&board[i][j-1]!='*') {
                   buttons[i][j-1].setText(Character.toString(board[i][j-1]));            
              } 
              if(j+1!=size&&board[i][j+1]!='*') {
                   buttons[i][j+1].setText(Character.toString(board[i][j+1]));          
              }  
              if(i+1!=size&&j-1!=-1&&board[i+1][j-1]!='*') {
                   buttons[i+1][j-1].setText(Character.toString(board[i+1][j-1]));           
              } 
              if(i+1!=size&&board[i+1][j]!='*') {
                   buttons[i+1][j].setText(Character.toString(board[i+1][j]));           
              } 
              if(i+1!=size&&j+1!=size&&board[i+1][j]!='*') {
                   buttons[i+1][j].setText(Character.toString(board[i+1][j]));          
              }
                             
                
         }
         
        
    } 
     //finding the game result
    void findResult() {
         int count=0,count1=0;
         
         for(int i=0;i<size;i++)  {
         
              for(int j=0;j<size;j++) {
                   if(board[i][j]=='*') {
                        count++;
                        if(buttons[i][j].getText().equals("F")) {
                                  count1++;
                        }
                   }
              }
         }
         if(count==count1)  { 
              timer.stop();//stop the time counter 
              JOptionPane.showMessageDialog(frame,"You Won The Match");
         }  
    }   
       
}
//mainclass
class MineSweeperGame {
     //invoking the game
     public static void main(String[] argu) {
          new FrameClass();
     }
} 
//reset class
class ResetClass {
     static void reset(JButton buttons[][],JFrame frame) {//remove the board
          //remove the each  buttons
          for(int i=0;i<buttons.length;i++) {
                 
               for(int j=0;j<buttons.length;j++) {
                   frame.remove(buttons[i][j]);
               }
          }
     }
          
}
class Bombs {
     //finally show the all bombs in minesweeper board
     static void show(char board[][],JButton buttons[][]) {
          ImageIcon ima=new ImageIcon("bomb.png");
          
               for(int i=0;i<buttons.length;i++) {
               
                    for(int j=0;j<buttons.length;j++) {
                         if(board[i][j]=='*') {
                              buttons[i][j].setText(""); 
                              buttons[i][j].setIcon(ima);   
                         }
                         else {
                              buttons[i][j].setText(Character.toString(board[i][j]));
                         }
                         
                    }                   
               }      
           
     }
        
} 
//timer class
class TimerClass {
     int count=0;
     Timer timer;
     void setTime(JLabel label) {
          count=0;
          timer = new Timer(500, new ActionListener() {
          public void actionPerformed(ActionEvent e) {
               count++;
                if (true) {
                     label.setText(Integer.toString(count));
                } 
          }   
          });
          timer.setInitialDelay(0);
          timer.start();
     }
     void stop() {
         timer.stop();
     }

}

