// User selects pizza topping and sees price
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FixDebugFourteen3 extends JFrame implements ItemListener{
    FlowLayout flow = new FlowLayout();
    JComboBox<String> pizzaBox = new JComboBox<String>();
    JLabel aLabel = new JLabel("Paulos's American Pie");
    JLabel toppingList = new JLabel("Topping List");
    JTextField totPrice = new JTextField(10);
    int[] pizzaPrice = {7, 10, 10, 8, 8, 8, 8};
    int totalPrice = 0;
    String output;
    int pizzaNum;

    public FixDebugFourteen3(){
        super("Pizza List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        pizzaBox.addItemListener(this);
        add(toppingList);
        pizzaBox.addItem("Cheese");
        pizzaBox.addItem("Sausage");
        pizzaBox.addItem("Pepperoni");
        pizzaBox.addItem("Onion");
        pizzaBox.addItem("Green Pepper");
        pizzaBox.addItem("Green Olive");
        pizzaBox.addItem("Black Olive");
        add(pizzaBox);
        add(aLabel);
        add(totPrice);
    }

    public static void main(String args[]){
        JFrame frame = new FixDebugFourteen3();
        frame.setSize(400,300);
        frame.setVisible(true);
    }

    public void itemStateChanged(ItemEvent list){
        Object source = list.getSource();
        if(source == pizzaBox){
            int pizzaNum = pizzaBox.getSelectedIndex();
            totalPrice = pizzaPrice[pizzaNum];
            output = "Pizza Price is $"+totalPrice;
            totPrice.setText(output);
        }
    }


}
