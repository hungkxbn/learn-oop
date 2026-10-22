
import java.util.*;

public class ConcatString { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len1 = sc.nextInt();
        String s1 = sc.next();
        int len2 = sc.nextInt();
        String s2 = sc.next();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < t1; i++)
        {
            s.append(s1);
        }
        for (int i = 0; i < t2; i++)
        {
            s.append(s2);
        }
        sc.close();
        String ans = s.toString();
        System.out.println(ans);

    }
}