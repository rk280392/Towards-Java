package com.company;

public class megaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        }else {
            int megaBytes = (kilobytes / 1024);
            int kiloBytesval = (kilobytes % 1024);
            System.out.println(kilobytes + " KB" + " = " + megaBytes + " MB and " + kiloBytesval + " KB" );
        }
    }
}
