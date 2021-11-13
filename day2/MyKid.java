package week1.day2;

public class MyKid {
	
    public static void main(String[] args) {
    	MyMobile mob = new MyMobile();
    	System.out.println(mob.brandname);
    	System.out.println(mob.price);
    	
    	mob.makeCall();
    	//mob.payBills(); //This is a private method
    	
   }
}
