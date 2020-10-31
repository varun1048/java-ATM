package atm;

import atm.*;
import java.awt.*;
import java.awt.event.*;

public class Interface extends Frame {
    Button btn ;
    TextField text1 , text2;
    Label label1, label2;
    
    Process process = new Process();


    Interface(){
        setTitle("ATM");
        setSize(500,400);
        setLayout(null);
        setVisible(true);
        page1();
    }

    void page1(){


        label1 = new Label("Account Number:");
        label2 = new Label("Pin Number:");
        text1 = new TextField();
        text2 = new TextField();
        btn = new Button("Enter");

        label1.setBounds(75,100,100,50);    text1.setBounds(180,117,100,20);
        label2.setBounds(75,170,100,50);    text2.setBounds(180,187,100,20);
        btn.setBounds(175,230,50,20);    

        add(label1); add(text1);
        add(label2); add(text2);
        add(btn);

        btn.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){                 
                if( process.fiend(Integer.parseInt(text1.getText()),Integer.parseInt(text2.getText())) == true){
                    
                    remove(label1); 
                    remove(label2);
                    remove(text1);
                    remove(text2);
                    remove(btn);
                    page2(process.name());         
                }    

                else{
                    text1.setText("");
                    text2.setText("");
                }
            }  
        });  
    }
    void page2(String name){


        label1 = new Label("User:"+name);

        btn = new Button("Enter");

        label1.setBounds(75,100,100,50);    
        btn.setBounds(175,230,50,20);    

        add(label1);         
        add(btn);

        btn.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){                  

                remove(label1); 
                remove(btn);
            }  
        });  
    }

    public static void main(String args[]){
        new  Interface();
    }
}