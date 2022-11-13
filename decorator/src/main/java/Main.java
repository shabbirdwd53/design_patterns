import java.util.Collections;

/**
 * Decorator - It is a design pattern categorized in structural pattern. It helps to decorate the object meaning
 * It basically keeps expanding behaviour of the object.The decorator design pattern is used to change an object’s functionality during runtime.
 * Other instances of the same class will be unaffected, therefore each object will have its behavior changed.
 *
 * Since we can keep supporting adding new decorator we are getting dynamic object extension.
 * After all we are creating stack of wrapper , certain system becomes so coupled that it becomes difficult to
 * remove certain decorators.
 *
 * Inheritance also helps to expand the functionality but that is at compiletime not at runtime.
 * One of the best example of decorator is customized pizza. Where you have pizza and you have different decorator
 * like addExtraChese, cheeseburst, olives yes, jalepeno yes. We keep adding topups and we finally get pizza.
 *
 * You can also think of Account -> Saving Account -> Salary Account -> Preferred Account.
 * Where base is Account now based on different accounttype it keeps adding new features and offers to same account.
 * To achieve decorator pattern you need following:
 * Create Interface - Base product
 * Create abstract class - Base product's base impl
 * Abstract Decorator - which implements base product - This works as foundation of decorator what other decorator needs to do minimum.
 * Different decorators - Which takes this product input and decorate it.
 *
 * Java example : Collection.unmodifiableMap - this is decorator which is extending Map's functionality and
 * making unmodifiable.
 * https://cecs.wright.edu/~tkprasad/courses/ceg860/paper/node26.html
 *
 * More details  : https://www.javadevjournal.com/java-design-patterns/decorator-design-pattern/
 *
 */
public class Main {


    public static void main(String[] args) {
        // We got pizza with different topings , we can keep adding topings
        Pizza pizza = new JalepanoDecorator(new CheeseBurstDecorator(new BasePizza()));
        System.out.println(pizza.bake());
    }
}
