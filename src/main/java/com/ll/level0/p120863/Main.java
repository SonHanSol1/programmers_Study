package com.ll.level0.p120863;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Polynomial aPolynomial = new Polynomial();
        //aPolynomial.calc("10+5");
    }
}

class Polynomial {
    private String str;
    Polynomial(String str){
        this.str = str;
    }
    public int calc(String s){
        int intValue;
        List<Integer> list = new ArrayList<>();
        String[] strArray = s.split("\\+" );
        for(int i =0; i<strArray.length; i++){
            //System.out.println(strArray[i]);
            intValue = Integer.parseInt(strArray[i]);
            list.add(intValue);
        }
        int sum = list.stream().mapToInt(Integer::intValue).sum();

        //
        //int intValue = Integer.parseInt(strArray[1]);
        //System.out.println(sum);
        return sum;
    }

}

