package com.bridgelabz.Junit_testing;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.math.BigInteger;
import java.util.Scanner;

public class Vending_machine {
    static Logger logger= Logger.getLogger(Vending_machine.class);
    static int [] notes= new int[]{1000, 500, 100, 50, 20, 10, 5, 2, 1};
    static int total=0;
    public static void main(String[] args){
        BasicConfigurator.configure();
        logger.info("enter the money you want change for ");
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        Vending_machine vm = new Vending_machine();
        vm.vending(m,notes);
        logger.info("total number of notes "+total);

    }
    public void vending( int money, int[]notes) {
        int i = 0;
        int rem;
        while (money != 0) {
                int totalnote = money / notes[i];//e.g. money=2500----> 2500/1000=2
                rem = money % notes[i];//2500%1000= 500
                money = rem;//money updated to 500
                total += totalnote;//total incremented to 2 from 0
                logger.info("total notes = " + notes[i] + "=" + totalnote);//printing total notes
                i++;//incrementing i i.e. from (1000 --> notes[0]) to (500 --> notes[1])
            /* money = 500
            money/500= 1
            rem = 500%500==0
            total also incremented from 2+1=3
             */
        }
    }//method ended


}
