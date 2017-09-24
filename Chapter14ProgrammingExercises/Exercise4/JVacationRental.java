package Exercise4;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class JVacationRental extends JFrame implements ItemListener{
    FlowLayout flow = new FlowLayout();
    String title = new String("Lambert's Vacation Rental!");

    ButtonGroup locations = new ButtonGroup();
    JCheckBox parkside = new JCheckBox("Parkside", false);
    JCheckBox poolside = new JCheckBox("Poolside",  false);
    JCheckBox lakeside = new JCheckBox("Lakeside",false);

    ButtonGroup numberOfBedrooms = new ButtonGroup();
    JCheckBox oneBedroom = new JCheckBox("1 Bedroom", false);
    JCheckBox twoBedroom = new JCheckBox("2 Bedrooms", false);
    JCheckBox threeBedroom = new JCheckBox("3 Bedrooms", false);

    ButtonGroup meals = new ButtonGroup();
    JCheckBox includeMeals = new JCheckBox("Include Meals", false);

    JTextField totPrice = new JTextField(10);
    int[] locationPrices = {600, 750, 825};
    int bedroomPrice = 75;
    int mealsPrice = 200;
    int totalPrice = 0;

    public JVacationRental(){
        super("Lambert's Vacation Rental");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);

        add(parkside);
        parkside.addItemListener(this);
        add(poolside);
        poolside.addItemListener(this);
        add(lakeside);
        lakeside.addItemListener(this);

        add(oneBedroom);
        oneBedroom.addItemListener(this);
        add(twoBedroom);
        twoBedroom.addItemListener(this);
        add(threeBedroom);
        threeBedroom.addItemListener(this);

        add(includeMeals);
        includeMeals.addItemListener(this);

        locations.add(parkside);
        locations.add(poolside);
        locations.add(lakeside);

        numberOfBedrooms.add(oneBedroom);
        numberOfBedrooms.add(twoBedroom);
        numberOfBedrooms.add(threeBedroom);

        meals.add(includeMeals);

        add(totPrice);
        totPrice.setText("$0 per week");

    }
    public void itemStateChanged(ItemEvent check){
        Object source = check.getItem();
        if(source == parkside){
            if(check.getStateChange() == ItemEvent.SELECTED){
                totalPrice += locationPrices[0];
            }else{
                totalPrice -= locationPrices[0];
            }
        }
        if(source == poolside){
            if(check.getStateChange() == ItemEvent.SELECTED){
                totalPrice += locationPrices[1];
            }else{
                totalPrice -= locationPrices[1];
            }
        }
        if(source == lakeside){
            if(check.getStateChange() == ItemEvent.SELECTED){
                totalPrice += locationPrices[2];
            }else{
                totalPrice -= locationPrices[2];
            }
        }
        if(source == twoBedroom){
            if(check.getStateChange() == ItemEvent.SELECTED){
                totalPrice += bedroomPrice;
            }else{
                totalPrice -= bedroomPrice;
            }
        }
        if(source == threeBedroom){
            if(check.getStateChange() == ItemEvent.SELECTED){
                totalPrice += 2*bedroomPrice;
            }else{
                totalPrice -= 2*bedroomPrice;
            }
        }
        if(source == includeMeals){
            if(check.getStateChange() == ItemEvent.SELECTED){
                totalPrice += mealsPrice;
            }else{
                totalPrice -= mealsPrice;
            }
        }
        totPrice.setText("$" + Integer.toString(totalPrice)+" per week");
    }
    public static void main(String args[]){
        JVacationRental frame = new JVacationRental();
        frame.setSize(500,500);
        frame.setVisible(true);
    }


}
