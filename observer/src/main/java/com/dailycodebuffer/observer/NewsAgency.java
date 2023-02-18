package com.dailycodebuffer.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple
 * objects about any events that happen to the object they’re observing.
 *
 * Reference: https://refactoring.guru/design-patterns/observer
 *            https://www.baeldung.com/java-observer-pattern
 *
 */
public class NewsAgency {
    private String news;
    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for (Channel channel : this.channels) {
            channel.update(this.news);
        }
    }
}
