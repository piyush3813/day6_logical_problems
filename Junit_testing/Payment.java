package com.bridgelabz.Junit_testing;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Payment {
    static Scanner sc = new Scanner(System.in);
    static Logger logger = Logger.getLogger(Payment.class);
    public static void main(String [] args) {
        BasicConfigurator.configure();
        Payment pay = new Payment();
        logger.info(pay.calPayment());

    }
    public double calPayment(){
        logger.info("enter Principal amount");
        float p = sc.nextFloat();
        logger.info("enter years");
        float y = sc.nextFloat();
        logger.info("enter rate");
        float r = sc.nextFloat();// calculating si using given formulae
        float n = 12 *y;
        float rate = r / (12 * 100);
        double Payment = (p*rate) / (1-(Math.pow((1+rate),-n)));
        return Payment;
    }
}
