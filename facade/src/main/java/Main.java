/**
 * Facade pattern : This is also a structural pattern where it defines how classes needs to be structured in a way that
 * for complex functionalities there is single entry point to that function.
 * We should use facade pattern when we have complex subsystems , calling each leads to a single operation for client.
 * In this case we should introduce facade which helps to do interaction with all this subsystem and gives us single output,
 * Facade pattern basically adds one level of abstractions in the system.
 *
 * To implement facade you have to write one class which interacts with other services in down stream.
 *
 * Consider example you have to place order in the zomato and you want to get food
 * 1. Customer sees menu and place order
 * 2. Restaurant got this order and prepare order
 * 3. Delivery team assigns delivery person
 * 4. Delivery boy picks up order and deliver.
 *
 * Here Zomato api is facade for us where we just clicked place order and it done. Think to get food
 * after placing order you have to call restaurant to prepare order and give it to delivery boy.
 *
 * https://www.decipherzone.com/blog-detail/facade-design-pattern
 */
public class Main {

}
