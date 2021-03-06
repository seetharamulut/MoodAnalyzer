package com;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void whenSadMessage_shouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Im in sad mood");
        String actualMessage = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Sad", actualMessage);
    }
    @Test
    public void whenHappyMessage_shouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Im in happy mood");
        String actualMessage = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Happy", actualMessage);
    }
    @Test
    public void WhenHappyMessage_shouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("null");
        try {
            moodAnalyzer.analyzeMood();
        } catch (MoodAnalyzerException ex) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL, ex.exceptionType);
        }
    }
        @Test
        public void WhenHappyMessage_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(" ");
            try {
                moodAnalyzer.analyzeMood();
            } catch (MoodAnalyzerException ex) {
                Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, ex.exceptionType);
            }
        }
}
