package com.bridgelabz.logicalprograms;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class PerfectNumber {
    static Scanner sc = new Scanner(System.in);
    static Logger logger = Logger.getLogger(PerfectNumber.class);
    public static void main (String[] args) {
        BasicConfigurator.configure();
        logger.info(factors());


    }
    public static Object factors()
    {
        logger.info("enter the number you want to check for perfect number ");
        int z = sc.nextInt();
        int count = 0;
        for (int i = 1;i<z;i++){                /* checking the number 28
                                                    if 28%1==0 true then 1 is added to count and 1 is printed
                                                    if 28%2==o true then 2 is also added and sme 2 printed
                                                    if 28%3 == 0 false  the 3 not added and not printed
                                                    if 28%4  == true
                                                    similary 1+2+4+7+14=28 hence it is perfect number
        */
            if(z%i==0){
                logger.info(i+" ");
                count+=i;

            }

        }
        if (count==z){
            logger.info("the entered number is a perfect number its divisor sum is "+ count);
        }
        else
            logger.info("Entered number is not an perfect number its divisor sum is  "+count);

        return null;
    }
}
