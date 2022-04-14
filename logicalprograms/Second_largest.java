package com.bridgelabz.logicalprograms;
//asked separately in class not the assignment part .
//finding second largest without using sort technique .
public class Second_largest {

        public static void main(String[] args) {

            int num[] = { 67,89,12,98,99,76 };


            int n = num.length;
//initializing min value to highest and second-highest
            int highest = Integer.MIN_VALUE;//MIN_VALUE allots the -ve value last value of integer type i.e=-214748987..
            int secondHighest = Integer.MIN_VALUE;


            for (int i = 0; i < n; i++) {
//checking  0th position element if it is greater than the highest then exchange it
// with the highest and let the previous value of highest be the second-highest
                if (num[i] > highest) {

                    secondHighest = highest;
                    highest = num[i];
                }

//checking if first value is less than highest but greater than second-highest then allot that value to second highest
                if (num[i] < highest && num[i] > secondHighest) {

                    secondHighest = num[i];
                }
            }
//printing the second-highest value
            System.out.println("Second highest " + secondHighest);

        }

    }

