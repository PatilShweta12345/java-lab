package labtest;

public class SplitMethod {

	public static void main(String[] args) 
	{
		String str = "Coffee";
		String[] splits = str.split("//s");
		
		for(String splits2: splits)
		{
			System.out.println(splits2);
		}
		
	}

}
