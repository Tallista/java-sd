import java.util.*;
public class Deviation
{
	private ArrayList<Integer> numbers;
	private int count;
	
	public Deviation()
	{
		numbers = new ArrayList<Integer>();
		count = 0;
	}
	
	public void addInteger(int newNumber)
	{
		numbers.add(newNumber);
		count++;
	}
	public double findStd()
	{
		double sum = 0;
		double mean = 0;
		double deviation = 0;
		for(int i = 0; i < numbers.size(); i++)
			sum += numbers.get(i);
		mean = sum / count;
		for(int q = 0; q < numbers.size(); q++)
		{
			double difference = Math.abs(numbers.get(q) - mean);
			deviation += Math.pow(difference, 2);
		}
		deviation = Math.sqrt((deviation / count));
		return deviation;
	}
	
}