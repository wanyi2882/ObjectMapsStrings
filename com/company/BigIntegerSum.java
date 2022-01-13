package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerSum {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        BigInteger num1 = new BigInteger(sc.nextLine());
        BigInteger num2 = new BigInteger(sc.nextLine());

        System.out.println(num1.add(num2));
    }
}
