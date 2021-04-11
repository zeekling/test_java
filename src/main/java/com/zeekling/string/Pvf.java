package com.zeekling.string;

import java.util.ArrayList;
import java.util.List;

public class Pvf {

    static boolean Paddy;
    public static void main(String args[]){
        System.out.println(Paddy);
        List  Listlist1 = new ArrayList();
        Listlist1.add(0);
        List Listlist2 = Listlist1;
        System.out.println(Listlist1.get(0) instanceof Integer);
        System.out.println(Listlist2.get(0) instanceof Integer);
    }
    
}
