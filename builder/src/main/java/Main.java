/**
 * Builder pattern : It is creational design pattern used to create complex presentation of objects.
 * Let's say you have class which has initially 4 fields, so you decided to go with constructor then few more fields added
 * in same class which are optional and class modification goes on. So one choice is to have different args constructor.
 * That is good but till some extent how we will remember which argument number for what if list is so big!!!
 * Having this type of constructor is called as Telescoping constructor pattern where we keep having separate constructor as and when
 * we have new arguments.
 *
 * One more option is to use setters method but that has chances of missing pieces of some mandatory fields which leads to inconsistent object.
 *
 * By builder patter we take responsibility of creating object and providing back to client. Client just provides input and until
 * they won't call build method we won't create object.
 *
 * Builder pattern is also used when single class has different object representation  meaning let's say We are creating
 * Burger which can be Veg, non veg ... which can have extra cheese or less cheese, bread size medium , large.
 * As user, you will say only I need one extra cheese large veg burger.
 *
 * To do so you can also have different builders which eventually passes the argument which are required to create that object.
 *
 *
 * Reference : https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 * https://springframework.guru/gang-of-four-design-patterns/builder-pattern/
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        //Using builder we have created the object and we as implementer of builder pattern need to assure that this is not inconsistent object.
        Burger burger = new Burger.BurgerBuilder()
                .mayonese(true)
                .onion(false)
                .egg(false)
                .extraCheese(true)
                .size("LARGE")
                .build();

        //GOF Builder example
        Meal meal = new MealDirector(new VegMealBuilder()).prepareMeal();
    }
}
