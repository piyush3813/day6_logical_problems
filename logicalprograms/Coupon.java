package com.bridgelabz.logicalprograms;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Coupon {
    static Logger logger = Logger.getLogger(ReverseAnumber.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();/*
        using toCharArray we are transfering each charter in chars to array as an index [1]=A
 ....        */
        int m = 1000000000;
        int random = (int) (Math.random() * m);//*m to get the number of values in output
        StringBuffer sb = new StringBuffer(); // stringbuffer for assigning a empty string which we are further going to append

        while (random > 0) {
            sb.append(chars[random % chars.length]);//possiible outcomes will 55 outof 55 it will select one
            random /= chars.length;//and decrementing random by divison
        }

        String couponcode = sb.toString();//conversion of array to string
        logger.info("coupon code = " + couponcode);
    }
}
