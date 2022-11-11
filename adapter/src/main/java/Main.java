/**
 * Adapter patterns comes under structural pattern as it deals with how classes are interacting.
 * As name suggests adapter pattern is used adapt two different incompatible system.
 *
 * Adapter pattern also helps and be connector between your system and some third party or legacy system.
 * For example your system expects data in one format to process and third party sends in one format.
 * Example : Consider you have to invoke some third party soap service which is xml base however your system is built on JSON
 * with some advanced fields at that time you create JSON-to-XML adapter which will help to interact with thirdparty.
 * Adapter pattern can be achieved in two ways :
 * 1. Class Level: class level mean to adapt something you are extending and doing inheritance of that class.
 * 2. Object level : Object level mean you keep has-a relationship with class rather doing tight coupling in system.
 *
 * One of the example is we know java supports both array and list to store data. Now you have legacy system
 * which is using array and you want to use collection functionalities to do so we have to convert, so Arrays.asList work as adaper
 * between array to list and then use collections.
 *
 * A java.io.InputStreamReader translates a byte stream into a character stream, and a java.io.OutputStreamWriter translates a character stream into a byte stream. These classes exemplify the Adapter pattern.
 * In particular, they change input/output stream interfaces to the required reader/writer interfaces
 * https://cecs.wright.edu/~tkprasad/courses/ceg860/paper/node26.html
 *
 * In this example we will see that Swiggy is selling food products now suddenly lockdown arise
 * and they thought to provide service of delivering grocery items for sometime so they write adapter which
 * helps them to convert similar to food item without touching their food delivery business.
 *
 * https://www.javadevjournal.com/java-design-patterns/adapter-design-pattern/
 *
 * Reference  : https://www.programmergirl.com/java-adapter-pattern/
 */
public class Main {
    public static void main(String[] args) {
        SwiggyStore swiggyStore = new SwiggyStore();
        swiggyStore.addItems(new FoodItem());
        swiggyStore.addItems(new FoodItem());
        //Adapter grocery which was incompatible with food.
        swiggyStore.addItems(new GroceryItemAdapter(new GroceryProduct()));
    }
}
