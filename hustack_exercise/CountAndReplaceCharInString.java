import java.util.*;
public class CountAndReplaceCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine().trim();
        char t1 = sc.next().charAt(0);
        char r1 = sc.next().charAt(0);
        sc.close();
        //System.out.printf("%d %s %c %c", len, s, t1, r1);
        int mark = 0;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < len; i++)
        {
            if (sb.charAt(i) == t1)
            {
                mark++;

            }
        }
        for (int i = 0; i < len; i++)
        {
            if (sb.charAt(i) == t1)
            {
                sb.setCharAt(i, r1);

            }
        }
        s = sb.toString();
        System.out.printf("%d %s", mark, s);
    }
}
