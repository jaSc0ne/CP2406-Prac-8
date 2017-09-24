package Exercise1;// Displays a JFrame containing the opening sentence or two from your favorite book

import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame{
    FlowLayout flow = new FlowLayout();
    JLabel sentence1 = new JLabel("A lot of people ask me if I know Tyler Durden.");

    public JBookQuote(){
        super("Book Quotes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(sentence1);

    }
    public static void main(String args[]){
        JBookQuote frame = new JBookQuote();
        frame.setSize(400,120);
        frame.setVisible(true);
    }
}
