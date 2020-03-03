package com.company;


public class MultiplicationSeries implements ISubscriber
{
    @Override
	 public  void notifySubscriber(String input){
        int n = Integer.parseInt(input);  
        
        long r=1,i=1;
        while(i<=n){
        r*=i;
        i++;
    }
        System.out.println("the series Multiplication: "+r);  
     }
}
