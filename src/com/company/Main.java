package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Box o = new Box(1,2,3);
        Box p = new Box(1,2,3);
        Integer code = o.hashCode();
        System.out.println(code);
        Integer code2 = p.hashCode();
        System.out.println(code2);
        System.out.println(o.equals(p));




    }
}
