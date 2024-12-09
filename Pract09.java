class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg)
	{
		super(msg);
	}
}
class Pract09
{
	void checkVote(int age)throws InvalidAgeException
	{
		if(age>=18)
		{
			System.out.println("eligible for vote");
		}
		else
		{
			throw new InvalidAgeException("not eligible for vote");
		}
	}
	public static void main(String[] args)throws InvalidAgeException

	{
		Pract09 d1=new Pract09();
		d1.checkVote(2);
	}
}
