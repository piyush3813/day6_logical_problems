package com.bridgelabz.Junit_testing;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Dayofweek {
    static Logger logger=Logger.getLogger(Dayofweek.class);
    public static void main(String[] args){
        BasicConfigurator.configure();
        Dayofweek dayofweek = new Dayofweek();
        dayofweek.day_week();
    }
    public void day_week(){
        Scanner sc = new Scanner(System.in);
        logger.info("enter the date ");//getting input for date months and year
        int d=sc.nextInt();
        logger.info("enter the month ");
        int m=sc.nextInt();
        logger.info("enter the year ");
        int y=sc.nextInt();
        double yo = y - (14 - m)/12;//finding year
        double x = yo + (yo/4) -(yo/100) + (yo/400);
        double mo = m + 12 * ((14 -m)/12) - 2;
        double d0 = (d+x+(31*mo)/12)%7;

        switch ((int) d0){//according to cases finding day
            case 0:
                logger.info("its sunday");
                break;
            case 1:
                logger.info("its monday");
                break;
            case 2:
                logger.info("its tuesday");
                break;
            case 3:
                logger.info("its wednesday");
                break;
            case 4:
                logger.info("its thursday");
                break;
            case 5:
                logger.info("its friday");
                break;
            case 6:
                logger.info("its saturday");
                break;
            default:
                logger.error("error");
        }


    }

}
