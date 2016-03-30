package inheritence.modle;

import java.util.ArrayList;

public class PhillyCheeseSteak extends Sandwich
{
	ArrayList<String> containsList;
	public PhillyCheeseSteak()
	{
		this.setNumberOfCalories(900);
		this.setMainIngrediant("Beef Steak");
		this.setCold(false);
		containsList = new ArrayList<String>();
		setupContainsList();
		int Calories = getNumberOfCalories();
		int stars = 4;
	}
	private void setupContainsList()
	{
		containsList.add("Sour dough bun");
		containsList.add("Spice Beef Tips");
		containsList.add("Swiss Cheese");
		
	}

	public boolean isCheesy()
	{
		boolean isCheesey = false;
		if(containsList.contains("Cheese"))
		{
			isCheesey = true;
		}
		return isCheesey;
	}


	public boolean isSpicey()
	{
		boolean isSpicey = false;
		if(containsList.contains("Spice"))
		{
			isSpicey = true;
		}
		return isSpicey;
	}


	public boolean isHealthy()
	{
		boolean isHealthy = false;
		if(containsList.contains("Health Crap"))
		{
			isHealthy = true;
		}
		return isHealthy;
	}

	
	public int calorieCounter(int Calories)
	{
		return Calories;
	}


	public int isDelicious(int stars)
	{
	return stars * 2;	
	}

	public ArrayList<String> getContainsList()
	{
		return containsList;
	}

	public void setContainsList(ArrayList<String> containsList)
	{
		this.containsList = containsList;
	}
}
