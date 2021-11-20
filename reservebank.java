
class ForsetAnimal
{
			void eat()
			{
				System.out.println("Eating");
				
			}
}
			interface Lion
			{
				public void show();
			}
		     interface Dog
			{
				public void display();
			}
}
public interface reservebank
{
 void money();
}
interface Sbi extends reservebank
{
	void bond();
}
class Sample implements reservebank
{

	public void money() 
	{
		System.out.println("Provide Loans and more services");
		
	}
	public void bond()
	{
		System.out.println("Provide Govt bonds for particular period only");
	}
public class BlueprintForestAnimal extends ForsetAnimal  implements Lion, Dog		
		{

			public void show()
			{
				System.out.println("Hunting");  
			}
			public void display()
			{
				System.out.println("Barking");
			}
			public static void main(String[] args)
			{
				BlueprintForestAnimal ba=new BlueprintForestAnimal();
				ba.display();
				ba.show();
				ba.eat();
				
			}

public static void main(String args[])
{
	
	 Sample s= new Sample();
	   s.money();
	   s.bond();
	
}
}
