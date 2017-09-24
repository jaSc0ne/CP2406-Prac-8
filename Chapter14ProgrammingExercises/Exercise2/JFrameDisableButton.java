package Exercise2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JFrameDisableButton extends JFrame implements ActionListener{
    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("Do Not Push");

    public JFrameDisableButton(){
        super("Disable Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent action){
        button.setText("I told you not to push it!");
        button.setEnabled(false);
    }

    public static void main(String args[]){
        JFrameDisableButton frame = new JFrameDisableButton();
        frame.setSize(300,200);
        frame.setVisible(true);
    }


}
