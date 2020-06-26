import javax.swing.ImageIcon;
import java.util.Random;
import java.util.Scanner;
import java.awt.*;  
import javax.swing.*;
import java.awt.event.*;
class FrameClass implements ActionListener {
     
     int level=3;
     int size=0;
     int count=0;
     ImageIcon ima=new ImageIcon("bomb.png");
     ImageIcon ima1=new ImageIcon("flag1.png");
     JButton buttons[][];
     char tabel[][];
     JFrame frame;
     JLabel label;
     JButton submit,easy,normal,hard;
     JTextField text;
     public FrameClass() {      
          text=new JTextField();
          submit=new JButton("Submit"); 
          easy=new JButton("Easy");
          normal=new JButton("Normal");
          hard= new JButton("Hard");       
          frame=new JFrame("!!!***MineSweeper***!!!");
          label=new JLabel("Enter the Size: ");
          label.setBounds(320,10,200,40);
          submit.setBounds(478,17,100,25);
          text.setBounds(425,17,50,25);
          easy.setBounds(40,17,70,25);
          normal.setBounds(112,17,100,25);
          hard.setBounds(214,17,70,25);
          frame.setVisible(true);
          frame.setSize(600,600);
          frame.setLayout(null); 
          frame.add(text);
          frame.add(easy);
          frame.add(normal);
          frame.add(hard);
          frame.add(submit);      
          frame.add(label);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          submit.addActionListener(this);
          easy.addActionListener(this);
          normal.addActionListener(this);
          hard.addActionListener(this);
     }
     public void actionPerformed(ActionEvent e)  { 
         
          if(e.getSource()==submit) {
               size = Integer.parseInt(text.getText());
               if(!(buttons==null)) {
                ResetClass.reset(buttons,frame);
               }
                 
               frame.repaint();
               makeTabel();
               flage();
               
               
          }
          else if(e.getSource()==easy){
               level=4;
          }
          else if(e.getSource()==normal){
               level=3;
          }
          else if(e.getSource()==hard){
               level=2;
          }
          else {
               for(int i=0;i<size;i++) {
                    for(int j=0;j<size;j++) {
                         if(e.getSource()==buttons[i][j]) {
                              check(i,j);
                              result(); 
                              break;
                         }
                    }                   
               }              
          } 
         
          
     }
     
     
     void makeTabel() {
          int x=65;
          int y=65;
          int n = Integer.parseInt(text.getText());
                     buttons=new JButton[n][n];
                     for(int i=0;i<n;i++) {
                          for(int j=0;j<n;j++)  {
                               buttons[i][j]=new JButton("");
                               buttons[i][j].setBounds(x,y,50,50);
                                x=x+50;
                               frame.add(buttons[i][j]);
                               buttons[i][j].addActionListener(this);
                               
                          }
                          x=65;
                          y=y+50;
                               
                     }
             
                 bomb(n); 
                    
               
     }
    void flage() {
          
           for( int i=0;i<buttons.length;i++)
             {
             for( int j=0;j<buttons.length;j++)
                { 
                  buttons[i][j].addMouseListener(new MouseAdapter() {
                      public void mouseClicked(MouseEvent e) {
                          if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1) {
                                for (int i = 0; i < buttons.length; i++)
                                      {
                                         for (int j = 0; j < buttons.length; j++)
                                             {
                                                if (buttons[i][j] == e.getSource())
                                                      { 
                                                         if(buttons[i][j].getText().equals("B")){
                                                              buttons[i][j].setText("");
                                                         }else  {
                                                               buttons[i][j].setText("B");
                                                               result();
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
         
     
    void bomb(int n) {
         Random rand=new Random();
         tabel=new char[n][n];
         for(int i=0;i<(n*n)/level;i++){
              if(!(tabel[rand.nextInt(n)][rand.nextInt(n)]=='*')) {
                   tabel[rand.nextInt(n)][rand.nextInt(n)]='*';
              }
         }
         assignValue(tabel,n);
    }
    void assignValue(char board[][],int n) {
         char count=0;
              for(int i=0;i<n;i++) {
                   for(int j=0;j<n;j++) {
                        if(board[i][j]=='*')
                             continue;
                        else {  
                             if(i-1!=-1&&board[i-1][j]=='*') {
                                  count++; 
                             }
                             if(i-1!=-1&&j+1!=n&&board[i-1][j+1]=='*') {
                                  count++;
                             }
                             if(i-1!=-1&&j-1!=-1&&board[i-1][j-1]=='*') {
                                  count++;
                             } 
                             if(j-1!=-1&&board[i][j-1]=='*') {
                                  count++;
                             } 
                             if(j+1!=n&&board[i][j+1]=='*') {
                                  count++;
                             }  
                             if(i+1!=n&&j-1!=-1&&board[i+1][j-1]=='*') {
                                  count++;
                             } 
                             if(i+1!=n&&board[i+1][j]=='*') {
                                  count++;
                             } 
                             if(i+1!=n&&j+1!=n&&board[i+1][j+1]=='*') {
                                  count++;
                             }
                             board[i][j]=(char)(count+'0');
                             count=0;
                        }   
                   } 
              }
    }   
    void check(int i,int j) {
         if(tabel[i][j]=='*') {
              
              buttons[i][j].setIcon(ima);
              JOptionPane.showMessageDialog(frame," You Touched The Bomb");
              ShowingClass.show(tabel,buttons);
         }
         else if(buttons[i][j].getText().equals("")) {
              buttons[i][j].setText(Character.toString(tabel[i][j]));
                  if(i-1!=-1&&tabel[i-1][j]!='*') {
                       buttons[i-1][j].setText(Character.toString(tabel[i-1][j]));      
                  }
                  if(i-1!=-1&&j+1!=size&&tabel[i-1][j+1]!='*') {
                       buttons[i-1][j+1].setText(Character.toString(tabel[i-1][j+1]));
                  }
                  if(i-1!=-1&&j-1!=-1&&tabel[i-1][j-1]!='*') {
                       buttons[i-1][j-1].setText(Character.toString(tabel[i-1][j-1]));
                  } 
                  if(j-1!=-1&&tabel[i][j-1]!='*') {
                       buttons[i][j-1].setText(Character.toString(tabel[i][j-1]));            
                  } 
                  if(j+1!=size&&tabel[i][j+1]!='*') {
                       buttons[i][j+1].setText(Character.toString(tabel[i][j+1]));          
                  }  
                  if(i+1!=size&&j-1!=-1&&tabel[i+1][j-1]!='*') {
                       buttons[i+1][j-1].setText(Character.toString(tabel[i+1][j-1]));           
                  } 
                  if(i+1!=size&&tabel[i+1][j]!='*') {
                       buttons[i+1][j].setText(Character.toString(tabel[i+1][j]));           
                  } 
                  if(i+1!=size&&j+1!=size&&tabel[i+1][j]!='*') {
                       buttons[i+1][j].setText(Character.toString(tabel[i+1][j]));          
                  }
                             
                
         }
         
        
    } 
    void result() {
         int c=0,c1=0;
           for(int i=0;i<size;i++)
              {
                for(int j=0;j<size;j++)
                   {
                      if(tabel[i][j]=='*')
                         {
                             c++;
                            if(buttons[i][j].getText().equals("B"))
                               {
                                  c1++;
                               }
                         }
                   }
              }
            if(c==c1)
              {  
                  JOptionPane.showMessageDialog(frame,"You Won The Match");
              }  
    }   
       
}
//mainclass
class MineSweeperGame {
     public static void main(String[] argu) {
          new FrameClass();
     }
} 
class ResetClass {
     static void reset(JButton buttons[][],JFrame frame) {
          for(int i=0;i<buttons.length;i++) {
               for(int j=0;j<buttons.length;j++) {
                   frame.remove(buttons[i][j]);
               }
          }
     }
          
}
class ShowingClass {
     
     static void show(char tabel[][],JButton buttons[][]) {
           ImageIcon ima=new ImageIcon("bomb.png");
           for(int i=0;i<buttons.length;i++) {
                    for(int j=0;j<buttons.length;j++) {
                         if(tabel[i][j]=='*') {
                              buttons[i][j].setText(""); 
                              buttons[i][j].setIcon(ima);   
                         }
                         else {
                              buttons[i][j].setText(Character.toString(tabel[i][j]));
                         }
                         
                    }                   
               }      
           
     }
        
} 

