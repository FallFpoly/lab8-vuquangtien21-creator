/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static final double sum(double... x) {
        double tong = 0;
        for (double so : x) {
            tong += so;
        }
        return tong;
    }

    public static final double min(double... x) {
        double min = x[0];
        for (double so : x) {
            if (so < min) {
                min = so;
            }
        }
        return min;
    }

    public static final double max(double... x) {
        double max = x[0]; 
        for (double so : x) {
            if (so > max) {
                max = so;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Tổng: " + sum(2, 4, 6, 8, 10));
        System.out.println("Số nhỏ nhất: " + min(2, 4, 6, 8, 10));
        System.out.println("Số lớn nhất: " + max(2, 4, 6, 8, 10));
    }
}
