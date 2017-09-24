package Exercise1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote2 extends JFrame implements ActionListener {
    FlowLayout flow = new FlowLayout();
    JLabel sentence1 = new JLabel("A lot of people ask me if I know Tyler Durden.");
    JButton button = new JButton("Click for Book Title");
    JLabel bookTitle = new JLabel("Fight Club");


    public JBookQuote2(){
        super("Book Quote with Buttons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(sentence1);
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent action){
        add(bookTitle);
        validate();
        repaint();
    }

    public static void main(String args[]){
        JBookQuote2 frame = new JBookQuote2();
        frame.setSize(400,120);
        frame.setVisible(true);
    }
}
