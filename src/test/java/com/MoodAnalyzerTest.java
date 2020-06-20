package com;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void whenSadMessage_shouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actualMessage = moodAnalyzer.analyzeMood("Sad");
        Assert.assertEquals("Sad", actualMessage);
    }
    @Test
    public void whenHappyMessage_shouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actualMessage = moodAnalyzer.analyzeMood("Happy");
        Assert.assertEquals("Happy", actualMessage);
    }
}
