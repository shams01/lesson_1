package ru.kfc.autotests.lesson_4.less_4_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Stroka_main {
    public static void main(String[] args) {
        countStroka("dffgss");
    }

    public static void countStroka(String input){
        if(input.isEmpty() || input == null || input == " "){
        }else{
            Map<Character, Integer> charCount = new HashMap<>();
            for(char s : input.toCharArray()){
                if(charCount.containsKey(s)){
                    charCount.put(s, charCount.get(s)+1);
                }else{
                    charCount.put(s, 1);
                }
            }
            for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
