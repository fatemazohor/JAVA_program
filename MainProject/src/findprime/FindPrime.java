/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findprime;

/**
 *
 * @author user
 */
public class FindPrime {
    public static String findPrimeNumber(int n) {
        String isprime = "";
        if (n > 1) {
            int count = 0;

            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    count += 1;
                }

            }
            if (count < 2) {
                isprime = (n + " is a prime number");

            } else {
                isprime = (n + " is not a prime number");

            }

        } else {
            System.out.println("0 & 1 are not prime number. Prime number start from 2.");
        }
        return isprime;

    }
}
