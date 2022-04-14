package com.bridgelabz.logicalprograms;

import com.bridgelabz.logicalprograms.PerfectNumber;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class PrimeNumbers {
    static Scanner sc = new Scanner(System.in);

    static Logger logger = Logger.getLogger(PerfectNumber.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        prime();

    }

    public static void prime(){
        logger.info("enter the number you want to check for prime number ");
        int num = sc.nextInt();
        int flag=0;//flag to check for if prime or not if not prime then flag ==1 else flag == 0;

        if ((num==0) || (num==1))
             {
                logger.info("entered number is not counted as prime number ");
            }
        else {
            for (int i=2;i<=num;i++){//if number is divided by any number between 2 to that number  then that number is not prime
                if(num%i==0){
                    logger.info(num+" is not an prime number");
                    flag=1;//updating flag if above condition true
                    break;
                }
            }
        }

        if (flag==0){// above condition not satisfied flag remains 0 then its prime

            logger.info("you have entered a number that is  a prime number "+ num);
        }

    }
}
