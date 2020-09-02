package animalKingdom;

public class Fish extends AbstractAnimal
{
	protected String name;
	protected int id;
	protected int yearNamed;

	public Fish(String name, int id, int yearNamed)
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
		return "swim";
	}

	@Override
	public String getBreath()
	{
		return "gills";
	}

	@Override
	public String getReproduce()
	{
		return "eggs";
	}

	@Override
    public String toString()
    {
    	return "Animals{id=" + id + ", name=" + name + ", yearNamed=" + yearNamed + "},";
    }

}