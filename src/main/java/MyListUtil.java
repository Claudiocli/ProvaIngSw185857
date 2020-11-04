import java.util.ArrayList;
import java.util.Comparator;

public class MyListUtil
{
	private ArrayList<Integer> list;

	public MyListUtil()	{
		list=new ArrayList<Integer>();
	}

	public ArrayList<Integer> getList()	{
		return list;
	}

/*
 *	Se crescente==true la lista verrà ordinata in maniera crescente
 *	e se, al contrario, crescente==false essa verrà ordinata in
 *	maniera decrescente
 */
	public void ordinaLista(boolean crescente)	{
		if (crescente)
			list.sort(new Comparator<Integer>()	{

				public int compare(Integer o1, Integer o2)
				{
					return (Integer.compare(o1, o2));
				}
			});
		else
			list.sort(new Comparator<Integer>()	{

				public int compare(Integer o1, Integer o2)
				{
					return (Integer.compare(o2, o1));
				}
			});
	}

}
