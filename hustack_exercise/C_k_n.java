package hustack_exercise;
import java.util.*;
import java.math.BigInteger;

public class C_k_n {
    public static void main(String[] args)
    {
        int k, n;
        Scanner sc = new Scanner();
        k = sc.nextInt();
        n = sc.nextInt();
        int[][] a = new int[k+1][n+1];
        a[0][0] = 1;
        for (int i = 0; i <= k; i++)
        {
            for (int j = 0; j <= n && j >= i; j++)
            {
                if (i == 0) 
                {
                    a[i][j] = 1;
                    continue;
                }
                if (i == j) 
                {
                    a[i][j] = 1;
                    continue;
                }
                a[i][j] = a[i][j-1] + a[i-1][j-1];
                
            }
        }
        sc.close();
        System.out.println(a[k][n]);
    }
}
