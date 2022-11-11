
public class TryToParseString {

	public static void main(String[] args) {
		
		String input = "not an integer";
		int newInt = 0;
		
		
		try{
			
			newInt = Integer.parseInt(input);
			
		}
		
		
		catch(NumberFormatException e) {
			
			System.out.print("Input is not an integer.");

		}
		
		
	}

}
