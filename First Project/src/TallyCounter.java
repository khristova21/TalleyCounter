/**
 * Krisi Hristova
 * Pd 6 
 * 
 */
public class TallyCounter
{
	
	//fields- declare instance variable and make it private
	
	private int count;
	
	
	
	//constructors- initialize fields
	
	public TallyCounter()
	{
		count = 0;
		
	}
	public TallyCounter(int a)
	{
		count = a;
	}
	
	
	//methods
	
	public void click()
	{
	 
		//count = count + 1;
		//                       OR   count +=1;
		
		count++; 
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void reset()
	{
		count = 0;
	}
	
	public void  unClick()
	{
		count = count - 1;
	}
	public String toString()
	{
		return "count: " + count;
		
	}
}
