package com.ll.middleTest.p21;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

//        long sum = 0;
//        for(int i= 0; i < 100000; i++){
//            if(i%3 == 0 || i%5 ==0){
//                //System.out.println(i)
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);
//---------------------------------
//        long num1 = 1;
//        long num2 = 1;
//        long temp = 1;
//        long sum = 0;
//        while(temp<50000000){
//            num1 = num2;
//            num2 = temp;
//            temp = num1 + num2;
//            //System.out.println(a);
//            //System.out.println(b);
//            //System.out.printf("피보나치 수열: %d \n", temp);
//            if(temp%2 == 0 && temp<=50000000){
//                sum = sum + temp;
//                //System.out.println(sum);
//            }
//        }
//        System.out.println(sum);
// ------------------------------
//        BigInteger a = new BigInteger("1600851475143");
//        System.out.println(a);
//-----------------------------
        int num = 0;
        int div=0;
        int result = 0;
        for(int i=2500; i <= 10000; i++)
        {
            for(int j=23; j > 1; j--)
            {
                if(i%j==0){
                    System.out.println(i);
                }
            }


        }

    }
}
