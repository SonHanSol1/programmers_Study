package com.ll.level0.p120823;

import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/120823
// 직각삼각형 출력하기

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--){
            for(int j = i; j <= n; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}


//public class Solution {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = n; i >= 1; i--){
//            for(int j = i; j <= n; j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//    }
//}
/*
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i));
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
 */