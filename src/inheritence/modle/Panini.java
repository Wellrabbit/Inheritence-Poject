package inheritence.modle;

import java.util.ArrayList;

public class Panini extends Sandwich
{
	private ArrayList<String> containsList;
	public Panini()
	{
		this.setNumberOfCalories(576);
		this.setMainIngrediant("Chicken");
		this.setCold(false);
		containsList = new ArrayList<String>();
		setupContainsList();
		int Calories = getNumberOfCalories();
		int stars = 4;
	}
private void setupContainsList()
{
	containsList.add("Flat Bread");
	containsList.add("Cheddar Cheese");
	containsList.add("Turkey");
	containsList.add("Health Crap");
}
	@Override
	public boolean isCheesy()
	{
		boolean isCheesey = false;
		if(containsList.contains("Cheese"))
		{
			isCheesey = true;
		}
		return isCheesey;
	}

	@Override
	public boolean isSpicey()
	{
		boolean isSpicey = false;
		if(containsList.contains("Spice"))
		{
			isSpicey = true;
		}
		return isSpicey;
	}

	@Override
	public boolean isHealthy()
	{
		boolean isHealthy = false;
		if(containsList.contains("Health Crap"))
		{
			isHealthy = true;
		}
		return isHealthy;
	}

	@Override
	public int calorieCounter(int Calories)
	{
		return Calories;
	}

	@Override
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
