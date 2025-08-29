package day19;
//Upcasting-convert value from smaller---larger
//int---->long
//float--->double


//Downcasting-convert value from larger----smaller
//long--->int
//Double---->float

public class TypeCastingConcept {

	public static void main(String[] args) {
		//Upcasting-automatic----Smaller to larger
		
		/*int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);*/

		float floatvalue=10.5f;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		
		//Downcasting-convert value from larger----smaller
		
		/*long longvalue=10000;
		int intvalue=(int)longvalue;
		System.out.println(intvalue);*/
		
		/*double doublevalue=125.55f;
		float floatvalue=(float)doublevalue;
		System.out.println(float);*/
		
		//Example..1
		/*int i=100;
		double d=i;//upcasting
				System.out.println(d);*///100.0
			
	//Example..2
				double d=10.5;
				int i=(int)d;//downcasting
				System.out.println(i);
		
		
	}

}
