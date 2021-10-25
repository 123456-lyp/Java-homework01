import java.util.Scanner;
//定义类点（x，y，z）;
public class Port {
    public double x;
    public double y;
    public double z;
    public Port(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    //定义类成员x,y,z;
    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x=x;
    }

    public double getY(){
        return y;
    }

    public double getZ(){
        return z;
    }


    //距离计算方法
    public static double distance(Port a,Port b){
        double x1=a.x-b.x;
        double y1=a.y-b.y;
        double z1=a.z-b.z;
        return Math.sqrt(x1*x1+y1*y1+z1*z1);
    }

    //输入两点的坐标
    public static Port input(Scanner sc,String s) {
        System.out.println("请输入"+s+"X");
        double x=sc.nextDouble();
        System.out.println("请输入"+s+"Y");
        double y=sc.nextDouble();
        System.out.println("请输入"+s+"Z");
        double z=sc.nextDouble();
        return new Port(x,y,z);
    }
    public static void main(String[] args){
        System.out.println("请输入2个点坐标");
        Scanner sc= new Scanner(System.in);
        Port c1=input(sc,"第一个坐标");
        Port c2=input(sc,"第二个坐标");
        double c3=distance(c1,c2);
        System.out.println("("+c1.x+","+c1.y+","+c1.z+")"+"("+c2.x+","+c2.y+","+c2.z+")"+"之间的距离为"+c3);
    }
}