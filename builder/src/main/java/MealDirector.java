//Client will interact with this director which helps to provide the meal.
//Note that we can have this as per our choice there is no standard way , we can also have two different method getVegMeal and getNonVegMeal
// Which will use the builders directly inside the method , in this example we are taking input which builder which type of builder needing.
public class MealDirector {
    private MealBuilder mealBuilder;
    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }
    public Meal prepareMeal() {
        mealBuilder.addBread();
        mealBuilder.addBriyani();
        mealBuilder.addCurry();
        mealBuilder.addColdDrink();
        return mealBuilder.build();
    }
}
