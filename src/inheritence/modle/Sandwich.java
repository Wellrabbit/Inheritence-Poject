package inheritence.modle;

public abstract class Sandwich
{
 private int numberOfCalories;
 private String mainIngredient;
 private boolean isCold;
 
public int getNumberOfCalories()
{
	return numberOfCalories;
}
public void setNumberOfCalories(int numberOfCalories)
{
	this.numberOfCalories = numberOfCalories;
}
public String getMainIngredient()
{
	return mainIngredient;
}
public void setMainIngrediant(String mainIngredient)
{
	this.mainIngredient = mainIngredient;
}
public boolean isCold()
{
	return isCold;
}
public void setCold(boolean isCold)
{
	this.isCold = isCold;
}
}
