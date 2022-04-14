package com.bridgelabz.Junit_testing;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Clock {

      private int min;
     static private int hours;
//   static int newvar=15;

    public int getMin() {
        return this.min;
    }

    public void setMin(int min) {
        if (min <= 60) {
            this.min = min;
        } else {
            System.out.println("Invalid input");
        }
    }

    public void setHours(int hours) {
        if (hours<=24) {
            this.hours = hours;
        }
        else{
            System.out.println("invalid input");
        }
    }

    public int getHours() {
        return this.hours;
    }


}

class Main{
    static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args){
        BasicConfigurator.configure();

        Clock clock = new Clock();
        Clock clock1= new Clock();
//        Clock.newvar=15;


        clock.setHours(15);
        logger.info("hours we entered is "+clock.getHours());
        clock.setHours(21);
//        clock1.setHours(20);
        logger.info(clock.getHours());

    }
}
