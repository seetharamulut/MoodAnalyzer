package com;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        try {
            if (message.contains(" ")){
                throw new MoodAnalyzerException("please enter proper mood", MoodAnalyzerException.ExceptionType.ENTERED_EMPTY);
            }
            if (message.contains("Im in sad mood")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException("please enter proper mood", MoodAnalyzerException.ExceptionType.ENTERED_NULL);
        }
    }
}

