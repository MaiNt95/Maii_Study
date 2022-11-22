package org.example;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        int n, i;
        int sum = 0;
        System.out.println("Nhập vào 1 số nguyên dương: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = 0; i <= n; i++){
            if (i % 2 == 0)
                sum = sum + i;
        }
        System.out.println(sum);
    }
}
