/**
 * Prototype pattern comes into creational design pattern. As the name suggest
 * As the name state prototype meaning creating object from some  reference which we already have.
 * It is mainly useful when we have Object which is already created with costly operations at that time we keep that object after creation whenever we need
 * new object we simply clone object and tweak or do slight modification in the object and use it.
 * In addition to this it is useful when we want to hide the creation of object.
 * Here when we say cost of creation which means lets say your object got created by some database operations or io operation.
 *
 * In cloning its totally upto implementor whether we want to have shallow copy or depp copy while cloning.
 *
 * There are mainly three components involved in simple Prototype design pattern.
 * 1. Prototype : Type of class which has clone method and a super class of all prototypes.
 * 2. Sub-Classes - Which implements cloning.
 * 3. Client which uses this subclass and clone
 * In this additionally you can maintain registry which helps to give you specific prototype.
 * In our example lets say we have vehicle and which different types of vehicle , so you can store in
 * vehicle registry with different type of vehicles.
 * https://simpletechtalks.com/prototype-design-pattern/
 * http://www.jasondeoliveira.com/2011/05/tutorial-common-design-patterns-in-c-40_07.html
 * https://reactiveprogramming.io/blog/en/design-patterns/prototype
 */
public class Main {
}
