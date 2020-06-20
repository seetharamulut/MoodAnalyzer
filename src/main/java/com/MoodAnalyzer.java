package com;

public class MoodAnalyzer {
    String message;
    public MoodAnalyzer(String message){
        this.message = message;
    }
    public String analyzeMood() {
            if (message.contains("Im in sad mood")) {
                return "Sad";
            } else {
                return "Happy";
            }

        }
    }

