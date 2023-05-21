package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0 ;
		int b= 1;
		int count = 10;
		int c;
		for (int i=2;i<count;++i)
		{
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}
		

	}

}
