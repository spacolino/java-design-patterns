package com.patterns.observer.news;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private String news;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregisterObserver(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer obj : observers) {
            obj.update(news);
        }
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }
}
