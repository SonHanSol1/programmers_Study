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
//class Solution {
//    public int[] solution(String[] keyinput, int[] board) {
//        int[] now = {0, 0};
//        for (int i = 0; i < keyinput.length; i++){
//            if(keyinput[i].equals("left")) now[0] -= now[0]>-(board[0]/2)?1:0;
//            else if(keyinput[i].equals("right")) now[0] += now[0]<(board[0]/2)?1:0;
//            else if(keyinput[i].equals("down")) now[1] -= now[1]>-(board[1]/2)?1:0;
//            else if(keyinput[i].equals("up")) now[1] += now[1]<(board[1]/2)?1:0;
//        }
//        return now;
//    }
//}
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
