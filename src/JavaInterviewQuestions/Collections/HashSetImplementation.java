package JavaInterviewQuestions.Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetImplementation {
    public static void main(String[] args) {
//        Set<String> mySet = new HashSet<>();
//        mySet.add("vaibhav");
//        mySet.add("aniket");
//        mySet.add("kaushal");
//        System.out.println(mySet);
//
//        mySet.add("tashu"); //this will not be added and will be discarded but will not throw any error
//        mySet.add("kaushal");
//        System.out.println(mySet);
//
//        mySet.remove("vaibhav");
//        System.out.println(mySet);
//
//        boolean isAniketPresentInSet = mySet.contains("aniket");
//        System.out.println("aniket present in HashSet - " + isAniketPresentInSet);
//
//        boolean isKavitaPresentInSet = mySet.contains("kavita");
//        System.out.println("kavita present in HashSet - " + isKavitaPresentInSet);

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        System.out.println(hashSet);

        hashSet.add(10);
        hashSet.add(89);
        System.out.println(hashSet);

        hashSet.remove(20);
        System.out.println(hashSet);

        System.out.println(hashSet.contains(89));
        System.out.println(hashSet.contains(56));

        System.out.println(hashSet.size());

        System.out.println(hashSet.isEmpty());

        hashSet.clear();
        System.out.println(hashSet.isEmpty());
        System.out.println();
    }
}
