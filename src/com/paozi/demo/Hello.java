package com.paozi.demo;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;   //计算有误差

        System.out.println(x);
        System.out.println(y);

        int n = 5;
        // 参与计算的 24.0 / n  其中n是整数 则自动提升类型为浮点型 24.0 / 5.0 = 4.8
        double m = 1.2 + 24.0 / n;
        System.out.println(m);

        int n1 = 'A';
        char c3 = '\u0041';

        System.out.println(n1);
        System.out.println(c3);


        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t); // t是"hello"还是"world"?s

        //

        String[] names = {"ABC", "XYZ", "zoo"};
        String sn = names[1];
        names[1] = "cat";
        System.out.println(sn);

    }
}
