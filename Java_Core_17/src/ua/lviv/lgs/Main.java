package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) 
	{
		Number[] array = {new Integer(1), 2, 3, 4, 7, 9, 13};
		
		Collection collection = new Collection(array);
		
		
		
		Iterator iterator = collection.createFirstFirst();
		System.out.println();
		while(iterator.hasNext())
		{
			Number number = iterator.next();
			if(number == null)
			{
				continue;
			}
			System.out.println(number);
		}
		
		iterator = collection.createFirstSecond();
		System.out.println();
		while(iterator.hasNext())
		{
			Number number = (Number) iterator.next();
			if(number == null)
			{
				continue;
			}
			System.out.println(number);
		}
		
		iterator = collection.createSecondFirst();
		System.out.println();
		while(iterator.hasNext())
		{
			Number number = (Number) iterator.next();
			if(number == null)
			{
				continue;
			}
			System.out.println(number);
		}
		
		iterator = collection.createSecondSecond();
		System.out.println();
		while(iterator.hasNext())
		{
			Number number = (Number) iterator.next();
			if(number == null)
			{
				continue;
			}
			System.out.println(number);
		}
		
		iterator = collection.createSecondThird();
		System.out.println();
		while(iterator.hasNext())
		{
			Number number = (Number) iterator.next();
			if(number == null)
			{
				continue;
			}
			System.out.println(number);
		}
	}

}
