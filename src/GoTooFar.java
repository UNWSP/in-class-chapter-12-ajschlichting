
public class GoTooFar {

	public static void main(String[] args) throws NumberFormatException{
		
		int array[] = {1,2,3,4,5};
		
		
		try {
			for(int i=0; i<=7;i++)
			{
				System.out.print(array[i] + " ");
			}
			
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.print("Now you've gone too far.");
			
		}

		
		
	}

}
