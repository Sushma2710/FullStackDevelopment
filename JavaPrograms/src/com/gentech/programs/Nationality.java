package com.gentech.programs;

class country
{
	String countryName;
	String Capital;
}
class State
{
	String StateName;
	String StateCapital;
}
class District
{
	String DistrictName;
	String Thaluk;
}
class village
{
	String VillageName;
	String obli;
}

public class Nationality {

	public static void main(String[] args) {
		 
		country obj1= new country();
		obj1.countryName="India";
	    obj1.Capital="Delhi";
	    System.out.println("countryName="+obj1.countryName);
	    System.out.println("Capital name=" +obj1.Capital);
	    
	    System.out.println("++++++++++");
	     
	     State obj2= new State ();
		obj2.StateName="karnataka";
	    obj2.StateCapital="Bengaluru";
	    System.out.println("StateName="+obj2.StateName);
	    System.out.println("Statecapital="+obj2.StateCapital);
	    
	    System.out.println("++++++++++");
	    
	    District obj3= new District ();
		obj3.DistrictName="Durga";
	    obj3.Thaluk="magadi";
	    System.out.println("DistrictName="+obj3.DistrictName);
	    System.out.println("thaluk="+obj3.Thaluk);
	    
	    System.out.println("++++++++++");
	    
	    village obj4= new village ();
		obj4.VillageName="Durga";
	    obj4.obli="magadi";
	    System.out.println("VillageName=" +obj4.VillageName);
	    System.out.println("obli=" +obj4.obli);
	    
	    


	}

}
