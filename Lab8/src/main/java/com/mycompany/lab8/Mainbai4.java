/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Mainbai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
        }

        
        System.out.println("\n--- KẾT QUẢ TÍNH TOÁN ---");
        System.out.println("Tổng = " + bai4.sum(arr));
        System.out.println("Nhỏ nhất = " + bai4.min(arr));
        System.out.println("Lớn nhất = " + bai4.max(arr));

        sc.nextLine(); 

      
        System.out.print("\nNhập họ tên: ");
        String hoTen = sc.nextLine();
        String hoTenChuan = bai4.toUpperFirstChar(hoTen);
        System.out.println("Họ tên sau khi chuẩn hóa: " + hoTenChuan);

        sc.close();
    }
}
