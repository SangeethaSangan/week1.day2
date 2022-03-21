package week1.day2assign;

public class Calculator {

	public int addNum(int num1,int num2,int num3) {
		// TODO Auto-generated method stub
		int sum=num1+num2+num3;
		return sum;

	}
	public int subNum(int num1,int num2) {
		// TODO Auto-generated method stub
		int sub=num1-num2;
		return sub;

	}
	public double mulNum(double num1,double num2) {
		// TODO Auto-generated method stub
		double mul=num1*num2;
		return mul;

	}
	
	public float divNum(float num1,float num2) {
		// TODO Auto-generated method stub
		float div=num1*num2;
		return div;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Calculator cal=new Calculator();
    System.out.println(cal.addNum(2, 3, 5));
    System.out.println(cal.subNum(10, 5));
    System.out.println(cal.mulNum(100, 5));
    System.out.println(cal.divNum(10.5f, 7f));
	}

}
