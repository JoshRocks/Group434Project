package lol.whocares.projectjust2test;


public class group
{
    
        public group()
        {}
    
	private String getJoshName()
	{
		return "Joshua Rockamore";
	}

	public String getGroupMembers() {
		String names = "";
		names = names + getJoshName() + "\n";
                //Add Your name methods here

		return names;
	}

	public int multiply(int num1, int num2)
	{
            int result = 0;
		for(int x = 0; x < num2; x++)
		{
			result = result + num1;
                        //System.out.println(result);
		}
            return result;
	}

	public int power(int num1, int num2)
	{
            int result = 1;
		for(int x = 0; x < num2; x++)
		{
			result = multiply(result, num1);
		}

		return result;
	}

	public int divide(int num1, int num2)
	{
            int result = 0;
            
		if(num2 == 0)
		{
			throw new ArithmeticException("The divisor is 0.");
		}
		
		int divisionCounter = 0;

		while(result < num1)
		{
			result = result + num2;
			divisionCounter++;
		}

		if(result == num1)
		{
			return divisionCounter;
		}
		else
		{
			throw new ArithmeticException("The result is not an integer.");
		}
		
	}
}
