package inheritence.modle;

import java.util.ArrayList;

public class PBandJ extends Sandwich
{
	ArrayList<String> containsList;
	public PBandJ()
	{
		this.setNumberOfCalories(189);
		this.setMainIngrediant("Peanut Butter");
		this.setCold(true);
		containsList = new ArrayList<String>();
		setupContainsList();
		int Calories = getNumberOfCalories();
		int stars = 2;
	}
	private void setupContainsList()
	{
		containsList.add("Whole Wheat Bread");
		containsList.add("Peanut Butter");
		containsList.add("Grape Jelly");
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
