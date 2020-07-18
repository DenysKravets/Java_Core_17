package ua.lviv.lgs;

public class Collection 
{

	private static Number[] array;
	
	Collection(Number[] number)
	{
		array = number;
	}

	private class Forward implements Iterator
	{
		private int counter = 0;
		
		@Override
		public boolean hasNext() 
		{
			return counter < array.length;
		}

		@Override
		public Number next() 
		{
			return array[counter++];
		}
	}
	
	public Forward createForward()
	{
		return new Forward();
	}
	
	private class Backward  implements Iterator
	{
		private int counter = array.length - 1;
		
		@Override
		public boolean hasNext() 
		{
			return counter >= 0;
		}

		@Override
		public Number next() 
		{
			return array[counter--];
		}
	}
	
	public Backward createBackward()
	{
		return new Backward();
	}
	
	//First task
	private class FirstTaskFirstClass implements Iterator
	{
		private int counter = 0;
		
		@Override
		public boolean hasNext() 
		{
			return counter < array.length;
		}

		@Override
		public Number next() 
		{
			if((int) array[counter] % 2 == 0)
			{
				return array[counter++];
			}
			
			counter++;
			return 0;
		}
	}
	
	public FirstTaskFirstClass createFirstFirst()
	{
		return new FirstTaskFirstClass();
	}
	
	private class FirstTaskSecondClass implements Iterator
	{
		private int counter = 0;
		
		@Override
		public boolean hasNext() 
		{
			return counter < array.length;
		}

		@Override
		public Number next() 
		{
			Number value = array[counter];
			counter += 2;
			return value;
		}
	}
	
	public FirstTaskSecondClass createFirstSecond()
	{
		return new FirstTaskSecondClass();
	}
	
	//Second task
	public Iterator createSecondFirst()
	{
		return new Iterator()
				{

					private int counter = array.length - 1;
					private int counter3 = 1;
					
					@Override
					public boolean hasNext() 
					{
						return counter >= 0;
					}
		
					@Override
					public Number next() 
					{
						if(counter3 == 3)
						{
							counter3 = 1;
							if(!((int) array[counter] % 2 == 0))
							{
								return array[counter--];
							}
							
							
							counter--;
							return null;
						}
						counter--;
						counter3++;
						
						return null;
					}
			
				};
	}
	
	public Iterator createSecondSecond()
	{
		class SecondTaskSecondClass implements Iterator
		{

			private int counter = 0;
			private int counter3 = 1;
			
			@Override
			public boolean hasNext() 
			{
				return counter < array.length;
			}

			@Override
			public Number next() 
			{
				if(counter3 == 5)
				{
					counter3 = 1;
					if(!((int) array[counter] % 2 == 0))
					{
						return (int) array[counter++] - 100;
					}
					
					
					counter++;
					return null;
				}
				counter++;
				counter3++;
				
				return null;
			}
	
		}
		
		return new SecondTaskSecondClass();
	}
	
	static class SecondTaskThirdClass implements Iterator
	{

		private int counter = 0;
		private int counter3 = 1;
		
		@Override
		public boolean hasNext() 
		{
			return counter < array.length;
		}

		@Override
		public Number next() 
		{
			if(counter3 == 2)
			{
				counter3 = 1;
				if((int) array[counter] % 2 == 0)
				{
					return (int) array[counter++] + 1;
				}
				
				
				counter++;
				return null;
			}
			counter++;
			counter3++;
			
			return null;
		}
	}
	
	public Iterator createSecondThird()
	{
		return new SecondTaskThirdClass();
	}
	
}
