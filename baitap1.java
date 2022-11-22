package org.example;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args){
        int n;
        System.out.println("Nhập vào một số  nguyên:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n>=0){
            System.out.println("Đây là số nguyên dương");
        }
        else {
            System.out.println("Đây là số nguyên âm");
        }
    }
}
