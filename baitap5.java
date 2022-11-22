package org.example;

import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhập vào 1 giá trị n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for (int y = i + 1; y < n; y++) {
                int temp = arr[0];
                if (arr[i] > arr[y]) {
                    temp = arr[y];
                    arr[y] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < n ;i++){
            System.out.println(arr[i]+" ");
        }
    }
}