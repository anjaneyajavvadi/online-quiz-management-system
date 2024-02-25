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
	public static boolean isValidPassword(String pwd)
	{
		if(pwd.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*#?&]{8,}$"))
		{
			return true;
		}
		return false;
	}
	public static boolean isValidMail(String mail)
	{
		if(mail.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"))
		{
			return true;
		}
		return false;
	}

}
