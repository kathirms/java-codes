import java.awt.*;  
import javax.swing.*;
import java.awt.event.*;
class Tic_Tac_Toe_Game implements ActionListener
  { 
    int p=0,t=0,t1=0,t2=0,t3=0;
   static char str[][]=new char[4][4];
    JFrame f;
    JLabel l;
    JButton b,b1,b2,b3,b4,b5,b6,b7,b8;
    Tic_Tac_Toe_Game()
      {
       f=new JFrame("Tic Tac Toe Game");
       l=new JLabel("!!!***Tic Tac Toe Game***!!!");
       l.setBounds(50,20,200,40);
       f.setVisible(true);
       f.setSize(300,300);
       f.setLayout(null);
       f.add(l);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       b=new JButton("");
       b.setBounds(65,65,50,50);
       f.add(b);
       b1=new JButton("");
       b1.setBounds(115,65,50,50);
       f.add(b1);
       b2=new JButton("");
       b2.setBounds(165,65,50,50);
       f.add(b2);
       b3=new JButton("");
       b3.setBounds(65,115,50,50);
       f.add(b3);
       b4=new JButton("");
       b4.setBounds(115,115,50,50);
       f.add(b4);
       b5=new JButton("");
       b5.setBounds(165,115,50,50);
       f.add(b5);
       b6=new JButton("");
       b6.setBounds(65,165,50,50);
       f.add(b6);
       b7=new JButton("");
       b7.setBounds(115,165,50,50);
       f.add(b7);
       b8=new JButton("");
       b8.setBounds(165,165,50,50);
       f.add(b8);
       b.addActionListener(this);
        b1.addActionListener(this);
         b2.addActionListener(this);  
          b3.addActionListener(this);  
           b4.addActionListener(this);  
            b5.addActionListener(this);  
             b6.addActionListener(this);  
              b7.addActionListener(this);  
               b8.addActionListener(this);  
                   
       }
         public void actionPerformed(ActionEvent e) 
           {
              int fl=0;
            if(e.getSource()==b&&(b.getText().equals("")))
              { 
                if(p==0)
                  {
                    b.setText("X");
                    str[0][0]='X';
                    p=1;
                  }
                else
                  {
                   b.setText("O");
                    str[0][0]='O';
                    p=0; 
                  }  
              }
            else if(e.getSource()==b1&&(b1.getText().equals("")))
              { 
                if(p==0)
                  {
                    b1.setText("X");
                    str[0][1]='X';
                    p=1;
                  }
                else
                  {
                   b1.setText("O");
                    str[0][1]='O';
                    p=0; 
                  }        
          
             }
            else if(e.getSource()==b2&&(b2.getText().equals("")))
              { 
                if(p==0)
                  {
                    b2.setText("X");
                    str[0][2]='X';
                    p=1;
                  }
                else
                  {
                   b2.setText("O");
                    str[0][2]='O';
                    p=0; 
                  }        
          
             }
           else if(e.getSource()==b3&&(b3.getText().equals("")))
              { 
                if(p==0)
                  {
                    b3.setText("X");
                    str[1][0]='X';
                    p=1;
                  }
                else
                  {
                   b3.setText("O");
                    str[1][0]='O';
                    p=0; 
                  }        
          
             } 
           else if(e.getSource()==b4&&(b4.getText().equals("")))
              { 
                if(p==0)
                  {
                    b4.setText("X");
                    str[1][1]='X';
                    p=1;
                  }
                else
                  {
                   b4.setText("O");
                    str[1][1]='O';
                    p=0; 
                  }        
          
             }
           else if(e.getSource()==b5&&(b5.getText().equals("")))
              { 
                if(p==0)
                  {
                    b5.setText("X");
                    str[1][2]='X';
                    p=1;
                  }
                else
                  {
                   b5.setText("O");
                    str[1][2]='O';
                    p=0; 
                  }        
          
             } 
           else if(e.getSource()==b6&&(b6.getText().equals("")))
              { 
                if(p==0)
                  {
                    b6.setText("X");
                    str[2][0]='X';
                    p=1;
                  }
                else
                  {
                   b6.setText("O");
                    str[2][0]='O';
                    p=0; 
                  }        
          
             }
           else if(e.getSource()==b7&&(b7.getText().equals("")))
              { 
                if(p==0)
                  {
                    b7.setText("X");
                    str[2][1]='X';
                    p=1;
                  }
                else
                  {
                   b7.setText("O");
                    str[2][1]='O';
                    p=0; 
                  }        
          
             }
           else if(e.getSource()==b8&&(b8.getText().equals("")))
              { 
                if(p==0)
                  {
                    b8.setText("X");
                    str[2][2]='X';
                    p=1;
                  }
                else
                  {
                   b8.setText("O");
                    str[2][2]='O';
                    p=0; 
                  }        
          
             }          
          else
             JOptionPane.showMessageDialog(f,"Already There"); 
              
             for(int i=0;i<3;i++)
             { 
                int j;
               for(  j=0;j<3;j++)
                 {
                   if(str[i][j]==str[i][j+1]&&str[i][j]!='\0')
                       t++;
                   if(str[j][i]==str[j+1][i]&&str[j][i]!='\0')
                       t1++;
                   if(str[j][j]==str[j+1][j+1]&&str[j][j]!='\0')
                       t2++;   
                }
                if(t==2){
                    JOptionPane.showMessageDialog(f,str[i][j-1]+" PLAYER WON !!!!!");fl=1;}
                if(t1==2){
                    JOptionPane.showMessageDialog(f,str[j-1][i]+" PLAYER WON !!!!!");fl=1;}
                if(t2==2){ 
                    JOptionPane.showMessageDialog(f,str[j-1][j-1]+" PLAYER WON !!!!!");fl=1;}
                if(str[0][2]==str[1][1]&&str[1][1]==str[2][0]&&str[0][2]!='\0'){
                   JOptionPane.showMessageDialog(f,str[0][2]+" PLAYER WON !!!!!");fl=1;}
                t=0;t1=0;t2=0;t3=0;
             }
            if((!b.getText().equals(""))&&(!b1.getText().equals(""))&&(!b2.getText().equals(""))&&(!b3.getText().equals(""))&&(!b4.getText().equals(""))&&(!b5.getText().equals(""))&&(!b6.getText().equals(""))&&(!b6.getText().equals(""))&&(!b8.getText().equals(""))&&fl!=1)
              { 
                 JOptionPane.showMessageDialog(f,"MATCH WAS TIED !!!!!");
              } 
              
           
      }
  public static void main(String[] kathir) 
    {
      new Tic_Tac_Toe_Game();
    }   
  }
   
