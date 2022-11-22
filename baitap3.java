package org.example;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Nhập vào 3 số:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a * a + b * b == c * c || a * a == b * b + c * c || a * a + c * c == b * b)
            System.out.println("Đây là 3 cạnh tam giác vuông ");
        else
            System.out.println("Không phải là ba cạnh tam giác vuông");
    }

}
