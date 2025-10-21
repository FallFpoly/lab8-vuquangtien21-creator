/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static final double sum(double... x) {
        double tong = 0;
        for (double so : x) {
            tong += so;
        }
        return tong;
    }

    public static void main(String[] args) {
        
        System.out.println("Tổng 2 số: " + sum(3.5, 4.5));
        System.out.println("Tổng 4 số: " + sum(1, 2, 3, 4));
        System.out.println("Tổng 6 số: " + sum(10, 20, 30, 40, 50, 60));
    }
}
