package com.ll.level0.p120861;

// https://school.programmers.co.kr/learn/courses/30/lessons/120861
// 캐릭터의 좌표

import java.util.HashMap;

//
//public class Main {
//
//}
//class Solution {
//    public int[] solution(String[] keyinput, int[] board) {
//        int[] answer = {0,0};
//        int[] map = {board[0]/2, board[1]/2};
//        for(String str : keyinput){
//            switch(str){
//                case "up" :
//                    if(answer[1] < map[1]){
//                        answer[1]++;
//                    }
//                    break;
//                case "down" :
//                    if(answer[1] > -map[1]){
//                        answer[1]--;
//                    }
//                    break;
//                case "right" :
//                    if(answer[0] < map[0]){
//                        answer[0]++;
//                    }
//                    break;
//                case "left" :
//                    if(answer[0] > -map[0]){
//                        answer[0]--;
//                    }
//                    break;
//            }
//        }
//        return answer;
//    }
//}
////class Solution {
////    public int[] solution(String[] keyinput, int[] board) {
////        int[] answer = {0,0};
////        String[] str = {"up", "down", "right", "left"};
////        HashMap<String, Integer> key = new HashMap<>();
////        key.put("up", 1);
////        key.put("down", -1);
////        key.put("right", 1);
////        key.put("left", -1);
////        for(String key : keyinput){
////            if(key)
////        }
////        return answer;
////    }
////}
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;
        for (String key : keyinput) {
            move(key, answer, xLimit, yLimit);
        }
        return answer;
    }

    private void move(String key, int[] answer, int xLimit, int yLimit) {
        switch (key) {
            case "up":
                if (answer[1] < yLimit) {
                    answer[1]++;
                }
                break;
            case "down":
                if (answer[1] > -yLimit) {
                    answer[1]--;
                }
                break;
            case "right":
                if (answer[0] < xLimit) {
                    answer[0]++;
                }
                break;
            case "left":
                if (answer[0] > -xLimit) {
                    answer[0]--;
                }
                break;

        }
    }

}
