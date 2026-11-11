import java.util.*;

interface BaoHiem
{
    public double tinhPhiBaoHiem();
}

abstract class PhuongTien
{
    protected String bienSo;
    protected String hangSanXuat;
    protected double giaGoc;

    public static final double GIA_TRAN = 50000000;

    public PhuongTien(String bienSo, String hangSanXuat, double giaGoc)
    {
        this.bienSo = bienSo;
        this.hangSanXuat = hangSanXuat;
        this.giaGoc = giaGoc;
    }


    public boolean capNhatGiaGoc(double giaMoi)
    {
        if (giaMoi > 0)
        {
            this.giaGoc = giaMoi;
            return true;
        }
        else
            return false;
    }

    public abstract double tinhGiaLanBanh();

    public void inTTin()
    {
        System.out.printf("Bien so: %s\n", this.bienSo);
        System.out.printf("Hang san xuat : %s\n", this.hangSanXuat);
        System.out.printf("Gia goc : %f\n", this.giaGoc);
    }
}

class XeMay extends PhuongTien implements BaoHiem
{
    private int congSuat;

    public XeMay(String bienSo, String hangSanXuat, double giaGoc, int congSuat)
    {
        super(bienSo, hangSanXuat, giaGoc);
        this.congSuat = congSuat;
    }

    public int getCongSuat()
    {
        return this.congSuat;
    }

    public double tinhPhiBaoHiem()
    {
        int cs = this.getCongSuat();
        double bh;
        if (cs > 175)
        {
            bh = this.giaGoc * 0.015;
        }
        else 
            bh = this.giaGoc * 0.005;
        return bh;
    }

    public double tinhGiaLanBanh()
    {
        double res;
        res = this.giaGoc + this.giaGoc* 0.05 + this.tinhPhiBaoHiem();
        return res;
    }

    public void inTTin()
    {
        System.out.printf("Bien so: %s\n", this.bienSo);
        System.out.printf("Hang san xuat : %s\n", this.hangSanXuat);
        System.out.printf("Gia goc : %f\n", this.giaGoc);
        System.out.printf("Cong suat : %d\n", this.getCongSuat());
        System.out.printf("Phi bao hiem: %f\n", this.tinhPhiBaoHiem());
        System.out.printf("Gia lan banh : %f\n", tinhGiaLanBanh());
    }

}

class Oto extends PhuongTien implements BaoHiem
{
    private int soChoNgoi;
    private double thueTieuThuDacBiet;

    public Oto(String bienSo, String hangSanXuat, double giaGoc, int soChoNgoi, double thueTTDB)
    {
        super(bienSo, hangSanXuat, giaGoc);
        this.soChoNgoi = soChoNgoi;
        this.thueTieuThuDacBiet = thueTTDB;
    }

    public int getSoChoNgoi()
    {
        return this.soChoNgoi;
    }

    public double getThueTTDB()
    {
        return this.thueTieuThuDacBiet;
    }

    public double tinhPhiBaoHiem()
    {
        double res;
        res = 0.02 * this.giaGoc + this.getSoChoNgoi() * 200000;
        return res;
    }

    public double tinhGiaLanBanh()
    {
        double res;
        res = this.giaGoc * ( 1 + this.getThueTTDB() ) + this.giaGoc * 0.1 + this.tinhPhiBaoHiem();
        return  res;
    }

    public void inTTin()
    {
        System.out.printf("Bien so: %s\n", this.bienSo);
        System.out.printf("Hang san xuat : %s\n", this.hangSanXuat);
        System.out.printf("Gia goc : %f\n", this.giaGoc);
        System.out.printf("So cho ngoi : %d\n", this.getSoChoNgoi());
        System.out.printf("Thue tieu thu dac biet : %f \n", this.getThueTTDB());
        System.out.printf("Phi bao hiem: %f\n", this.tinhPhiBaoHiem());
        System.out.printf("Gia lan banh : %f\n", tinhGiaLanBanh());
    }
}

class Showroom
{
    private String tenShowroom;
    int soLuongHienTai;
    public static final int SO_XE_MAX = 100;
    private PhuongTien[] dsPhuongTien;

    public Showroom(String tenShowroom)
    {
        this.tenShowroom = tenShowroom;
        this.soLuongHienTai = 0;
        this.dsPhuongTien = new PhuongTien[SO_XE_MAX];
    }

    public boolean themPhuongTien(PhuongTien pt)
    {
        if (this.soLuongHienTai < SO_XE_MAX)
        {
            this.dsPhuongTien[soLuongHienTai] = pt;
            return true;
        }
        else
            return false;
    }

    public PhuongTien xoaPhuongTien()
    {
        if (this.soLuongHienTai > 0)
        {
            PhuongTien xoa = dsPhuongTien[soLuongHienTai];
            this.soLuongHienTai--;
            return xoa;
        }
        else
            return null;
    }

    public void inTTin()
    {
        System.out.printf("Ten Showroom : %s\n", this.tenShowroom);
        System.out.printf("So luong xe hien tai : %d \n", this.soLuongHienTai);
        for (int i = 0; i < soLuongHienTai; i++)
        {
            dsPhuongTien[i].inTTin();
        }
    }
}

public class Main {
    
}
