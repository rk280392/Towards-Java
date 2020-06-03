package com.company;

public class Main {

    public static void main(String[] args) {

            Main beer = new Main();
            for (int bottleNum = 99; bottleNum >= 0; bottleNum--) {
                String word = "bottle";
                beer.lyrics(bottleNum, word);
        }
            System.exit(0);
    }
    public static void lyrics(int bottleNum, String word) {
        if (bottleNum == 0) {
            System.out.print("No more " + word + "s" + " of beer on the wall,");
            System.out.println("no more " + word + "s" + " of beer");
            System.out.println("Go to the store and buy some more," + " 99 bottles of beer on the wall.\n");
        } else if (bottleNum == 1) {
            System.out.print(bottleNum + " " + word + " of beer on the wall,");
            System.out.println(bottleNum + " " + word + " of beer.");
            System.out.println("Take one down and pass it around, no more " + word + "s" + " of beer on the wall.\n");
        } else if (bottleNum == 2) {
            System.out.print(bottleNum + " " + word + "s" + " of beer on the wall,");
            System.out.println(bottleNum + " " + word + "s" + " of beer.");
            System.out.println("Take one down and pass it around," + (bottleNum - 1) + " " + word + " of beer on the wall.\n");
        } else {
            System.out.print(bottleNum + " " + word + "s" + " " + " of beer on the wall,");
            System.out.println(bottleNum + " " + word + "s" + " " + "of beer.");
            System.out.println("Take one down and pass it around, " + (bottleNum - 1) + " " + word + "s" + " of beer on the wall.\n");
        }
    }
}
