package ru.kfc.autotests.lesson_4.less_4_2;

import java.util.Arrays;
import java.util.List;

public class Element_main {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Tom", "Green", "Tom", "Green", "Red");
        System.out.println(findUniqElement(list1));
    }

    public static String findUniqElement(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        } else {
            for (int i = 0; i < list.size(); i++) {
                String el = list.get(i);
                boolean uniqEl = true;

                for (int j = 0; j < list.size(); j++) {
                    if (i != j && el.equals(list.get(j))) {
                        uniqEl = false;
                        break;
                    }
                }
                if (uniqEl) {
                    return el;
                }
            }
        }
        return null;
    }
}
