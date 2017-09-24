package Exercise6;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class JPizza extends JFrame implements ItemListener, ActionListener{

    FlowLayout flow = new FlowLayout();
    String title = "Jason's Pizzeria";

    ButtonGroup pizzaSizes = new ButtonGroup();
    JCheckBox smallSize = new JCheckBox("Small - $7");
    JCheckBox mediumSize = new JCheckBox("Medium - $9");
    JCheckBox largeSize = new JCheckBox("Large - $11");
    JCheckBox extraLargeSize = new JCheckBox("Extra Large = $14");

    ButtonGroup pizzaToppings = new ButtonGroup();
    JButton cheese = new JButton("Cheese");
    JButton sausage = new JButton("Sausage");
    JButton chicken = new JButton("Chicken");
    JButton pepperoni = new JButton("Pepperoni");
    JButton beef = new JButton("Beef");
    JButton blackOlives = new JButton("Black Olives");
    JButton ham = new JButton("Ham");

    JTextField totPrice = new JTextField(10);
    int totalPrice = 0;
    int[] pizzaSizePrices = {7,9,11,14};
    int extraTopping = 1;
    String output = "Total Price: $";

    public JPizza(){
        super("Jason's Pizzeria");
        setLayout(flow);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(smallSize);
        smallSize.addItemListener(this);
        add(mediumSize);
        mediumSize.addItemListener(this);
        add(largeSize);
        largeSize.addItemListener(this);
        pizzaSizes.add(smallSize);
        pizzaSizes.add(mediumSize);
        pizzaSizes.add(largeSize);
        pizzaSizes.add(extraLargeSize);

        add(cheese);
        cheese.addActionListener(this);
        add(sausage);
        sausage.addActionListener(this);
        add(chicken);
        chicken.addActionListener(this);
        add(pepperoni);
        pepperoni.addActionListener(this);
        add(beef);
        beef.addActionListener(this);
        add(blackOlives);
        blackOlives.addActionListener(this);
        add(ham);
        ham.addActionListener(this);
        pizzaToppings.add(cheese);
        pizzaToppings.add(sausage);
        pizzaToppings.add(chicken);
        pizzaToppings.add(pepperoni);
        pizzaToppings.add(beef);
        pizzaToppings.add(blackOlives);
        pizzaToppings.add(ham);

        add(totPrice);
        totPrice.setText(output);


    }
    public void itemStateChanged(ItemEvent check) {
        Object source = check.getItem();
        if (source == smallSize) {
            if (check.getStateChange() == ItemEvent.SELECTED) {
                totalPrice += pizzaSizePrices[0];
            } else {
                totalPrice -= pizzaSizePrices[0];
            }
        }
        if (source == mediumSize) {
            if (check.getStateChange() == ItemEvent.SELECTED) {
                totalPrice += pizzaSizePrices[1];
            } else {
                totalPrice -= pizzaSizePrices[1];
            }
        }
        if (source == largeSize) {
            if (check.getStateChange() == ItemEvent.SELECTED) {
                totalPrice += pizzaSizePrices[2];
            } else {
                totalPrice -= pizzaSizePrices[2];
            }
        }
        if (source == extraLargeSize) {
            if (check.getStateChange() == ItemEvent.SELECTED) {
                totalPrice += pizzaSizePrices[3];
            } else {
                totalPrice -= pizzaSizePrices[3];
            }
        }
        totPrice.setText(output+Integer.toString(totalPrice));
    }
    public void actionPerformed(ActionEvent action){
        Object source = action.getSource();
        if(source == sausage){
            totalPrice += extraTopping;
        }
        if(source == chicken){
            totalPrice += extraTopping;
        }
        if(source == ham){
            totalPrice += extraTopping;
        }
        if(source == beef){
            totalPrice += extraTopping;
        }
        if(source == blackOlives){
            totalPrice += extraTopping;
        }
        if(source == pepperoni){
            totalPrice += extraTopping;
        }
        totPrice.setText(output+Integer.toString(totalPrice));
    }
    public static void main(String args[]){
        JPizza frame = new JPizza();
        frame.setSize(300,200);
        frame.setVisible(true);
    }


}
