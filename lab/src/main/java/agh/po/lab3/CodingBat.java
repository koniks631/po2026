package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation) {
            return true;
        }

        return false;
    }

    public boolean loneTeen(int a, int b) {
        if((a<=19 && a>=13) || (b<=19 && b>=13)){
            if((a<=19 && a>=13) && (b<=19 && b>=13)){
                return false;
            }
            return true;
        }
        return false;
    }

    public int sum13(int[] nums) {
        int a=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==13){
                i++;
                continue;
            }
            else {
                a = a+nums[i];
            }
        }
        return a;
    }

    public String firstHalf(String str) {
        if((str.length() & 1) == 0){
            return str.substring(0, str.length() / 2);
        }
        else {
            return str;
        }
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }


    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                int obecnyLicznik = map.get(s);
                map.put(s, obecnyLicznik + 1);
            } else {
                map.put(s, 1);
            }
        }
        return map;
    }



    public static void main(String[] args) {
        CodingBat cb=new CodingBat();
        cb.sleepIn(false, true);
        cb.loneTeen(1,2);
        int[] a = {1,2,13,1,1};
        cb.sum13(a);
        String txt = "WooHoo";
        cb.firstHalf(txt);
        Map<String, String> testMap = new HashMap<String, String>();
        testMap.put("a", "aaa");
        testMap.put("b", "aaa");
        testMap.put("c", "cake");
        Map<String, String> testmap2 = cb.mapAB2(testMap);
        System.out.println(testmap2);

        String[] testArray = {"a", "b", "a", "c", "b"};
        Map<String, Integer> wynik = cb.wordCount(testArray);
        System.out.println(wynik);
    }

}




//System.out.println("Przed modyfikacją: " + testMap);
//          testMap.put("a", "aaa");
//        testMap.put("b", "aaa");
//        testMap.put("c", "cake");
//System.out.println("Po modyfikacji:    " + testmap2);