package gehihi_exercise;
import java.util.Scanner;
import java.util.ArrayList;

class Student{
    private String id;
    private String fullName;
    private  double gpa;

    Student(String id, String fullName, double gpa)
    {
        this.id = id;
        this.fullName = fullName;
        this.gpa = gpa;
    }
    public void normalizeName()
    {
        String[] words = fullName.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();


        for (String w : words)
        {
            if (w.isEmpty()) continue;
            sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1).toLowerCase()).append(" ");
        }

        fullName = sb.toString().trim();
    }
    public String getRank()
    {
        if (gpa >= 3.6) return "Xuat sac";
        else if (gpa < 3.6 && gpa >= 3.2) return "Gioi";
        else if (gpa < 3.2 && gpa >= 2.5) return "Kha";
        else return "Trung binh";
    }
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append("-").append(fullName).append("-").append(gpa).append("-").append(getRank());
        return sb.toString();
    }
}

public class Bai1 {
    public static void main(String[] args)
    {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine().trim());
        Student[] cls = new Student[N];
        for (int i = 0; i < N; i++)
        {
            String id = sc.nextLine().trim();
            String fullName = sc.nextLine().trim();
            double gpa = Double.parseDouble(sc.nextLine().trim());
            cls[i] = new Student(id, fullName, gpa);
            cls[i].normalizeName();
        }
        for (int i = 0; i < N; i++)
        {
            System.out.println(cls[i].toString());
        }
        sc.close();
    }
}

