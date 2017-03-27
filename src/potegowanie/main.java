package potegowanie;
import java.util.Scanner;
	
public class main 
{
	public static void pot ()
	{
		  Scanner in = new Scanner(System.in);
		int x = in.nextInt(); // podstawa
		int y = in.nextInt(); //wykladnik	
		int w = 1; // wynik 
			for(int i = 1; i<=y;i++)
			{
				w = w*x;
				
			}
			System.out.println("wynik wynosi "+w);
	}
	public static void main( String args[])
	{
	
		  System.out.println("podaj podstawe i wykladnik");
		pot();
		
	}
	

}
