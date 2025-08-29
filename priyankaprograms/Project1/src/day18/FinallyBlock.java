package day18;

public class FinallyBlock {

	public static void main(String[] args) {
		String s=null;

		try
		{
			System.out.println(s.length());
		}

		catch(NullPointerException e)
		{
			System.out.println(" catch block Handled exception....");
		System.out.println(e.getMessage());
		}
		finally {
			System.out.println("you entered into finally block....");
		}
		System.out.println("program finished....");
		}
		
	
}
