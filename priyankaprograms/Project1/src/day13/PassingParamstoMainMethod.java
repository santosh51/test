package day13;

public class PassingParamstoMainMethod {

	public static void main(String[] args) {
		System.out.println(args.length);//0
    
		for(String value:args)
		{
			System.out.println(value);
		}
	}

}
