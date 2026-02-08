import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{


     Boolean IsOperatorClicked=false;

     String oldValue;
     String operator="";

     JFrame jf;

     JLabel displaylabel;
     JButton seveButton;
     JButton eightButton;
     JButton nineButton;
     JButton fourButton;
     JButton fiveButton;
     JButton sixButton;
     JButton oneButton;
     JButton twoButton;
     JButton threeButton;
     JButton dotButton;
     JButton zeroButton;
     JButton equalButton;
     JButton divButton;
     JButton multButton;
     JButton subButton;
     JButton addButton;
     JButton clearButton;

    public Calculator(){
        jf=new JFrame("CALCULATOR");
        jf.setSize(450, 650);
        jf.getContentPane().setBackground(Color.black);
        jf.setLayout(null);
        jf.setLocation(450, 100);

        displaylabel=new JLabel();
        displaylabel.setBounds(20, 20, 400, 60);
        displaylabel.setFont(new Font("Serif", Font.PLAIN, 50));
        displaylabel.setBackground(Color.WHITE);
        displaylabel.setForeground(Color.BLACK);
        displaylabel.setOpaque(true);
        displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(displaylabel);

        seveButton=new JButton("7");
        seveButton.setBounds(30, 100, 80, 80);
        seveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        seveButton.setBackground(Color.RED);
        seveButton.addActionListener(this);
        jf.add(seveButton);

        eightButton=new JButton("8");
        eightButton.setBounds(130, 100, 80, 80);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton=new JButton("9");
        nineButton.setBounds(230, 100, 80, 80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        
        fourButton=new JButton("4");
        fourButton.setBounds(30, 200, 80, 80);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton=new JButton("5");
        fiveButton.setBounds(130, 200, 80, 80);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fiveButton.setBackground(Color.RED);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton=new JButton("6");
        sixButton.setBounds(230, 200, 80, 80);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sixButton.setBackground(Color.RED);
        sixButton.addActionListener(this);
        jf.add(sixButton);

        oneButton=new JButton("1");
        oneButton.setBounds(30, 300, 80, 80);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton=new JButton("2");
        twoButton.setBounds(130, 300, 80, 80);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        twoButton.setBackground(Color.RED);
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton=new JButton("3");
        threeButton.setBounds(230, 300, 80, 80);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        threeButton.setBackground(Color.RED);
        threeButton.addActionListener(this);
        jf.add(threeButton);

        dotButton=new JButton(".");
        dotButton.setBounds(30, 400, 80, 80);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
        dotButton.setBackground(Color.RED);
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton=new JButton("0");
        zeroButton.setBounds(130, 400, 80, 80);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equalButton=new JButton("=");
        equalButton.setBounds(230, 400, 80, 80);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
        equalButton.addActionListener(this);
        jf.add(equalButton);

        divButton=new JButton("/");
        divButton.setBounds(330, 100, 80, 80);
        divButton.setFont(new Font("Arial", Font.PLAIN, 40));
        divButton.setBackground(Color.RED);
        divButton.addActionListener(this);
        jf.add(divButton);

        multButton=new JButton("*");
        multButton.setBounds(330, 200, 80, 80);
        multButton.setFont(new Font("Arial", Font.PLAIN, 40));
        multButton.addActionListener(this);
        jf.add(multButton);

        subButton=new JButton("-");
        subButton.setBounds(330, 300, 80, 80);
        subButton.setFont(new Font("Arial", Font.PLAIN, 40));
        subButton.addActionListener(this);
        jf.add(subButton);

        addButton=new JButton("+");
        addButton.setBounds(330, 400, 80, 80);
        addButton.setFont(new Font("Arial", Font.PLAIN, 40));
        addButton.setBackground(Color.RED);
        addButton.addActionListener(this);
        jf.add(addButton);

        clearButton=new JButton("CLEAR");
        clearButton.setBounds(170, 500, 100, 80);
        clearButton.setFont(new Font("Serif", Font.PLAIN, 21));
        clearButton.addActionListener(this);
        jf.add(clearButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==seveButton) {
            if (IsOperatorClicked) {
                 displaylabel.setText("7");
                 IsOperatorClicked=false;  
            }else{
            displaylabel.setText(displaylabel.getText()+"7");
            }

        }else if (e.getSource()==eightButton) {
            if (IsOperatorClicked) {
                 displaylabel.setText("8");
                 IsOperatorClicked=false;  
            }else{
            displaylabel.setText(displaylabel.getText()+"8");
            } 

        }else if (e.getSource()==nineButton) {
            if (IsOperatorClicked) {
                 displaylabel.setText("9");
                 IsOperatorClicked=false;  
            }else{
            displaylabel.setText(displaylabel.getText()+"9");
            } 

        }else if (e.getSource()==fourButton) {
            if (IsOperatorClicked) {
                 displaylabel.setText("4");
                 IsOperatorClicked=false;  
            }else{
            displaylabel.setText(displaylabel.getText()+"4");
            } 
            
        }else if (e.getSource()==fiveButton) {
            if (IsOperatorClicked) {
                 displaylabel.setText("5");
                 IsOperatorClicked=false;  
            }else{
            displaylabel.setText(displaylabel.getText()+"5");
            } 
            
        }else if (e.getSource()==sixButton) {
            if (IsOperatorClicked) {
                 displaylabel.setText("6");
                 IsOperatorClicked=false;  
            }else{
            displaylabel.setText(displaylabel.getText()+"6");
            } 
            
        }else if (e.getSource()==oneButton) {
           if (IsOperatorClicked) {
                 displaylabel.setText("1");
                 IsOperatorClicked=false;  
            }else{
            displaylabel.setText(displaylabel.getText()+"1");
            } ;
            
        }else if (e.getSource()==twoButton) {
            if (IsOperatorClicked) {
                 displaylabel.setText("2");
                 IsOperatorClicked=false;  
            }else{
            displaylabel.setText(displaylabel.getText()+"2");
            } 
            
        }else if (e.getSource()==threeButton) {
            if (IsOperatorClicked) {
                 displaylabel.setText("3");
                 IsOperatorClicked=false;  
            }else{
            displaylabel.setText(displaylabel.getText()+"3");
            } 
            
        }else if (e.getSource()==zeroButton) {
           if (IsOperatorClicked) {
                 displaylabel.setText("0");
                 IsOperatorClicked=false;  
            }else{
            displaylabel.setText(displaylabel.getText()+"0");
            } 
            
        }else if (e.getSource()==dotButton) {
            if (IsOperatorClicked) {
                 displaylabel.setText(".");
                 IsOperatorClicked=false;  
            }else{
            displaylabel.setText(displaylabel.getText()+".");
            } 

        }else if (e.getSource()==equalButton) {
           String newValue=displaylabel.getText();

           float oldValueF=Float.parseFloat(oldValue);
           float newValueF=Float.parseFloat(newValue);
           float result= 0;

           switch (operator) {
            case "+":
                result= oldValueF + newValueF;
                break;
            case "-":
                result= oldValueF - newValueF;
                break;
            case "*":
                result= oldValueF * newValueF;
                break;
            case "/":
                if (newValueF != 0) {
                  result= oldValueF / newValueF;  
                } else{
                    displaylabel.setText("error!");
                    return;
                }
                break;
           
           }
           
            displaylabel.setText(result+"");
    
        }else if (e.getSource()==divButton) {
            IsOperatorClicked=true;
            oldValue=displaylabel.getText();
            operator ="/";
            
        }else if (e.getSource()==multButton) {
            IsOperatorClicked=true;
            oldValue=displaylabel.getText();
            operator ="*";
            
        }else if (e.getSource()==subButton) {
            
            IsOperatorClicked=true;
            oldValue=displaylabel.getText();
            operator ="-";

        }else if (e.getSource()==addButton) {
            IsOperatorClicked=true;
            oldValue=displaylabel.getText();
            operator ="+";
            
        }else if (e.getSource()==clearButton) {
            displaylabel.setText("");
            
        }
        
    }

}
