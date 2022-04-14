package com.bridgelabz.Junit_testing;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class DecimalToBinary {
    static Logger logger = Logger.getLogger(DecimalToBinary.class);
    public static void main(String [] args) {
        BasicConfigurator.configure();
        DecimalToBinary dtb = new DecimalToBinary();
        int alpha = dtb.tobinary();
    }
    public int tobinary(){
        int dec_num,quo,i=1,j;
        int[] binary_num=new int[1000];//assigning empty array to store binary elemnts

        logger.info("enter the number you want to convert to decimal ");

        Scanner sc = new Scanner(System.in);
        dec_num = sc.nextInt();// input decimal number

        quo = dec_num;

        while(quo !=0){//looping till quotient become 0                      5%2=1 one is added to array
            binary_num[i++]=quo%2;//and adding remoinder to array
            quo=quo/2;//and decrementing quotient by dividing by 2            5/2=2 updating new value
        }                                                                  // 2%2=0 zero is added to array
                                                                           // 2/2 = 1 updating quo
                                                                           // 1%2 = 1 added to array
                                                                          //  1/2 = 0 quo is updated to zero so com out of loop
        logger.info("binary number is ");
// for output binary reverse the order and stat the array from last 2nd elemnt till last
        for (j=i-1;j>0;j--){
            System.out.print(binary_num[j]);
        }
        return binary_num[j];
    }

}
