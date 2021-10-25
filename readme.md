# 计201 2020310567
## 一、业务要求
&emsp;&emsp;求三维空间中两个给定点的距离。
## 二、解题思路
1. 设置一个类，表示每一个点的坐标。建立三个成员变量来存入三个坐标量。并设置构造函数，初始化三个坐标数值。
2. 设置方法，根据公式，计算两个点之间的距离。该方法通过引入两个对象作为变量的方式，在两个对象之间做运算。分别求出两个坐标的x,y,z之差，平方求和，开根号。并且使其输出运算结果。
3. 设置主函数，创建两个对象，并使用构造函数赋值。然后调用计算公式，计算并显示结果。 
## 三、关键代码
1. 设置成员变量，以及构造函数。
```java
public double x;
public double y;
public double z;
public Port(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
```
2. 设置方法，根据公式计算。
```java
    public static double distance(Port a,Port b){
        double x1=a.x-b.x;
        double y1=a.y-b.y;
        double z1=a.z-b.z;
        return Math.sqrt(x1*x1+y1*y1+z1*z1);
```
3. 输入两点的坐标
```java
    public static Port input(Scanner sc,String s) {
        System.out.println("请输入"+s+"X");
        double x=sc.nextDouble();
        System.out.println("请输入"+s+"Y");
        double y=sc.nextDouble();
        System.out.println("请输入"+s+"Z");
        double z=sc.nextDouble();
        return new Port(x,y,z);
    }
```
4. 设置主函数，初始化两个对象的成员变量，然后调用函数，计算求值，显示。
```java
  public static void main(String[] args){
        System.out.println("请输入2个点坐标");
        Scanner sc= new Scanner(System.in);
        Port c1=input(sc,"第一个坐标");
        Port c2=input(sc,"第二个坐标");
        double c3=distance(c1,c2);
        System.out.println("("+c1.x+","+c1.y+","+c1.z+")"+"("+c2.x+","+c2.y+","+c2.z+")"+"之间的距离为"+c3);
        }
```
