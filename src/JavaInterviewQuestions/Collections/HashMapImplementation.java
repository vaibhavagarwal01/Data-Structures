package JavaInterviewQuestions.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/*
WAP a program to count no of characters in a given string using hashmap
 */
public class HashMapImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        HashMap<Character,Integer> alphabets = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(!alphabets.containsKey(ch)) {
                alphabets.put(ch,1);
            }
            else {
                count=alphabets.get(ch);
                count=count+1;
                alphabets.put(ch,count);
            }
        }
        System.out.println(alphabets);

        Iterator<Map.Entry<Character,Integer>> itr=alphabets.entrySet().iterator(); {
            while(itr.hasNext()) {
                Map.Entry<Character, Integer> entry = itr.next();
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }



        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("three",3);
        hashMap.put("four",4);
        hashMap.put("five",5);

        System.out.println(hashMap);

        hashMap.put("two",56);
        hashMap.put("six",6);
        System.out.println(hashMap);

        hashMap.remove("two");
        System.out.println(hashMap);

        System.out.println(hashMap.get("two"));

        if(!hashMap.containsKey("two")) {
            hashMap.put("two",89);
        }
        hashMap.putIfAbsent("two",200);
        System.out.println(hashMap);

        System.out.println(hashMap.isEmpty());

        System.out.println(hashMap.containsKey("two"));
        System.out.println(hashMap.containsValue(200));

        for(Map.Entry<String,Integer> e : hashMap.entrySet()) {
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String key: hashMap.keySet()) {
            System.out.println(key);
        }

        for(Integer value: hashMap.values()) {
            System.out.println(value);
        }
    }
}


