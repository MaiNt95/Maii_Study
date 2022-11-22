package org.example;

import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        String x;
        char s;
        Scanner sc = new Scanner(System.in);
        x = sc.nextLine();
        s = sc.nextLine().charAt(0);
        int a = 0;
    for (int i = 0; i < x.length(); i++){
        if (x.charAt(i)==s){
           a++;
           break;
        }
    }
    if (a>0){
        System.out.println("Có");
    }
    else {
        System.out.println("Không");
    }
    }


}
