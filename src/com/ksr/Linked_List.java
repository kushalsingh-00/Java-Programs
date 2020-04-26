package com.ksr;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> friend=new LinkedList<>();

        friend.add("Bhanu");
        friend.add("Happy");
        friend.add("Rahul");
        System.out.println(friend);    // printing simple linked list

        friend.add(2,"Guru");   // adding value at particular index
        System.out.println(friend);

        friend.addFirst("Happy");  // at first
        friend.addLast("Lakki");    // at last
        System.out.println(friend);

        List<String> friendnames=new ArrayList<>();
        friendnames.add("Rohit");
        friendnames.add("Raman");

        friend.addAll(friendnames);  // adding names from arrayList

        System.out.println(friend);


    }
}
