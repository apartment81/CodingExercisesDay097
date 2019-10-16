package ro.mirodone;

import java.util.Arrays;

public class KPrimes {


    void printKPFNums(int a, int b, int k) {

        //count prime factors of all numbers until b

        boolean prime[] = new boolean[b + 1];

        Arrays.fill(prime, true);

        int p_factors[] = new int[b + 1];

        Arrays.fill(p_factors, 0);

        for (int p = 2; p <= b; p++)
            if (p_factors[p] == 0)
                for (int i = p; i <= b; i = i + p)
                    p_factors[i]++;

        // print all numbers with k prime factors
        for (int i = a; i <= b; i++)
            if (p_factors[i] == k)
                System.out.println(i + " ");


    }

}
