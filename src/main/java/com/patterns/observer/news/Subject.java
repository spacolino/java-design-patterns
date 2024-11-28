package com.patterns.observer.news;

public interface Subject {
    void registerObserver(Observer obj);
    void unregisterObserver(Observer obj);
    void notifyObservers();
}
