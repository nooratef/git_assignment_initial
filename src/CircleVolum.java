package com.company;

public class CircleVolum implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        try {
            double radius = Double.parseDouble(input);
            System.out.println(calculateVolum(radius));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private double calculateVolum(double radius)
    {
       return radius * radius * radius * (4.0/3) * 3.14;
    }
}
