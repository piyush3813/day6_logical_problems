package com.bridgelabz.logicalprograms;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class ReverseAnumber {
    static Logger logger = Logger.getLogger(ReverseAnumber.class);
    public static void main(String[] args){
        BasicConfigurator.configure();
            logger.info("program to reverse the given number ");
            logger.info("enter the number you want to reverse:-");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int rev=0;
            for(;x!=0;x/=10){//staring the loop from number itself  checking till x is not equal to zero and decremnting the loop by dividing the num
                //567
                int reminder=x%10;//reminder == 567%10 == 7
                rev = rev*10+reminder;// 0*10+7
                /*
                rev= 7
                x = 56
                reminder = 56%10 = 6
                rev = 7*10 + 6 ==76
                hence the last iteration also
                making it 567 to 765

                 */
            }
            System.out.println(rev);

        }
    }

