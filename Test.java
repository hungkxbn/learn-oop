
import  java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so SV");
        int N = scanner.nextInt();
        student[] cls = new student[N];
        for (int i = 0; i < N; ++i)
        {
            System.out.println("Nhap Sv thu " + (i + 1));
            System.out.println("Name: ");
            String name = scanner.next();
            System.out.println("Year: ");
            int year = scanner.nextInt();
            cls[i] = new student(year, name);
        }

        scanner.close();

        int total = 0;
        System.out.println("danh sach lop :");
        for (int i = 0; i < N; i++)
        {
            total += 2012 - cls[i].getYear();
            System.out.println(cls[i].getName());
        }
        System.out.println("Tong so tuoi: " + total);
    }
}