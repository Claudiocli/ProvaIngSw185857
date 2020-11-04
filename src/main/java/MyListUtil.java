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
					if (o1.equals(o2))
						return 0;
					if (o1<o2)
						return 1;
					return -1;
				}
			});
	}

}
