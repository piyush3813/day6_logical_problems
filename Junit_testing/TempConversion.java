package com.bridgelabz.Junit_testing;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class TempConversion {
    static Scanner sc = new Scanner(System.in);
    static Logger logger= Logger.getLogger(TempConversion.class);
    public static void main(String[] args){
        BasicConfigurator.configure();
        TempConversion tc = new TempConversion();
        tc.tempconversion();


    }
     void tempconversion() {
        logger.info("choose the temp you want to convert ");
        logger.info("1. Celsius to Fahrenheit           2.Fahrenheit to Celsius");
        double cel;
        double fah;
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                logger.info("you have chosen celsius to fahrenheit");
                logger.info("enter te temp in celsius");
                 cel = sc.nextDouble();//acc. to formulae conversion
                 fah = (cel * 9/5)+32;
                logger.info("converted value ="+fah+"F");
                break;
            case 2:
                logger.info("you have chosen fahrenheit to celsius");
                logger.info("enter te temp in fahrenheit");
                 fah = sc.nextDouble();
                 cel = (fah - 32 )+(5/9);//acc. to formulae conversion
                logger.info("converted value ="+cel+"C");
            default:logger.info("plzz enter the choice either 1 OR 2");
        }

    }
}
