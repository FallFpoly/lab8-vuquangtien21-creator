/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static String toUpperFirstChar(String s) {
 
        String[] words = s.split(" ");
        
        
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) { 
               
                char firstChar = words[i].charAt(0);
                String upperFirstChar = String.valueOf(firstChar).toUpperCase();
                
               
                words[i] = upperFirstChar + words[i].substring(1);
            }
        }
        
       
        return String.join(" ", words);
    }

   
    public static void main(String[] args) {
        String input = "nguyen van teo";
        String result = toUpperFirstChar(input);
        System.out.println(result); 
    }
}
