package com.fzl.java;

public class text3 {
	static final float PI = 3.14f;
	static int age = 26;
static String a = "你好";
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
 String b = "星期一";
System.out.println(a);
System.out.println(b);
byte c = 124;
short d = 32564;
int e = 45784612;
long f = 46789451;
float g = 45.56f;
double h = 45.56;
long i = c+d+e+f;
System.out.println("结果为：" + i);
char a1 = 10, a2 = '*';
System.out.println((int)a1);
System.out.println((int)a2);
int p1 = 50, p2 = 99; 
System.out.println((char) p1);
System.out.println((char) p2);
boolean a3 =false;
System.out.println(a3);



final int number;
number = 1234;
age = 22;
// number = 1236;
 //错误的代码，因为number为常量，只能进行一次赋值
//PI = 3.15f;//常量不能被改变
System.out.println(number);
System.out.println(age);
System.out.println(PI);




int a5, b5, c5;
a5 = 16;
c5 = a5 + 4;
b5 = a5 + 20;
System.out.println(c5);
System.out.println(b5);


float number1 = 4.14f;
int number2 = 2222;
System.out.println(number1+number2);
System.out.println(number1*number2);
System.out.println(number1-number2);
System.out.println(number1/number2);




int a6 = 3;
int b6 = 6;
boolean result1 = ((a6 != b6) && (a6 < b6));
boolean result2 = ((a6 != b6) && (a6 > b6));
System.out.println(result1);
System.out.println(result2);





System.out.println(c+g);
System.out.println(c*e);
System.out.println(c/a1);
System.out.println(a1+h);



long mylong = 45789;
short myshort = 32564;
byte mybyte1 = 123;
int myint1 = (int) mylong;
int myint2 =  myshort;
int myint3 = (int) mybyte1;
System.out.println(myint1);
System.out.println(myint2);
System.out.println(myint3);


long a10 =1000;
byte a11 = (byte) a10;
System.out.println(a11);
	}

}
