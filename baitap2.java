package org.example;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhập vào một số  nguyên:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        switch (n) {
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            default:
                System.out.println("Chỉ từ 0 - 5");
                break;
        }

    }
}
