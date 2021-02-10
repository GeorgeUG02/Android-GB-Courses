package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] a={"apple","house","horse","planet","apple","stone","meteor","stone","name","table","stone", "chair","lamp","book","name","house"};
        Set<String> s=new HashSet<>();
        Collections.addAll(s, a);
        System.out.println(s);
        Map<String,Integer> m=new HashMap<>();
        for(String word:a){
            m.merge(word, 1, Integer::sum);
        }
        System.out.println(m);
        Phonebook pb=new Phonebook();
        pb.add("Smith","+14412351437");
        pb.add("Smith","+15634887956");
        pb.add("Smith","+11569985641");
        pb.add("Black","+11469157874");
        pb.add("Black","+11478950186");
        pb.add("Green","+15470784871");
        System.out.println(pb.get("Smith"));
        System.out.println(pb.get("Black"));
        System.out.println(pb.get("Green"));
        pb.print();
    }
}
