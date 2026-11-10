import java.util.*;

interface QuanLy {
    public static final double LUONG_MAX = 500000000;

    public abstract void tanHeSoLuong(double h);

    public abstract double tinhHoaHong();
}

abstract class NhanVien {
    private String tenNV;
    private double luongCB;
    private double heSoLuong;

    public NhanVien(String tenNV, double luongCB, double heSoLuong) {
        this.tenNV = tenNV;
        this.luongCB = luongCB;
        this.heSoLuong = heSoLuong;
    }

    protected abstract double tinhLuong();

    public void inTTin() {
        System.out.printf("tenNV: %s\n", tenNV);
        System.out.printf("luongCB: %f\n", luongCB);
        System.out.printf("heSoLuong: %f\n", heSoLuong);
    }

    // getter va setter
    public String getTenNV() {
        return tenNV;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public double getheSoLuong() {
        return heSoLuong;
    }

    protected void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

}

class GiamDoc extends NhanVien implements QuanLy {
    private double phuCap;
    public double loiNhuanCT;

    public GiamDoc(String tenNV, double luongCB, double heSoLuong, double phuCap, double loiNhuanCT) {
        super(tenNV, luongCB, heSoLuong);
        this.phuCap = phuCap;
        this.loiNhuanCT = loiNhuanCT;
    }

    public double tinhHoaHong() {
        return this.loiNhuanCT * 0.005;
    }

    public double tinhLuong() {
        return this.getLuongCB() * this.getheSoLuong() + this.phuCap + this.tinhHoaHong();
    }

    public void tanHeSoLuong(double h) {
        this.setHeSoLuong(this.getLuongCB() + h);
    }
}

class PhongBan {
    private String tenPhong;
    private ArrayList<NhanVien> dsnv;

    // constructor
    public PhongBan(String tenPhong) {
        this.tenPhong = tenPhong;
        this.dsnv = new ArrayList<>();
    }

    public boolean themNV(NhanVien nv) {
        if (nv != null) {
            dsnv.add(nv);
            return true;
        }
        return false;
    }

    public double tongLuong() {
        double tong = 0;
        for (NhanVien nv : dsnv) {
            tong += nv.tinhLuong();
        }
        return tong;
    }

    public void inTTin() {
        System.out.println("=== Phòng Ban: " + tenPhong + " ===");
        for (NhanVien nv : dsnv) {
            nv.inTTin();
        }
        System.out.println("Tổng lương phòng: " + tongLuong());
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soGD = sc.nextInt();
        sc.nextLine();
        GiamDoc gd[] = new GiamDoc[soGD];
        for (int i = 0; i < soGD; i++) {
            System.out.println("Nhap ten:");
            String ten = sc.nextLine();
            System.out.println("Nhap luong co ban:");
            double luongCB = sc.nextDouble();
            System.out.println("Nhap he so luong:");
            double heSoLuong = sc.nextDouble();
            System.out.println("Nhap phu cap:");
            double phuCap = sc.nextDouble();
            System.out.println("Nhap loi nhuan:");
            double loiNhuanCT = sc.nextDouble();
            sc.nextLine();
            gd[i] = new GiamDoc(ten, luongCB, heSoLuong, phuCap, loiNhuanCT);
            gd[i].inTTin();
        }
        sc.close();
    }

}
