import java.util.Scanner;
public class print {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of m: ");
		// TODO Auto-generated method stub
		int m,n,x,y;
		 m= scanner.nextInt();
		 System.out.print("Enter the value of n: ");
		 n= scanner.nextInt();
		 
		for(x=1;x<=m;x++)
		{
			System.out.println(" ");
			for(y=1;y<=n;y=y+2)
			{
				System.out.print(y);
			}
		}

	}

}
