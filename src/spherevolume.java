package com.company;
import java.lang.Math;

public class Spherevolume implements ISubscriber{
    @Override
    public void notifySubscriber(String input)
    {
        try
        {
            double radius = Double.valueOf(input);

            double Spherevolume = (4/3* Math.PI *Math.pow(radius,3));

            System.out.println("Sphere volume : " + Spherevolume);
        }
        catch (Exception e)
        {
            System.out.println("Exception: " + e);
        }
    }
}
