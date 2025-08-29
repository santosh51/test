package day7;

public class Findhowmanyduplicateinarray {

	public static void main(String[] args) {
		int a[]= {100,200,100,300,100,400,100};
		int num=100;
		int count=0;
		
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]==100) {
				count++;
			}
		}
		System.out.println(count);*/
		
		for(int value:a) {
		
		if(value==num) {
			count++;   //1 2 3
			
		}
	}
System.out.println(count);

	}
}
