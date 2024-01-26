package com.ll.level0.p120838;

//https://school.programmers.co.kr/learn/courses/30/lessons/120838
// 모스부호 (1)

public class Main {

}
// 소문자 아스키코드: 97 ~ 122번
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {
                ".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."
        };
        String[] letterArrays = letter.split(" ");
        for(int i = 0; i < letterArrays.length; i++)
        {
            for(int j = 0; j < morse.length; j++)
            {
                if(letterArrays[i].equals(morse[j]))
                {
                    answer += (char) (j + 97);
                }
            }
        }
        return answer;
    }
}
/*
import java.util.Map;
        import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String answer = "";
        Map<String, String> morse = new HashMap<>(){
            {
                put(".-","a");
                put("-...","b");
                put("-.-.","c");
                put("-..","d");
                put(".","e");
                put("..-.","f");
                put("--.","g");
                put("....","h");
                put("..","i");
                put(".---","j");
                put("-.-","k");
                put(".-..","l");
                put("--","m");
                put("-.","n");
                put("---","o");
                put(".--.","p");
                put("--.-","q");
                put(".-.","r");
                put("...","s");
                put("-","t");
                put("..-","u");
                put("...-","v");
                put(".--","w");
                put("-..-","x");
                put("-.--","y");
                put("--..","z");
            }
        };
        String[] letters = letter.split(" ");
        for(String str : letters){
            answer += morse.get(str);
        }
        return answer;
    }
}
 */

//                {
//                '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
//                '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
//                '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
//                '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
//                '-.--':'y','--..':'z'
//}