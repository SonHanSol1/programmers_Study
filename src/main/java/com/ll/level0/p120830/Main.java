package com.ll.level0.p120830;
//https://school.programmers.co.kr/learn/courses/30/lessons/120830
//양꼬치
public class Main {
    public static void main(String[] args){

    }
}
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int discount= 0;
        if(n >= 10)
        {
            discount = n/10;
            k = k - discount;
        }

        return answer = n * 12000 + k * 2000;
    }
}
/*
// 1
class Solution {
    public int solution(int n, int k) {
        return n * 12000 + k * 2000 - (n / 10 * 2000);
    }
}
// 2
class Solution {
    public int solution(int n, int k) {
        int lambTotalPrice = totalPrice(Menu.LAMB, n);
        int drinkTotalPrice = totalPrice(Menu.DRINK, k);
        int discountPrice = discount(Menu.DRINK, n);

        int totalPay = lambTotalPrice + drinkTotalPrice - discountPrice;
        return totalPay;
    }

    private int totalPrice(Menu menu, int quantity) {
     return menu.getPrice() * quantity;
    }

    private int discount(Menu menu, int lambQuantity) {
        // 양꼬치 10인분에 음료수 하나
        int point = lambQuantity / 10;

        return menu.getPrice() * point;
    }
}
enum Menu {

    LAMB("양꼬치", 12000),
    DRINK("음료수", 2000);

    private final String name;
    private final int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
 */