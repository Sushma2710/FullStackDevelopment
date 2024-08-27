package com.gentech.constructor;

class user
{
	user(String Username)
	{
		System.out.println("Username:"+Username);
	}

    user(int Rollno)
	{
	    System.out.println("Rollnumber of user:"+Rollno);	
	}
    user(float userID)
    {
    	System.out.println("userID:"+userID);
    }
    user(double birthdate)
    {
    	System.out.println("Date of birth:"+birthdate);
    }
}

public class UserProfile {

	public static void main(String[] args) {
		
		user u1 =new user("kumar");
		user u2=new user(45);
		user u3=new user(24.22f);
		user u4=new user(54.25);
	}

}
