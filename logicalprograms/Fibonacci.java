package com.bridgelabz.logicalprograms;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Fibonacci {
    static Logger logger = Logger.getLogger(Fibonacci.class);
    public static void main (String[] args){
        BasicConfigurator.configure();

        Scanner sc = new Scanner(System.in);
        logger.info("enter the position of element you want to find");
        int n = sc.nextInt();
        logger.info(fibo(n));
// 0,1,1,2,3,5,......this fibonacci series

                                                                /*  fibo(5)
                                                                   /     \
                                                              fibo(4)  +  fibo(3)
                                                              /   \        /  \
                                                         fibo(3)+fibo(2) +fibo(2)+fibo(1)
                                                         /  \      |         |      |
                                                  fibo(2)+fibo(1)+ 1     +    1   +  0
                                                  |         |
                                                  1     +   0   +  1     +     1  +   0    =>  3 is the 5th elemnt value
                                                                 */
    }

    public  static  int  fibo(int n){
        if (n==1) return 0;//for index1
        if (n==2) return 1;//fro index 2
        else {
            return fibo(n - 1) + fibo(n - 2);//recursion

        }
    }
}
