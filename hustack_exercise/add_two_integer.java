package hustack_exercise;

import java.util.*;
import java.math.BigInteger;

public class add_two_integer {
    public static void main (String[] args)
    {
    Scanner sc = new Scanner(System.in);
    BigInteger a = sc.nextBigInteger();
    BigInteger b = sc.nextBigInteger();
    a = a.add(b);
    sc.close();
    System.out.println(a);
    }

}
