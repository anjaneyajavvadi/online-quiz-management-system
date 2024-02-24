package project;

public class InvalidExceptions {
	public static boolean isValidName(String name)
	{
		if(name.matches("^[a-zA-Z][a-zA-Z0-9_]*$"))
		{
			return true;
		}
		return false;
	}

}
