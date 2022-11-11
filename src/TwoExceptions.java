

public class TwoExceptions {

	public static void main(String[] args) {
		
		
		String input = "13 characters";
	
		
		try{
			
	        char newChar = input.charAt(13);

	        int i = 10/0;
			
		}
		
		
		catch(StringIndexOutOfBoundsException  e) {
			
			System.out.print("ERROR: Index is out of range.");

		}
		
		
		catch(ArithmeticException e) {
			
			System.out.print("ERROR: Cannot divide by zero.");

		}
		
		finally {
			System.out.println("\nFinally");
		}
		
		
		
	}

}
