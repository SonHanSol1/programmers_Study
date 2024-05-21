package com.ll.level0.p120883;

// https://school.programmers.co.kr/learn/courses/30/lessons/120883
// 로그인 성공?

import java.util.HashMap;
import java.util.Map;

public class Main {

}

//class Solution {
//    public String solution(String[] id_pw, String[][] db) {
//        String answer = "";
//
//        boolean idCheck = false;
//        boolean pwCheck = false;
//
//        for (int i = 0; i < db.length; i++) {
//            if (id_pw[0].equals(db[i][0])) {
//                idCheck = true;
//                if (id_pw[1].equals(db[i][1])) {
//                    pwCheck = true;
//                    break;
//                }
//            }
//        }
//
//        if (idCheck && pwCheck) {
//            answer = "login";
//        } else if (idCheck && !pwCheck) {
//            answer = "wrong pw";
//        } else {
//            answer = "fail";
//        }
//
//        return answer;
//    }
//}

//class Solution {
//    public String solution(String[] id_pw, String[][] db) {
//        String answer = "";
//        for(int i = 0;i<db.length;i++){
//            if(id_pw[0].equals(db[i][0])){
//                if(id_pw[1].equals(db[i][1])){
//                    answer = "login";
//                    break;
//                }else {
//                    answer = "wrong pw";
//                    break;
//                }
//            }else {
//                answer = "fail";
//            }
//        }
//        return answer;
//    }
//}

class Solution {
    public String solution(String[] idPw, String[][] db) {
        return getDb(db).get(idPw[0]) != null ? getDb(db).get(idPw[0]).equals(idPw[1]) ? "login" : "wrong pw" : "fail";
        /* 풀어쓰면 이거다.
        if(getDb(db).get(idPw[0]) != null){
            if(getDb(db).get(idPw[0]).equals(idPw[1])){
                return "login";
            } else {
                return "wrong pw";
            }
        } else {
            return "fail";
        }
         */
    }

    private Map<String, String> getDb(String[][] db) {
        Map<String, String> map = new HashMap<>();

        for (String[] array : db) {
            map.put(array[0], array[1]); // key: [id], value: [pw]
        }
        return map;
    }
}