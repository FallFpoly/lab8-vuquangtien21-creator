/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author ICT
 */
public class bai4 {

    public static final double sum(double... x) {
        double tong = 0;
        for (double n : x) {
            tong += n;
        }
        return tong;
    }

    public static final double min(double... x) {
        double min = x[0];
        for (double n : x) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

   
    public static final double max(double... x) {
        double max = x[0];
        for (double n : x) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static String toUpperFirstChar(String s) {
        String[] words = s.trim().replaceAll("\\s+", " ").split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                char first = words[i].charAt(0);
                char upperFirst = String.valueOf(first).toUpperCase().charAt(0);
                words[i] = upperFirst + words[i].substring(1);
            }
        }
        return String.join(" ", words);
    }
}
