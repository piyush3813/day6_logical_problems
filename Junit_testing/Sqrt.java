package com.bridgelabz.Junit_testing;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Sqrt {
    static Logger logger= Logger.getLogger(Sqrt.class);
    public static void main(String[] args){
        BasicConfigurator.configure();
        Sqrt sq = new Sqrt();
        logger.info(sq.sqrt());

    }
    public double sqrt(){
        logger.info("enter the number you want sqrt for  = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double sqrt = 0;
        double temp = 0;
        temp = num/2;

        while (num >0.0){
            sqrt= temp-(temp *temp -num) / (2 *temp);



            double value ;
            value = Math.abs(temp - sqrt);

            if (value<0.0001){
                return sqrt;
            }
            else
            {
                temp = sqrt;
            }

        }
        return num;
    }
}

