import java.util.*;
class Pract08
{
	public static void main(String[] args)
	{
		
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first Number");
            int a = sc.nextInt();
            System.out.println("Enter the Second Number");
            int b = sc.nextInt();

            int c = a/b;
            System.out.println(c);

        }catch(NumberFormatException e){
            System.out.println(e);
        }
        catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		// finally
		// {
		// 	System.out.println("1 try with multiple catch blocks");
		// }

		
	}
}

