package animalKingdom;

abstract class AbstractAnimal
{
	protected String name;
	protected int id;
	protected int yearNamed;

	abstract String getMove();
	abstract String getBreath();
	abstract String getReproduce();

	String getName()
	{
		return name;
	}

	int getId()
	{
		return id;
	}

	int getYearNamed()
	{
		return yearNamed;
	}


}