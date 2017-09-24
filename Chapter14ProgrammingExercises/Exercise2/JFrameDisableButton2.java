package Exercise2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JFrameDisableButton2 extends JFrame implements ActionListener{
    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("Do Not Push");
    int counter = 0;

    public JFrameDisableButton2(){
        super("Disable Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(button);
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent action){
        counter++;
        if(counter == 8){
            button.setText("That's enough!");
            button.setEnabled(false);
        }
    }
    public static void main(String args[]){
        JFrameDisableButton2 frame = new JFrameDisableButton2();
        frame.setSize(200, 150);
        frame.setVisible(true);
    }


}
