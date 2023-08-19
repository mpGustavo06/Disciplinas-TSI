package refactor;

import java.io.PrintStream;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        
        
        int j, n, a1, an, r, t, s;
        
        PrintStream w = System.out;
        Scanner sc = new Scanner(System.in);
        
        do {
            w.println("Enter the number of terms in the AP: ");
            n = sc.nextInt();
        } while (n < 2);
        do {
            w.println("Enter the number of terms in the AP: ");
            a1 = sc.nextInt();
        } while (a1 < 1);
        do {
            w.println("Enter the number of terms in the AP: ");
            r = sc.nextInt();
        } while (r < 1);

        
        an = a1 + (n - 1) * r;

        s = ((a1 + an) * n) / 2;

        for (j = 1; j <= n; j++) {
            t = a1 + (j - 1) * r;

            w.printf("a%d = %d\n", j, t);
        }

        w.printf("A soma é: %d\n", s);
    }
}
