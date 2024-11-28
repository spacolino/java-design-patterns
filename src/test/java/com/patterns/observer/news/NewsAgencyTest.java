package com.patterns.observer.news;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NewsAgencyTest {

    @Test
    void shouldNotifyAllObservers() {
        // Given
        NewsAgency newsAgency = new NewsAgency();
        TestNewsChannel channel1 = new TestNewsChannel("Channel 1");
        TestNewsChannel channel2 = new TestNewsChannel("Channel 2");

        newsAgency.registerObserver(channel1);
        newsAgency.registerObserver(channel2);

        // When
        String news = "Breaking News!";
        newsAgency.setNews(news);

        // Then
        assertTrue(channel1.getLastNews().contains(news));
        assertTrue(channel2.getLastNews().contains(news));
    }

    private static class TestNewsChannel implements Observer {
        private final String name;
        private String lastNews;

        public TestNewsChannel(String name) {
            this.name = name;
        }

        @Override
        public void update(String news) {
            this.lastNews = news;
        }

        public String getLastNews() {
            return lastNews;
        }
    }
}
