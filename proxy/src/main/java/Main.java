/**
 * Proxy pattern : Proxy pattern is structural pattern. We use proxy when we don't want to expose real object and provide proxy object to deal with.
 * Many times when you are dealing with remote servers and do lookup from the naming server it provides you proxy object from remote server not actual one.
 * Even in hibernate if remember we have concept of lazy loading where whenever we load data from db we get proxy object of
 * database and return it however if we get it then only it gets loaded from database. This is one of the best example of proxy object.
 *
 * Another example can be Spring AOP where AOP objects are proxy and treated on advice aspects.
 *
 * Different type of proxies are :
 * 1. Remote proxy : When you are dealing with remote system , you require remote object to interact with the system. Usually in past it get used in ejb where beans gets created in container
 * and client gets object using JNDI system.
 * 2. Virtual proxy :Delay the object creation until it is required, as explained hibernate uses this.
 * 3. Protection proxy : this proxy is used when we are dealing with security system where before invoking system implementation we want to check access.
 * 4. Snart proxy - Perform some additional steps before accessing object.
 *
 * Proxy pattern has mainly three components :
 * 1. A common interface
 * 2. Real Class
 * 3. Proxy class - this uses the realclass and it is proxy of real class.
 *
 * https://www.javadevjournal.com/java-design-patterns/proxy-design-pattern/
 * Example consider as Bank Account and ATM where to operate your bank account you have ATM which is proxy of doing process in bank account.
 *
 */
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.withdraw();
    }
}
