package com.company;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Phonebook {
    private final Map<String, Set<String>> m;
    public Phonebook(){
        m=new TreeMap<>();
    }
    public void add(String family,String phoneNumber){
         if (m.get(family)==null) {
             Set <String> hs=new HashSet<>();
             hs.add(phoneNumber);
             m.put(family,hs);
         }
         else{
             m.get(family).add(phoneNumber);
         }
    }
    public Set<String> get(String family){
        return m.get(family);
    }
    public void print(){
        System.out.println(m);
    }
}
