import java.io.*;
import java.util.Scanner;

public class FindDeviation
{	
	public static void main (String[] args) throws FileNotFoundException
	{
		Deviation output = new Deviation();
		File brrrat = new File("input.brrrat");
		if(brrrat.exists())
		{
			Scanner fileInput = new Scanner(brrrat);
			String input = fileInput.nextLine();
			Scanner scan = new Scanner(input);
			while(scan.hasNextInt())
			{
				output.addInteger(scan.nextInt());
			}
			System.out.println("The standard deviation of the set is: " + output.findStd());
			fileInput.close();
			scan.close();	
		}
		else	
		{
			System.out.print("Enter a list of integers separated by spaces: ");
			Scanner in = new Scanner(System.in);
			String input = in.nextLine();
			Scanner scan = new Scanner(input);
			while(scan.hasNextInt())
			{
				output.addInteger(scan.nextInt());
			}
			System.out.println("The standard deviation of the set is: " + output.findStd());
			in.close();
			scan.close();
		}
	}
}