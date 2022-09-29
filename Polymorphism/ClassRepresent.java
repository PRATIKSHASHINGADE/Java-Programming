package polymorphism;

import java.util.Scanner;
public class ClassRepresent {

	Student name()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
		sc.close();
		
		if (name.equals("Pratiksha"))
		{
			return new Pratiksha();
		}
		
		else if (name.equals("Monika"))
		{
			return new Monika();
		}
		
		else if (name.equals("Swapnali"))
		{
			return new Swapnali();
		}
		
		return null;
	}
}