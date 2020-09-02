package animalKingdom;

public class Mammals extends AbstractAnimal
{
	protected String name;
	protected int id;
	protected int yearNamed;

	public Mammals(String name, int id, int yearNamed)
	{

		this.name = name;
		this.id = id;
		this.yearNamed = yearNamed;

	}

	public String getName()
	{
		return name;
	}

	public int getId()
	{
		return id;
	}

	public int getYearNamed()
	{
		return yearNamed;
	}

	@Override
	public String getMove()
	{
		return "walk";
	}

	@Override
	public String getBreath()
	{
		return "lungs";
	}

	@Override
	public String getReproduce()
	{
		return "live births";
	}

	@Override
    public String toString()
    {
    	return "Animals{id=" + id + ", name=" + name + ", yearNamed=" + yearNamed + "},";
    }

}