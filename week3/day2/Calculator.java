package week3.day2;

public class Calculator {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
public void add(int a, int b, int c) {
	System.out.println(a+b+c);
}
public void multiply(double a,double b) {
	System.out.println(a*b);
}
public void multiply(float a,float b) {
	System.out.println(a*b);
}
public static void main(String[] args) {
	Calculator c = new Calculator();
	c.add(10, 100);
	c.add(5, 6, 7);
	c.multiply(12.5d, 12.5d);
	c.multiply(9.5f, 8.5f);
}   
}
