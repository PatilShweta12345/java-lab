package LabTest;

public class Array {

	public static void main(String[] args) 
	{
		
	AndroidPhone[] obj = new AndroidPhone[3] ;
	
	obj[0] = new AndroidPhone(8,"Black");
	obj[1] = new AndroidPhone(6,"Blue");
	obj[2] = new AndroidPhone(4,"White");
	
	System.out.println("Redmi :");
	obj[0].display();
	System.out.println("Samsung:");
	obj[1].display();
	System.out.println("Oppo;");
	obj[2].display();
	}

}
