package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        BigInteger result = new BigInteger(String.valueOf(1));

        for(int i = 1; i <= N; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.print(result);


    }
}
