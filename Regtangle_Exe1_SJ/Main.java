import java.util.*;
import java.math.*;
class rectange
{
    private double width;
    private double height;
    private String color;
    public rectange(){
        this.width = 1;
        this.height = 1;
    }
    public rectange(double width, double height, String color)
    {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth()
    {
        return this.width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return this.height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double findArea()
    {
        return this.getHeight() * this.getWidth();
    }

    public double findPerimeter()
    {
        double height = this.getHeight();
        double width = this.getWidth();
        return Math.sqrt(height * height + width * width);
    }
}


public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap chieu dai: \n");
        double width = sc.nextDouble();
        System.out.printf("Nhap chieu rong: \n");
        double height = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Nhap mau sac: \n");
        String color = sc.nextLine();
        rectange r1 = new rectange(width, height, color);
        System.out.printf("Chieu dai = %f\n, Chieu rong = %f \n, Mau sac = %s \n", r1.getWidth(), r1.getHeight(), r1.getColor());
        System.out.printf("Dien tich = %f\n", r1.findArea());
        sc.close();

    }
}
