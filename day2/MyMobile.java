package week1.day2;

public class MyMobile {
	  String brandname = "1+";
      String modelname = "6T";
      int price = 40000;
      boolean isTouchscreen = true;
      
  	public static void makeCall() {
		System.out.println("This is the public method 1");
	}
  	
  	public void sendMsg() {
       System.out.println("This is the public method 2");
	}
      
  	private void payBills() {
       System.out.println("This is the private method");
	}
	public static void main(String[] args) {
      
		MyMobile mob = new MyMobile();
		System.out.println(mob.brandname);
		System.out.println(mob.isTouchscreen);
		mob.makeCall();
		mob.sendMsg();
        mob.payBills();
	}



}
