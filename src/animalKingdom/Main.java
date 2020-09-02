package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main
{
	private static List<AbstractAnimal> filterAnimal(List<AbstractAnimal> animals, CheckAnimal tester)
	{
		List<AbstractAnimal> tempList = new ArrayList<>();

		for (AbstractAnimal v : animals)
		{
			if (tester.test(v))
			{
				tempList.add(v);
			}
		}

		return tempList;
	}


	public static void main(String [] args)
	{
		System.out.println("Welcome to the Animal Kingdom!!!");

		Mammals panda = new Mammals("Panda", 0, 1869);
		Mammals zebra = new Mammals("Zebra", 1, 1778);
		Mammals koala = new Mammals("Koala", 2, 1816);
		Mammals sloth = new Mammals("Sloth", 3, 1804);
		Mammals armadillo = new Mammals("Armadillo", 4, 1758);
		Mammals racoon = new Mammals("Racoon", 5, 1758);
		Mammals bigfoot = new Mammals("Bigfoot", 6, 2021);

		Birds pigeon = new Birds("Pigeon", 7, 1837);
		Birds peacock = new Birds("Peacock", 8, 1821);
		Birds toucan = new Birds("Toucan", 9, 1758);
		Birds parrot = new Birds("Parrot", 10, 1824);
		Birds swan = new Birds("Swan", 11, 1758);

		Fish salmon = new Fish("Salmon", 12, 1758);
		Fish catfish = new Fish("Catfish", 13, 1817);
		Fish perch = new Fish("Perch", 14, 1758);

		List<AbstractAnimal> myList = new ArrayList<>();
		myList.add(panda);
		myList.add(zebra);
		myList.add(koala);
		myList.add(sloth);
		myList.add(armadillo);
		myList.add(racoon);
		myList.add(bigfoot);
		myList.add(pigeon);
		myList.add(peacock);
		myList.add(toucan);
		myList.add(parrot);
		myList.add(swan);
		myList.add(salmon);
		myList.add(catfish);
		myList.add(perch);







		System.out.println();
	    System.out.println("\n*** MVP ***");
	   	System.out.println();


	    // Lambda Expression

	   	System.out.println("\n*** List all the animals in descending order by year named ***");
	    myList.sort((v1, v2) -> v2.getYearNamed() - v1.getYearNamed());
	    myList.forEach((v) -> System.out.println(v));

	    System.out.println("\n*** List all the animals alphabetically ***");
	    myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
	    myList.forEach((v) -> System.out.println(v));

	    System.out.println("\n*** List all the animals order by how they move ***");
	    myList.sort((v1, v2) -> v1.getMove().compareToIgnoreCase(v2.getMove()));
	    myList.forEach((v) -> System.out.println(v));

	    System.out.println("\n*** List only those animals the breath with lungs ***");
	    List<AbstractAnimal> filteredList = filterAnimal(myList, v -> v.getBreath() == "lungs");
		filteredList.forEach((v) -> System.out.println(v.getName() + " " + v.getReproduce() + " " + v.getMove() + " " + v.getBreath() + " " + v.getYearNamed()));

		System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
		filteredList = filterAnimal(myList, v -> (v.getBreath() == "lungs") && (v.getYearNamed() == 1758));
		filteredList.forEach((v) -> System.out.println(v.getName() + " " + v.getReproduce() + " " + v.getMove() + " " + v.getBreath() + " " + v.getYearNamed()));

		System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
		filteredList = filterAnimal(myList, v -> (v.getBreath() == "lungs") && (v.getReproduce() == "eggs"));
		filteredList.forEach((v) -> System.out.println(v.getName() + " " + v.getReproduce() + " " + v.getMove() + " " + v.getBreath() + " " + v.getYearNamed()));
		
		System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
	    filteredList = filterAnimal(myList, v -> v.getYearNamed() == 1758);
	    filteredList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
		filteredList.forEach((v) -> System.out.println(v.getName() + " " + v.getReproduce() + " " + v.getMove() + " " + v.getBreath() + " " + v.getYearNamed()));

		System.out.println("\n*** Stretch Goals ***");
		
	   	System.out.println("\n*** For the list of animals, list alphabetically those animals that are mammals ***");
	   	filteredList = filterAnimal(myList, v -> (v instanceof Mammals));
	   	filteredList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
	   	filteredList.forEach((v) -> System.out.println(v.getName() + " " + v.getReproduce() + " " + v.getMove() + " " + v.getBreath() + " " + v.getYearNamed()));






	}
}













