import java.awt.*;  
import javax.swing.*;
import java.awt.event.*;
class Tic_Tac_Toe_Game1 implements ActionListener
  { 
   String str="X";
    JFrame f;
    JLabel l;
    JButton b,b1,b2,b3,b4,b5,b6,b7,b8;
    Tic_Tac_Toe_Game1()
      {
       f=new JFrame("Tic Tac Toe Game");
       l=new JLabel("!!!***Tic Tac Toe Game***!!!");
       l.setBounds(50,20,200,40);
       f.setVisible(true);
       f.setSize(300,300);
       f.setLayout(null);
       l=new JLabel("!!!***Tic Tac Toe Game***!!!");
       l.setBounds(50,20,200,40);
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
              int fl=0,fl1=0;
             if(e.getSource()==b&&(b.getText().equals("")))
                          b.setText(str);    
             else if(e.getSource()==b1&&(b1.getText().equals("")))
                          b1.setText(str);
             else if(e.getSource()==b2&&(b2.getText().equals("")))
                          b2.setText(str);
             else if(e.getSource()==b3&&(b3.getText().equals("")))
                          b3.setText(str);
             else if(e.getSource()==b4&&(b4.getText().equals("")))
                          b4.setText(str);
             else if(e.getSource()==b5&&(b5.getText().equals("")))
                          b5.setText(str);
             else if(e.getSource()==b6&&(b6.getText().equals("")))
                          b6.setText(str);
             else if(e.getSource()==b7&&(b7.getText().equals("")))
                          b7.setText(str);
             else if(e.getSource()==b8&&(b8.getText().equals("")))
                          b8.setText(str);
             else
                  {
                     JOptionPane.showMessageDialog(f,"Already There"); fl=1;
                  }       
             if(fl==0)
                {
                   if(str.equals("X"))
                       str="O";
                   else
                       str="X";    
                }   
          
             if(b.getText().equals(b1.getText())&&b1.getText().equals(b2.getText())&&!(b.getText().equals(""))){
                    JOptionPane.showMessageDialog(f,b.getText()+" PLAYER WON !!!!!");fl1=1;}
             else if(b3.getText().equals(b4.getText())&&b4.getText().equals(b5.getText())&&!(b3.getText().equals(""))){
                    JOptionPane.showMessageDialog(f,b3.getText()+" PLAYER WON !!!!!");fl1=1;}
             else if(b6.getText().equals(b7.getText())&&b7.getText().equals(b8.getText())&&!(b6.getText().equals(""))){
                    JOptionPane.showMessageDialog(f,b6.getText()+" PLAYER WON !!!!!");fl1=1;}
             else if(b.getText().equals(b3.getText())&&b3.getText().equals(b6.getText())&&!(b.getText().equals(""))){
                    JOptionPane.showMessageDialog(f,b.getText()+" PLAYER WON !!!!!");fl1=1;}
             else if(b1.getText().equals(b4.getText())&&b4.getText().equals(b7.getText())&&!(b1.getText().equals(""))){
                    JOptionPane.showMessageDialog(f,b1.getText()+" PLAYER WON !!!!!");fl1=1;}
             else if(b2.getText().equals(b5.getText())&&b5.getText().equals(b8.getText())&&!(b2.getText().equals(""))){
                    JOptionPane.showMessageDialog(f,b2.getText()+" PLAYER WON !!!!!"); fl1=1;}
             else if(b2.getText().equals(b4.getText())&&b4.getText().equals(b6.getText())&&!(b2.getText().equals(""))){
                    JOptionPane.showMessageDialog(f,b2.getText()+" PLAYER WON !!!!!");fl1=1;}
             else if(b.getText().equals(b4.getText())&&b4.getText().equals(b8.getText())&&!(b.getText().equals(""))){
                    JOptionPane.showMessageDialog(f,b.getText()+" PLAYER WON !!!!!"); fl1=1;}                                 
             
            if((!b.getText().equals(""))&&(!b1.getText().equals(""))&&(!b2.getText().equals(""))&&(!b3.getText().equals(""))&&(!b4.getText().equals(""))&&(!b5.getText().equals(""))&&(!b6.getText().equals(""))&&(!b7.getText().equals(""))&&(!b8.getText().equals(""))&&fl1!=1)
              { 
                 JOptionPane.showMessageDialog(f,"MATCH WAS TIED !!!!!");
              } 
             
      }
  public static void main(String[] kathir) 
    {
      new Tic_Tac_Toe_Game1();
    }   
  }
   
