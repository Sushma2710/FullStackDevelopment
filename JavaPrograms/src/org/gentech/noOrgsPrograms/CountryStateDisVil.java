package org.gentech.noOrgsPrograms;

class country
{
	String countryname;
	String Capital;
	country()
	{
		countryname="India";
		Capital="Delhi";
		System.out.println("countryname:"+countryname);
		System.out.println("Capital:"+Capital);
		System.out.println("+++++++++++");
	}
}
class State
{
	String StateName;
	String Statecapital;
	State()
	{
		StateName="karnataka";
		Statecapital="Bangalore";
		System.out.println("StateName:"+StateName);
		System.out.println("Statecapital:"+Statecapital);
		System.out.println("++++++++++++++");
		
	}
}
class District
{
	String DistrictName;
	String Thaluk;
	District()
	{
		DistrictName="Tumkur";
		Thaluk="magadi";
		System.out.println("DistrictName:"+DistrictName);
		System.out.println("Thaluk:"+Thaluk);
		System.out.println("+++++++++++");
	}
}
class Village
{
	String villageName;
	String obli;
	Village()
	{
		villageName="Durga";
	    obli="huliyurdurga";
	    System.out.println("villageName:"+villageName);
	    System.out.println("obli:"+obli);	
	}
}
	


public class CountryStateDisVil {

	public static void main(String[] args) {
		country c=new country();
		State  s=new  State();
		District d=new District();
		Village v=new Village();
	}

}
