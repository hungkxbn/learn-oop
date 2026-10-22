import java.util.*;
public class C_k_n {
    static final long MOD = 1_000_000_007L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        long[][] a = new long[k + 1][n + 1];
        for (int i = 0; i <= k; i++) {
            for (int j = i; j <= n; j++) {
                if (i == 0 || i == j) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = (a[i][j - 1] + a[i - 1][j - 1]) % MOD;
                }
            }
        }
        System.out.println(a[k][n] % MOD);
    }
}