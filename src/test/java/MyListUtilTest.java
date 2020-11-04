import static org.junit.Assert.assertArrayEquals;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest
{

	private static MyListUtil l;
	private static Object[] arrayCrescente;
	private static Object[] arrayDecrescente;

	@BeforeClass
	public static void setup()	{
		l=new MyListUtil();
		arrayCrescente=new Object[5];
		arrayDecrescente=new Object[5];
		System.out.println("Tests started at:\n"+LocalDate.now()+" "
				+LocalTime.now());
	}

	@AfterClass
	public static void finish()	{
		System.out.println("Tests ended at:\n"+LocalDate.now()+" "
				+LocalTime.now());
	}

	@Before
	public void insertElemnts()	{
		for (int i=0; i<5; i++)
		{
			l.getList().add(i);
			arrayCrescente[i]=i;
			arrayDecrescente[i]=4-i;
		}
	}

	@After
	public void eraseElements()	{
		l.getList().clear();
	}

	@Test
	public void ordineCrescenteWorks()	{
		l.ordinaLista(true);
		assertArrayEquals(arrayCrescente, l.getList().toArray());
	}

	@Test
	public void ordineDecrescenteWorks()	{
		l.ordinaLista(false);
		assertArrayEquals(arrayDecrescente, l.getList().toArray());
	}

}
