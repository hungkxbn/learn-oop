public class NhanVien
{
    private String name;
    private double luongCoBan;
    private double heSoLuong;

    public NhanVien(String name, double luongCoBan, double heSoLuong)
    {
        this.name = name;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public String getName()
    {
        return name;
    }
    public double getLuongCoBan()
    {
        return luongCoBan;
    }

    public double getHeSoLuong()
    {
        return heSoLuong;
    }

    public void setName(String ten)
    {
        name = ten;
    }

    public void setLuongCoBan(double l)
    {
        luongCoBan = l;
    }

    public void setHeSoLuong(double hs)
    {
        heSoLuong = hs;
    }

    public boolean tangLuong(double t)
    {
        heSoLuong = t;
        return true;
    }

    public double tinhLuong()
    {
        return luongCoBan * heSoLuong;
    }

    public void inTTin()
    {
        System.out.println("TenNhanVien: " + name);
        System.out.println("LuongCoBan: " + luongCoBan);
        System.out.println("HeSoLuong: " + heSoLuong);
        System.out.println("Luong: " + tinhLuong());
    }

    public static void main(String[] args)
    {
        NhanVien t = new NhanVien("hung", 0.6, 3000);
        inTTin();
    }


}