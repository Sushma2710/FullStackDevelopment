package org.gentech.noOrgsPrograms;
 class TwoWheeler
 {
	 String Type;
	 int Mailage;
	 TwoWheeler()
	 {
		 Type="Bike";
		 Mailage=30;
		 System.out.println("Type:"+Type);
		 System.out.println("Mailage:"+Mailage);
		 System.out.println("++++++++++");
	 }
	 
 }
 class FourWheeler
 {
	 String Type;
	 int Mailage;
	 FourWheeler()
	 {
		 Type="Car";
		 Mailage=60;
		 System.out.println("Type:"+Type);
		 System.out.println("Mailage:"+Mailage);
		 System.out.println("++++++++++");
	 }
 }
 class HeavyVehical
 {
	 String Type;
	 int Mailage;
	 HeavyVehical()
	 {
		 Type="truck";
		Mailage=100;
		System.out.println("Type:"+Type);
		System.out.println("Mailage:"+Mailage);
	 }
 }

public class TwoFourHeavyVehicals {

	public static void main(String[] args) {
		TwoWheeler tw=new TwoWheeler();
		FourWheeler fw=new FourWheeler();
		HeavyVehical hv=new HeavyVehical();

	}

}
