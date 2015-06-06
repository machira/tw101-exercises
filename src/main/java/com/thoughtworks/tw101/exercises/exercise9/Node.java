package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private Node left , right;
    private String name;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if(nameOfNewNode.compareToIgnoreCase(name) < 0){
            if(left == null)
                left = new Node(nameOfNewNode);
            else
                left.add(nameOfNewNode);
        }else{
            if (right == null)
                right = new Node(nameOfNewNode);
            else
                right.add(nameOfNewNode);
        }
    }

    public List<String> names() {
        List<String> list = new ArrayList<>();
        if(left != null)
            list.addAll(left.names());
        list.add(name);
        if(right != null)
            list.addAll(right.names());

        return list;
    }
}
