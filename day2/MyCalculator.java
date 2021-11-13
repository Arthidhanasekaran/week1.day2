package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int sum = cal.add(10, 20, 30);
		System.out.println(sum);
		int sub = cal.sub(50, 30);
		System.out.println(sub);
		double mul = cal.mul(15, 25);
		System.out.println(mul);
		float div = cal.divide(35, 5);
		System.out.println(div);		
	}
	
	

}
