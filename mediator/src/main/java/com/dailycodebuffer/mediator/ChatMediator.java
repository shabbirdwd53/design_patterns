package com.dailycodebuffer.mediator;

/**
 * Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects.
 * The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.
 *
 * References: https://refactoring.guru/design-patterns/mediator
 *             https://www.digitalocean.com/community/tutorials/mediator-design-pattern-java
 */
public interface ChatMediator {
    public void sendMessage(String msg, User user);

    void addUser(User user);
}
