package com.company;

public class PlayingCat {
    public static boolean isCatPlaying (boolean summer, int temperature){
        if (temperature < 25) {
            return false;
        }else if ((!summer) && (temperature > 35)) {
            return false;
        }else if (summer && (temperature > 45)) {
            return false;
        }else {
            return true;
        }
    }
}
