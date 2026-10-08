import java.util.Scanner;;

public class TestNV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien : ");
        int N = scanner.nextInt();
        NhanVien[] cls = new NhanVien[N];
        for (int i = 0; i < N; i++)
        {
            String temp = null;
            double hs = 0;
            double lcb = 0;
            cls[i] = new NhanVien(temp, hs, lcb);
            System.out.println("TenNhanVien ");
            temp = scanner.next();
            cls[i].setName(temp);
            System.out.println("He so luong");
            hs = scanner.nextDouble();
            cls[i].setHeSoLuong(hs);
            System.out.println("Luong co ban ");
            lcb = scanner.nextDouble();
            cls[i].setLuongCoBan(lcb);
        }
        scanner.close();
        for (int i = 0; i < N; i++)
        {
            cls[i].inTTin();
        }
    }
}
