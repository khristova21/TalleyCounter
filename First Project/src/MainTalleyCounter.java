/**
 * @author Krisi Hristova
 * To test the Tally Counter
 *
 */
public class MainTalleyCounter
{

	public static void main(String[] args) 
	{

		TallyCounter counter1 = new TallyCounter();
		TallyCounter counter2 = new TallyCounter(50);
		
		System.out.println(counter1.getCount());
		System.out.println(counter2.getCount());
		
		counter1.click();
		counter1.click();
		counter1.click();
		
		System.out.println(counter1.getCount());

		counter2.unClick();
		System.out.println(counter2.getCount());
		counter2.reset();
		System.out.println(counter2.getCount());
		
		System.out.println(counter1);
	}

}
