import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public static int[][] primeFactorization(int n) {
        if(n <= 1) {
            throw new IllegalArgumentException();
        }
        List<int[]> primes = new ArrayList<int[]>();
        int end = (int)Math.sqrt(n) + 1;
        for(int p=2; p<=end && p <= n; p++) {
            if(n%p == 0) {
                int count = 0;
                while(n%p == 0) {
                    count++;
                    n /= p;
                }
                primes.add(new int[]{p, count});
            }
        }
        if(n != 1) {
            primes.add(new int[]{n, 1});
        }
        return primes.toArray(new int[0][]);
    }

    public static int gcd(int n1, int n2) {
        if(n1 <= 0 || n2 <= 0) {
            throw new IllegalArgumentException();
        }
        while(n2 != 0) {
            int r = n1 % n2;
            n1 = n2;
            n2 = r;
        }
        return n1;
    }

    public static int lcm(int n1, int n2) {
        int gcd = gcd(n1, n2);
        return (n1 / gcd) * n2;
    }
}
