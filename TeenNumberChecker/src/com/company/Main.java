package com.company;

import javax.management.ListenerNotFoundException;

public class Main {

    public static void main(String[] args) {
      boolean check1 = TeenNumberChecker.hasTeen(17,25, 39);
        System.out.println(check1);
      boolean check2 = TeenNumberChecker.isTeen(13);
        System.out.println(check2);

    }
}
